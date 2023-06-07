-- 2. 데이터베이스 테이블 데이터가 외부 다른 형식로 변경 가능합니다.
--    데이터 `가져오기` : import  예시)csv 파일 데이터를 테이블로 변환
--    내보내기 : export   예시)테이블 데이터를 csv 파일로 변환
-- 	  import 와 export 는 sql 명령이 있으나 디비버 메뉴로 하겠습니다.
-- 	  [Tables] 항목 클릭 - 오른쪽 버튼 메뉴 [데이터 가져오기]
-- 3. 뷰 , 인덱스
-- jdbc 후에 추가로 진도 내용 : 프로시저(함수) , 트리거

SELECT count(*) FROM AAC_INTAKES ai ;				-- 80187 개 
SELECT count(DISTINCT animal_id) FROM AAC_INTAKES ai ;    --72365 개. 
-- animal_id 가 중복된 값은 있어요. null 은 없습니다.
SELECT count(animal_id) FROM AAC_INTAKES ai ;		-- 80817 개

SELECT * FROM AAC_INTAKES ai 
WHERE ANIMAL_ID ='A738040'; 		-- 실행시간을 알아봅시다.

-- 인덱스 만들어주기
CREATE INDEX animal_idx 
ON aac_intakes(animal_id);

-- 책 앞에 목차.책 맨뒤에는 주요 키워드가 있는 페이지 번호가 있습니다.
-- 테이블의 인덱스는 특정컬럼값을 key , 컬럼값의 행이 저장된주소는 value 로 구성
-- 인덱스가 없다면 순차 검색. 
-- 검색 기능(=)을 향상시키기 위한 목적으로 만들어집니다.컬럼값이 unique 에 가까울 수록.
-- PK 컬럼은 자동으로 인덱스로 만들어집니다. 인덱스도 복합컬럼으로 만들어 질수 있습니다.
CREATE INDEX animal_idx2
ON aac_intakes(animal_type,color);

-- 인덱스 생성 전과 후 실행시간 비교해보기
SELECT * FROM AAC_INTAKES ai 
WHERE ANIMAL_TYPE ='Cat' AND color ='Brown';

-- 인덱스 삭제
DROP INDEX animal_idx2;


-- 뷰를 생성해 봅니다.
-- 주의 : 권한 확인
SELECT * 
FROM ROLE_SYS_PRIVS;	-- 오라클이 db관리를 위해 필요한 테이블
-- create view 권한은 없음.
-- SQL> grant create view to iclass;  실행 필요.  디비버에서 재연결

CREATE VIEW v_test		-- 조인 결과 SELECT 로 가상(논리적) 테이블을 생성
AS		
SELECT 
tsc.stuno, subject,name,jumsu,teacher	 -- * 모든 컬럼 지정하면 오류
FROM TMP_SCORE tsc 		-- 물리적 테이블
JOIN TMP_STUDENT ts     -- 물리적 테이블
ON tsc.stuno = ts.stuno;		-- 조인

-- 테스트
SELECT * 
FROM TMP_SCORE tsc 		-- 물리적 테이블A
JOIN TMP_STUDENT ts     -- 물리적 테이블B
ON tsc.stuno = ts.stuno;		-- 조인

SELECT count(*) FROM v_test;
SELECT stuno, jumsu FROM v_test;

-- view 를 대상으로 insert,update,delete 할수 있나요?
--	ㄴ 한개의 물리적테이블로 뷰를 만들었을 때만 가능.

-- 지금까지 우리는 오라클의 DB 객체  테이블, 시퀀스, 인덱스, 뷰를 사용했습니다.

