/*
 * 조인 : 2개의 테이블 열(데이터 항목)을 합치는 것
   예시로 `구매 테이블의 구매 수량, 구매날짜` 와 `회원 테이블의 회원 이름 , 이메일` 을 
   공통 컬럼 동등 조건으로 합치기

 * union  연산자 : 2개 테이블의 행(데이터 값)을 합치는 것
 */

-- 타입(형식)이 일치하는 2개의 컬럼을 선택해서 행 합치기. 타입 불일치하는 컬럼을 선택하면 오류.
SELECT 
	NAME ,
	EMAIL		-- 1) varchar2
--	REG_DATE    -- 두번째 테이블과 타입 불일치 오류
FROM
	TBL_CUSTOM tc
UNION ALL
SELECT
	PCODE , PNAME	-- 2) 선택되는 컬럼형식과 개수가 1)과 일치 - varchar2
FROM
	TBL_PRODUCT tp; 

-- 컬럼의 개수가 다른 경우
-- 2개 테이블 중 컬럼이 부족한 것을 null 로 채워서 합치기
SELECT 
	NAME ,EMAIL , REG_DATE 
FROM
	TBL_CUSTOM tc
UNION ALL
SELECT
	PCODE , PNAME , NULL 
FROM
	TBL_PRODUCT tp; 


-- 프로그래머스 문제 풀이: 오프라인/온라인 판매데이터 통합하기(lv.4)
-- 1) union 연산으로 행 합치기 -> 결과 확인해보세요.
-- 2) 조건을 적용하기 위해 새로운 작업이 필요합니다. -> 같이 할께요~
SELECT
   -- 정렬할 컬럼이므로 별칭을 줍니다.
   TO_CHAR(SALES_DATE,'yyyy-mm-dd') as SALES_DATE,      
   PRODUCT_ID,USER_ID,SALES_AMOUNT
FROM	
	-- SQL 안에 다른 SQL 결과를 사용할 때. 안에 있는 SQL을 서브쿼리라고 합니다.
    (
    SELECT
        SALES_DATE ,PRODUCT_ID,USER_ID,SALES_AMOUNT
    FROM ONLINE_SALE
        UNION ALL
    SELECT
        SALES_DATE ,PRODUCT_ID,NULL,SALES_AMOUNT
    FROM OFFLINE_SALE
    )    
WHERE    
    TO_CHAR(SALES_DATE,'yyyy-mm')='2022-03'
ORDER BY  
-- 첫 번쨰 정렬기준 컬럼은 패턴이 적용된 날짜로 합니다.
    SALES_DATE ,   
    PRODUCT_ID,USER_ID;


