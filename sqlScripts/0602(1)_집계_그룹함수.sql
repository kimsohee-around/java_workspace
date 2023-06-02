/* 참고 : 집계(통계) 함수 - 개수, 합계, 평균, 최대,최소
	SELECT count(*) FROM TBL_BUY tb ;	   -- 행의 개수. 컬럼을 지정안하고 *
	SELECT sum(QUANTITY) FROM TBL_BUY tb ;
	SELECT avg(QUANTITY) FROM TBL_BUY tb ;
	SELECT max(QUANTITY) FROM TBL_BUY tb ;
	SELECT min(QUANTITY) FROM TBL_BUY tb ;
   주의 (중요) : 집계함수로 select 할 때에는 다른 컬럼은 조회 불가.	
*/

SELECT * FROM TBL_SCORE ts ;
 
-- 1. 테이블 행의 전체 개수
SELECT count(*)  AS "행 전체개수"
FROM TBL_SCORE ts ;

-- 2. `국어` 과목의 전체 개수
SELECT count(*)  AS "국어 과목 행 개수"
FROM TBL_SCORE ts 
WHERE SUBJECT ='국어';
-- 오류: 집계함수로 select 할 때에는 다른 컬럼은 조회 불가.-> 그룹 함수로 사용하면 가능합니다.
SELECT SUBJECT , count(*)  AS "국어 과목 행 개수"
FROM TBL_SCORE ts 
WHERE SUBJECT ='국어';

-- 3. `국어` 과목의 점수 합계
SELECT sum(JUMSU)  AS "국어 과목 점수 합계"
FROM TBL_SCORE ts 
WHERE SUBJECT ='국어';

-- 4. `국어` 과목의 점수 평균. 소수점 이하 반올림
SELECT 
--	round(avg(JUMSU),0)  
	round(avg(JUMSU))	-- 자리수 0일때는 생략 가능  
	AS "국어 과목 점수 합계"
FROM TBL_SCORE ts 
WHERE 
	SUBJECT ='국어';

-- 5.  전체 수강 점수 개수, 합계, 평균
SELECT 
	count(*) AS "점수 전체 개수",
	sum(JUMSU) AS "전체 총점",
	ROUND(AVG(JUMSU),2)  AS "전체 평균" 
FROM 
	TBL_SCORE ts ;


-- 6.  `학번' 2019019 의 수강 점수 개수, 합계, 평균
SELECT 
	count(*) AS "점수 전체 개수",
	sum(JUMSU) AS "전체 총점",
	ROUND(AVG(JUMSU),2)  AS "전체 평균" 
FROM 
	TBL_SCORE ts 
WHERE 
	STUNO ='2019019';


/*
 * 집계함수는 그룹 함수라고도 합니다. 
 * 그룹화 - 행을 지정된 컬럼값을 동일한 것으로 합니다.
 * 		  집계함수는 그룹화하여 더 많이 사용합니다.
 * 
 * select 
 * 		그룹화컬럼, 그룹함수
 * from 테이블이름
 * [WHERE] 그룹화하기 이전의 조건식
 * GROUP BY 그룹화에 사용할 컬럼명
 * [HAVING] 그룹화 후에 사용하는 조건식
 * [ORDER BY] 정렬 컬럼
 */
SELECT * FROM TBL_SCORE ts ;
SELECT count(*)
FROM TBL_SCORE ts 
GROUP BY STUNO ;

SELECT STUNO , count(*)
FROM TBL_SCORE ts 
GROUP BY STUNO ;

SELECT STUNO ,
	SUBJECT ,   -- 오류: 그룹화에 사용한 컬럼이 아닙니다.
	count(*)
FROM TBL_SCORE ts 
GROUP BY STUNO ;

SELECT STUNO ,
	SUBJECT ,   
	count(*)
FROM TBL_SCORE ts 
GROUP BY STUNO , SUBJECT ;	-- stuno 로 1차 그룹화 하고, subject 가 같은 값들로 2차 그룹화

-- `학번`별로 수강 점수의 개수가 많은 순서부터 조회되도록 정렬해보세요.
SELECT  
		STUNO , 
		count(*) AS "학번별 개수"
FROM TBL_SCORE ts 
GROUP BY STUNO 
ORDER BY 
	"학번별 개수" DESC;	
--	count(*) desc;		-- 함수로 정렬 가능함.

-- `과목`별로 수강 점수의 개수가 많은 순서부터 조회되도록 정렬해보세요. 
SELECT  
		SUBJECT  , 					-- 조회한 컬럼만 2차 정렬 조건으로 할수 있음.
		count(*) AS "과목별 개수"
FROM TBL_SCORE ts 
GROUP BY SUBJECT 
ORDER BY 
	"과목별 개수" DESC, SUBJECT ;	


-- `학번`별로 수강 점수의 개수가 2 이상일 것을 조회되도록 정렬해보세요.
--  학번별 개수를 먼저 구해야합니다. -> 조건 where 으로는 못하고 having

SELECT  
		STUNO , 
		count(*) AS stucnt
FROM TBL_SCORE ts 
GROUP BY STUNO 
HAVING 
--	stucnt >=2		-- 별칭으로 조건을 만들 수 없습니다.
--	count(*) >=2		
	count(*) >=2 AND stuno != '2021001'		
ORDER BY 
	stucnt DESC;

-- group by 하기 전에 사용할 수 있는 조건식
SELECT 
	STUNO , 
	count(*) AS stucnt
FROM TBL_SCORE ts 
WHERE 
	stuno != '2021001'	
GROUP BY stuno;

-- 문제 1) 학생별로 그룹화 하여 학번,개수,평균 을 조회합니다. 단, 평균이 80점 이상인 학생만 조회.
SELECT  
		STUNO , 
		count(*) AS stucnt,
		avg(jumsu) AS avg
FROM TBL_SCORE ts 
GROUP BY STUNO 
HAVING 
	avg(jumsu) >=80;

-- 문제 2) 1)번의 결과를 `학생`테이블과 join 하여 이름과 나이도 추가로 조회 합니다.
SELECT
	tss.STUNO , 
	groupScore.stucnt,   -- stucnt 로 해도 가능
	groupScore.stuavg, 
	name,				 -- tss.name 에서 tss 생략. 
	age
FROM
	TBL_STUDENT tss
JOIN 
	(  -- 서브쿼리
	SELECT  
		STUNO , 
		count(*) AS stucnt,
		avg(jumsu) AS stuavg
	FROM
		TBL_SCORE ts
	GROUP BY
		STUNO
	HAVING
		avg(jumsu) >= 80
	) groupScore
ON tss.stuno = groupScore.stuno;


-- 오라클은 서브쿼리로 사용될 조회 결과를 미리 저장 가능.버퍼에 저장하는 방식으로 성능을 높일 수 있습니다.
-- with 별칭 as (서브쿼리)

WITH grpScore 
AS
(
	SELECT  
		STUNO , 
		count(*) AS stucnt,
		avg(jumsu) AS stuavg
	FROM
		TBL_SCORE ts
	GROUP BY
		STUNO
	HAVING
		avg(jumsu) >= 80
)
SELECT
	tss.STUNO , 
	grpScore.stucnt,   -- stucnt 로 해도 가능
	grpScore.stuavg, 
	name,				 -- tss.name 에서 tss 생략. 
	age
FROM
	TBL_STUDENT tss
JOIN 
	grpScore
ON tss.stuno = grpScore.stuno;	










