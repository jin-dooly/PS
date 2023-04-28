-- 코드를 입력하세요
SELECT i.rest_id, i.rest_name, i.food_type, i.favorites, i.address, round(avg(r.review_score),2) as score
FROM rest_info as i, rest_review as r
where i.rest_id = r.rest_id
    and i.address like '서울%'
group by i.rest_id
order by score desc, favorites desc