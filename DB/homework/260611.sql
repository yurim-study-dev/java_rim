show databases;

-- board db라는 데이터베이스 생성
create database board_db;

-- 생성한 데이터베이스로 전환하여 이후 쿼리가 해당 데이터베이스를 대상으로 실행되도록 설정
USE board_db;

-- 필요 없는 board_db 데이터베이스 삭제 (삭제 시 내부의 모든 테이블과 데이터가 영구히 소멸되므로 주의 필요)
DROP DATABASE board_db;

-- 회원 테이블 삭제
drop table member;

-- 회원 테이블 생성
create table member (
                        id int auto_increment primary key,
                        email varchar(100) not null unique,
                        password varchar(255) not null,
                        name varchar(100) not null,
                        created_at datetime default CURRENT_TIMESTAMP
);

-- 회원 테이블의 데이터 추가
insert into member (email, password, name) values ('haru@gmail.com','123','하루');
insert into member (email, password, name) values
                                               ('name@gmail.com','456','나무'),
                                               ('yong@gmail.com','111','용쌤'),
                                               ('harong@gmail.com','223','하롱이');


-- 회원 테이블의 모든 레코드 조회 (Read)
select id, email, password, name, created_at from member;

-- 회원 테이블의 레코드를 수정 (Update)
update member set password = 123 where id =3;


-- 회원 테이블의 레코드 삭제 (Delete)
delete from member where id = 1;

-- 회원 테이블 전체 조회
select * from member;


-- 260611 실습 과제!!!
-- 게시글 테이블 CRUD

-- 게시글 테이블 생성
create table post (
                      id int auto_increment primary key,
                      userid int,
                      title varchar(100) not null,
                      content varchar(100) not null,
                      created_at datetime default CURRENT_TIMESTAMP,

                      foreign key (userid) references member(id)

);


-- 게시글 테이블 데이터 삽입
insert into post (userid,title, content) values
                                             (1,'안녕하세요.','반가워요'),
                                             (2,'질문 있어요.','DB는 어렵나요?'),
                                             (3,'두번째 게시글','오늘 날씨가 좋네요'),
                                             (4,'MYSQL 설치 오류가 났어요','어떻게 할까요?'),
                                             (3,'자기소개','안녕하세요. 용쌤입니다.');

delete from post;

-- 게시글 테이블 조회(전체)
select * from  post;



-- 게시글 테이블에서 id=5 인 제목과 내용 조회
select title,content from post where id=16;



-- 댓글 테이블 CRUD

-- 댓글 테이블 생성
create table comments(
                         id int auto_increment primary key,
                         postid int,
                         userid int,
                         content varchar(100) not null,
                         created_at datetime default CURRENT_TIMESTAMP,

                         foreign key (postid) references post(id),
                         foreign key (userid) references member(id)
);


-- 댓글 테이블 데이터 삽입
insert into comments (postid, userid, content) value
    (26, 1, '환영합니다'),
    (27, 2, '반가워요'),
    (28, 3, '오랜만에 보는 햇빛이네요'),
    (29, 4, '다시 설치하세요'),
    (30, 3, '다시 설치하는게 국룰입니다.');

-- 댓글 테이블 전체 조회
select * from comments;

-- 댓글테이블에서 id =2 내용 조회
select content from comments where id=2;



