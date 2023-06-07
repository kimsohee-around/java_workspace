
-- 12세 이하인 여자 환자 목록 출력
--     CASE
--         WHEN TLNO IS NULL THEN 'NONE'
--         ELSE TLNO
--     END TLNO
--   위의 CASE 문을 대신하는 null value 함수 NVL 사용하기, 아래 CASE 문은 함수 DECODE 사용하기
--     CASE GEND_CD
--         WHEN 'W' THEN '여성'
--         WHEN 'M' THEN '남성'
--     END TLNO
SELECT 
    PT_NAME, 
    PT_NO, 
    DECODE(GEND_CD,'W','여성','M','남성') 
    AGE,
    NVL(TLNO,'NONE') TLNO
FROM PATIENT 
WHERE AGE <= 12 and GEND_CD ='W'
ORDER BY AGE DESC, PT_NAME;


SELECT count(*) FROM "TBL_TEST#" tt ;	-- 모든 행의 개수
-- tno 컬럼이 NULL 이 아닌 행의 개수
SELECT count(tno) FROM "TBL_TEST#" tt ;  
-- tno 컬럼의 중복을 제거하고 null 이 아닌 행의 개수
SELECT count(DISTINCT tno) FROM "TBL_TEST#" tt ; 


