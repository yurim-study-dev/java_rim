-- 회원 테이블에 데이터 추가(Create)
insert into member (email, password, name) values ('haru@gmail.com', '123', '하루');


insert into member (email, password, name) values
                                               ('namu@gmail.com', '456', '나무'),
                                               ('yong@gmail.com', '111', '용쌤'),
                                               ('harong@gmail.com', '223', '하롱이');

-- 회원 테이블의 모든 레코드 조회(Read)
select id, email, password, name, created_at from member;

-- 회원 테이블의 레코드 수정(Update)
update member set password=123 where id=3;

-- 회원 테이블의 레코드 삭제(Delete)
delete from member where id=1;


-- 게시글 테이블 CRUD

-- 댓글 테이블 CRUD
