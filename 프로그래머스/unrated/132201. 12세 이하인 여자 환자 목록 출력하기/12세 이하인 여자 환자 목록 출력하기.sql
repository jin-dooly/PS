-- 코드를 입력하세요
SELECT PT_NAME, PT_NO, GEND_CD, AGE, IFNULL(tlno, "NONE") as TLNO from PATIENT
where AGE<13 AND GEND_CD = "w"
order by AGE desc, PT_NAME;