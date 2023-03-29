-- 코드를 입력하세요
SELECT USED_GOODS_BOARD.title, 
    USED_GOODS_BOARD.board_id, 
    USED_GOODS_REPLY.reply_id, 
    USED_GOODS_REPLY.writer_id, 
    USED_GOODS_REPLY.contents, 
    DATE_FORMAT(USED_GOODS_REPLY.created_date, '%Y-%m-%d')
FROM used_goods_board
    INNER JOIN USED_GOODS_REPLY
    ON USED_GOODS_BOARD.board_id = USED_GOODS_REPLY.board_id
WHERE DATE_FORMAT(USED_GOODS_BOARD.created_date, '%Y-%m') = '2022-10'
ORDER BY USED_GOODS_REPLY.created_date, title;