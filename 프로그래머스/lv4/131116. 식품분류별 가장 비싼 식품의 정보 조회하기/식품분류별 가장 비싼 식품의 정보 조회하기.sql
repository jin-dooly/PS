-- 코드를 입력하세요
SELECT category, max(price) as max_price, product_name
from food_product
where category regexp '과자|국|김치|식용유'
    and price IN (SELECT MAX(price) FROM food_product GROUP BY category)
group by category
order by max_price desc