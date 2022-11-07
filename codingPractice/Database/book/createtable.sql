-- 테이블 생성
create table authortbl
(
	author_id int not null primary key,
    name varchar(20) not null,
    city varchar(10),
    job varchar(20),
    job_desc varchar(100)
);

create table booktbl
(
	book_id int not null primary key,
    title varchar(40) not null,
    book_desc varchar(100),
    author_id int not null,
    foreign key (author_id) references authortbl(author_id)
);

-- 데이터 삽입
insert into authortbl values (1, '홍길동', '서울', '도적', '동해번쩍 서해번쩍');
insert into authortbl values (2, '이순신', '조선', '장군', '내죽음을 적에게 알리지마라');
insert into authortbl values (3, '임꺽정', '양주', '도적', null);

insert into booktbl values (1, '홍길동전', '홍길동의 일생을 담은 스토리', 1);
insert into booktbl values (2, '이순신전', '이순신의 일생을 담은 스토리', 2);
insert into booktbl values (3, '임꺽정1', '임꺽정의 일생을 담은 스토리1', 3);
insert into booktbl values (4, '임꺽정2', '임꺽정의 일생을 담은 스토리2', 3);
insert into booktbl values (5, '임꺽정3', null, 3);