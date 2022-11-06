-- 김경호보다 키가 큰 회원 정보를 조회해라
select *
from usertbl
where height > (select height from usertbl where name='김경호');

-- 경남에서 사는 사람들보다 키가 큰 사람을 조회해라
-- ANY(=or)
select *
from usertbl
where height > any(select height from usertbl where addr='경남');

-- ALL(=and)
select *
from usertbl
where height > all(select height from usertbl where addr='경남');

-- 정렬 order by
select *
from usertbl
order by mDate;

select *
from usertbl
order by mDate asc;

select *
from usertbl
order by mDate desc;

-- 중복제거 distinct
select distinct addr
from usertbl;