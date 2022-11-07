-- JOIN 
select *
from booktbl left join authortbl
on booktbl.author_id = authortbl.author_id;

-- 책제목, 저자 아이디, 저자이름, 저자의 직업
select title, booktbl.author_id, name, job 
from booktbl left join authortbl 
on booktbl.author_id = authortbl.author_id;

-- 홍길동이라는 이름을 가진 책아이디, 책제목, 작가아이디, 작가이름, 작가직업 조회
-- (단, 조건은 job_title을 "직업"이라고 컬럼명을 변경)
select bookbook_id, title, booktbl.author_id, name, job as '직업' 
from booktbl left join authortbl 
on booktbl.author_id = authortbl.author_id 
where name = '홍길동';

-- 작가가 없는 책 테이블에 넣기
insert into booktbl values (6, '주인없는 책', '작가가 없어도 책은 나온다', null);

-- left join : 옆에 맵핑할 데이터가 없어도 데이터를 join해 가져온다.
select *
from booktbl left join authortbl
on booktbl.author_id = authortbl.author_id;

-- inner join : 교집합의 의미, 외래키를 기준으로 각테이블에 정보가 있는 데이터만 join해 가져온다.
select *
from booktbl inner join authortbl
on booktbl.author_id = authortbl.author_id;