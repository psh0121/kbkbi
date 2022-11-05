-- usertbl에 있는 모든 컬럼을 가져와라
select *
from usertbl;

-- 이름이 바비킴인 사람의 mobile1을 010으로 바꿔보자
update usertbl 
set mobile1='010' 
where name='바비킴';

-- userID가 JYP인 사람의 주소를 서울로 바꿔보자
update usertebl
set addr='서울'
where userID='JYP';

-- userID가 JYP인 사람의 전화번호와 userID를 알아보자
select userID, mobile1, mobile2
from usertbl
where userID='JYP';

-- 이름이 조관우인 사람의 이름과 전화번호를 알아보자
select name, mobile1, mobile2
from usertbl
where name='조관우';

-- userID가 PSH인 사람의 데이터를 삭제하시오
delete from usertbl
where userID='PSH';

-- 키가 175이상인 회원을 조회한다
select *
from usertbl
where height >= 175;

-- 1980년 이후 출생인 회원을 조회한다
select *
from usertbl
where birthYear >= 1980;

-- 키가 175이상이고 1980년 이후 출생인 회원을 조회한다
select *
from usertbl
where height >= 175 and birthYear >= 1980;

-- 키가 175이상이고 1980년 이후 출생인 회원의 전화번호를 조회한다
select name, mobile1, mobile2
from usertbl
where height >= 175 and birthYear >= 1980;

-- 키가 180~183인 회원을 조회
select *
from usertbl
where height >= 180 and height <= 183;

select *
from usertbl
where height between 180 and 183;

-- addr이 서울이나 경기에 사는 회원을 조회
select *
from usertbl
where addr='서울' or addr='경기';

select *
from usertbl
where addr in ('서울', '경기');

-- userID가 L로 시작하는 회원의 정보를 조회
-- like는 문자열을 분석해야 하기 떄문에 복잡한 like연산이 들어갈 경우 느리다.
select *
from usertbl
where userID like 'L%';

-- 011전화번호를 가진 회원의 아이디와 이름 조회
select userID, name
from usertbl
where mobile1 = '011';

-- 1970년 이후에 출생했거나 신장이 182 인 회원의 아이디와 이름 조회
select userID, name
from usertbl
where birthYear >= 1970 or height = 182;

-- 서울출신 이고 010 또는 011전화번호를 사용하는 회원 조회
select *
from usertbl
where addr = '서울' and (mobile1 in ('010', '011'));

-- price가 100보다 작은 제품의 제품명 조회
select prodName, price
from buytbl
where price < 100;

-- userID의 가운데 글자가 B인 회원을 조회
select *
from usertbl
where userID like '_B_';