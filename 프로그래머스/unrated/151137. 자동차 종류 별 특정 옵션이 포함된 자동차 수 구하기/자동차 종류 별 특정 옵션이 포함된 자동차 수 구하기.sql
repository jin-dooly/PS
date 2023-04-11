-- 코드를 입력하세요
SELECT CAR_TYPE, COUNT(car_id) AS CARS
FROM CAR_RENTAL_COMPANY_CAR
#WHERE options REGEXP '통풍시트|열선시트|가죽시트'
WHERE options LIKE '%시트%'
GROUP BY car_type
ORDER BY car_type;