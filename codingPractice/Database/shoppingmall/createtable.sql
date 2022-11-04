-- 테이블 생성
create table usertbl 					-- 회원테이블
(
	userID char(20) not null primary key,		-- 아이디
    	name varchar(20) not null,			-- 이름
    	birthYear int not null,				-- 생년
    	addr char(2) not null,				-- 지역
	mobile1 char(3),				-- 국번
    	mobile2 char(8),				-- 전화번호
    	height smallint,				-- 키
    	mDate date					-- 가입일
);

create table buytbl					-- 구매테이블
(
	num int not null primary key auto_increment,	-- 순번
   	userID char(20) not null,			-- 아이디
    	prodName varchar(20) not null,			-- 품명
    	groupName char(4),				-- 분류
    	price int not null,				-- 단가
    	amount smallint not null,			-- 수량
    	foreign key (userID) references usertbl(userID)
);


-- 데이터 입력
INSERT INTO usertbl VALUES ('PSH', '박봉봉', 1997, '인천', '010', '12345678', 167, '1997-12-12');

INSERT INTO usertbl VALUES ('LSG', '이승기', 1987, '서울', '011', '11111111', 182, '2008-8-8');
INSERT INTO usertbl VALUES ('KBS', '김범수', 1979, '경남', '011', '22222222', 173, '2012-4-4');
INSERT INTO usertbl VALUES ('KKH', '김경호', 1971, '전남', '019', '33333333', 177, '2007-7-7');
INSERT INTO usertbl VALUES ('JYP', '조용필', 1950, '경기', '011', '44444444', 166, '2009-4-4');
INSERT INTO usertbl VALUES ('SSK', '성시경', 1979, '서울', NULL, NULL, 186, '2013-12-12');
INSERT INTO usertbl VALUES ('LJB', '임재범', 1963, '서울', '016', '66666666', 182, '2009-9-9');
INSERT INTO usertbl VALUES ('YJS', '윤종신', 1969, '경남', NULL, NULL, 170, '2005-5-5');
INSERT INTO usertbl VALUES ('EJW', '은지원', 1972, '경북', '011', '88888888', 174, '2014-3-3');
INSERT INTO usertbl VALUES ('JKW', '조관우', 1965, '경기', '018', '99999999', 172, '2010-10-10');
INSERT INTO usertbl VALUES ('BBK', '바비킴', 1973, '서울', '010', '00000000', 176, '2013-5-5');

INSERT INTO buytbl VALUES (NULL, 'KBS', '운동화', NULL, 30, 2);
INSERT INTO buytbl VALUES (NULL, 'KBS', '노트북', '전자', 1000, 1);
INSERT INTO buytbl VALUES (NULL, 'JYP', '모니터', '전자', 200, 1);
INSERT INTO buytbl VALUES (NULL, 'BBK', '모니터', '전자', 200, 5);
INSERT INTO buytbl VALUES (NULL, 'KBS', '청바지', '의류', 50, 3);
INSERT INTO buytbl VALUES (NULL, 'BBK', '메모리', '전자', 80, 10);
INSERT INTO buytbl VALUES (NULL, 'SSK', '책', '서적', 15, 5);
INSERT INTO buytbl VALUES (NULL, 'EJW', '책', '서적', 15, 2);
INSERT INTO buytbl VALUES (NULL, 'EJW', '청바지', '의류', 50, 1);
INSERT INTO buytbl VALUES (NULL, 'BBK', '운동화', NULL, 30, 2);
INSERT INTO buytbl VALUES (NULL, 'EJW', '책', '서적', 15, 1);
INSERT INTO buytbl VALUES (NULL, 'BBK', '운동화', NULL, 30, 2);






