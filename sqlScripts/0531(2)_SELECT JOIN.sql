

-- SELECT 의 JOIN : 둘 이상의 테이블(특히 참조관계)을 합치는 것.
-- 				join 후에 select 로 특정 컬럼 조회합니다.

-- 조인이 가능한 테이블 : 구매와 회원(공통컬럼 custom_id) 또는 구매와 상품(공통컬럼 pcode)
-- 형식 1 : where 의 조건식으로만
SELECT 
	*
FROM TBL_PRODUCT tp , 			-- tp는 테이블이름 줄여서 쓴 별칭
	TBL_BUY tb 					-- tb          "
WHERE 
	tp.PCODE = tb.PCODE ;		-- 상품.pcode = 구매.pcode (조인 조건식)
	
	
-- 8)` 회원 twice 가 구입한 상품명과 가격을 조회하세요.	
SELECT 
	PNAME , PRICE , 
	tb.QUANTITY * PRICE AS total		-- 조회 컬럼을 이용한 수식 사용. AS 뒤는 수식에 대한 별칭
FROM TBL_PRODUCT tp , 			-- tp는 테이블이름 줄여서 쓴 별칭
	TBL_BUY tb 					-- tb          "
WHERE 
	tp.PCODE = tb.PCODE 		-- 별칭은 필수. 어느테이블의 PCODE 인지 지정
AND 
	tb.CUSTOMID ='twice';		-- 별칭은 선택. customid 테이블은 구매 하나입니다.
	
-- 형식 2: join ~ on 키워드
SELECT 
	*
FROM TBL_PRODUCT tp			-- tp는 테이블이름 줄여서 쓴 별칭
JOIN TBL_BUY tb 					-- tb          "
ON 
	tp.PCODE = tb.PCODE ;

-- 조건 추가하기
SELECT 
	*
FROM TBL_PRODUCT tp			-- tp는 테이블이름 줄여서 쓴 별칭
JOIN TBL_BUY tb 					-- tb          "
ON 
	tp.PCODE = tb.PCODE 
--AND 
WHERE 	
	tb.CUSTOMID = 'twice';

-- 7)' 진라면 상품 코드 'JINRMn5' 를 구입한 __회원이름과 이메일__을 조회하세요.
-- 형식 1
SELECT 
	name,email
FROM 
	TBL_BUY tb ,
	TBL_CUSTOM tc 
WHERE 
	tb.CUSTOMID = tc.CUSTOM_ID 
AND 
	tb.PCODE ='JINRMn5'
	;


-- 형식 2
SELECT 
	NAME ,EMAIL 
FROM 
	TBL_BUY tb 
JOIN
	TBL_CUSTOM tc 
ON
	tb.CUSTOMID =tc.CUSTOM_ID 			-- 내부 조인 , 동등(equal) 조인
AND 	
	tb.PCODE ='JINRMn5'
ORDER BY 
	tb.BUY_DATE DESC ;

-- 참고 : 조인 조건식이 없다면???
SELECT * FROM TBL_BUY tb , TBL_PRODUCT tp ;			-- 크로스 조인 (가능한 조합으로 합치기)

SELECT * FROM TBL_CUSTOM tc  , TBL_PRODUCT tp ;

SELECT * FROM TBL_BUY tb JOIN TBL_PRODUCT tp ;		-- 오류 : ON 조건식 반드시 있어야 합니다.

-- 외부 조인














	