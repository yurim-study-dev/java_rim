-- 회원 이름과 이메일을 결합해서 조합
SELECT name,email, CONCAT(name, ' (', email, ')') AS member_info
    FROM member;

-- 각 회원의 이메일 바이트 크기 조회
SELECT email, LENGTH('hello'), LENGTH('안녕하세요'),LENGTH(email) AS email_length
    FROM member;

-- 게시글 본문 중 '안녕하세요'가 있는 내용을 찾아서 HI 로 수정 
select content,replace(content,'안녕하세요','HI') as replaced_content
from post
where content like '%안녕하세요%';


-- 게시글 본문의 첫 10글자만 미리보기로 가져오기 (잘린 뒷 부분은 ...으로 표시하세요.)

SELECT title, CONCAT(SUBSTRING(title, 1, 10), '...') AS preview
FROM post;

-- 이메일을 소문자, 대문자로 조회
select email, LOWER(email) as email_lower, UPPER(email) as email_upper
from member;


-- 이메일 앞뒤 공백 제거
select email, TRIM(email) as trimmed_email
from member;


-- 현재 날짜와 시간을 조회
select NOW() as current_datetime;


-- 게시글 작성일을 연-월-일 형태로 조회
select id,title,created_at, DATE_FORMAT(created_at,'%Y년 %m월 %d일 %a %H시 %i분 %s초') as write_date
from post;

-- 현재 날짜만 조회
select CURDATE() as curr_date;

-- 오늘 작성된 게시글만 조회
select id, title, created_at
from post
where created_at >= CURDATE();


-- 최근 7일 이내에 가입한 회원 조회
select id, name, created_at,CURDATE(),DATE_SUB(NOW(),interval 7 DAY) as before_7days
from member
where created_at >= DATE_SUB(NOW(),interval 7 DAY);

-- 가입한지 1개월이 지난 회원 조회
SELECT *, DATE_SUB(CURDATE(), INTERVAL 1 MONTH) AS before_1month
FROM MEMBER
WHERE created_at < DATE_SUB(CURDATE(), INTERVAL 1 MONTH);


-- 가입한지 35일 12시간이 지난 회원 조회
SELECT *, DATE_SUB(CURDATE(), INTERVAL '34 12' DAY_HOUR) AS before_1month
FROM MEMBER
WHERE created_at < DATE_SUB(CURDATE(), INTERVAL '34 12' DAY_HOUR);

-- 각 회원의 가입 경과일수를 조회 
select name, created_at, DATEDIFF(CURDATE(), created_at) as days_since_join
from member;


-- 모든 회원수 조회
select COUNT(*)
from member;

-- 모든 게시글 수 조회
select COUNT(*)
from POST;

-- id = 3 인 모든 게시글의 총 게시글 수 조회
select member_id ,COUNT(*) as total_count
from post
where member_id=3;

-- id =3 인 회원의 모든 게시글 조회
select member_id,view_count
from post
where member_id=3;


-- id = 3 인 회원의 모든 게시글의 총 조회수 
select member_id,SUM(view_count) as totl_views, AVG(view_count) as avg_views
,MIN(view_count) as min_views, MAX(view_count) as max_views
-- ,title
from post
where member_id=3;


-- 전화번호가 NULL 인 회원은 '미등록'으로 표시하여 조회
SELECT name, IFNULL(phone, '미등록') AS phone
    FROM member;

-- 전화번호가 NULL이면 이메일을, 이메일도 NULL이면 '연락처 없음'으로 표시
SELECT name, COALESCE(phone, email, '연락처 없음') AS contact
    FROM member;

-- 전화번호 등록 여부에 따라 상태를 표시하여 조회
SELECT name, IF(phone IS NULL, '연락처 없음', '연락처 등록') AS phone_status
    FROM member;


-- 회원 가입 연도에 따른 회원 등급 부여 조회
SELECT name, created_at, 
    CASE
        WHEN created_at < DATE_SUB(NOW(), INTERVAL 1 YEAR) THEN '우수 회원'
        WHEN created_at < DATE_SUB(NOW(), INTERVAL 1 MONTH) THEN '일반 회원'
        ELSE '신규 회원'
    END AS member_grade
    FROM member;




