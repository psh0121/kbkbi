-- group by
-- 고객별로 제품을 구매한 개수를 조회한다.
select userID, sum(amount) as purchase
from buytbl
group by userID;

-- 고객별로 제품을 최소한 구매한 개수를 조회한다.
select userID, min(amount) as '최소구매 개수'
from buytbl
group by userID;

-- 사용자별로 1000원 이상 산 사람의 총 구매액을 조회한다.
select userID, sum(price*amount) as '구매총합'
from buytbl
group by userID
having sum(price*amount) > 1000;