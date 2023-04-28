-- 코드를 입력하세요
SELECT A.category, sum(B.sales) as total_sales
from book A join book_sales B on A.book_id = B.book_id
where sales_date like '2022-01%'
group by A.category
order by A.category;