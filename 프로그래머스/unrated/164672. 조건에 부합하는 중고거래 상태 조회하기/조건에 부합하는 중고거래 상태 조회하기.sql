-- 코드를 입력하세요
SELECT BOARD_ID, WRITER_ID, TITLE, PRICE,
  Case STATUS
    WHEN "SALE" THEN "판매중"
    WHEN "RESERVED" THEN "예약중"
    WHEN "DONE" THEN "거래완료"
  END AS STATUS
FROM used_goods_board
WHERE DATE(created_date)="2022-10-05"
ORDER BY board_id DESC;

