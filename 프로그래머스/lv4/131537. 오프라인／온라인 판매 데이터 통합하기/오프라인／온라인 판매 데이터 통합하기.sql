-- 코드를 입력하세요
SELECT DATE_FORMAT(sales_date, '%Y-%m-%d') as sales_date, product_id, user_id, sales_amount
from online_sale as A
where sales_date like '2022-03%'
union all
SELECT DATE_FORMAT(sales_date, '%Y-%m-%d') as sales_date, product_id, NULL as user_id, sales_amount
from offline_sale as B
where sales_date like '2022-03%'
order by sales_date, product_id, user_id;