show databases;

-- board_db라는 이름의 데이터베이스 생성
CREATE DATABASE board_db;

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

-- 게시글 테이블 생성

-- 댓글 테이블 생성
