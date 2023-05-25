-- SQL : Structured Query Language (구조화된 질의 언어)
-- 		 1) DML - 데이터 추가,삭제,수정,조회 명령(insert,delete,update,select)
-- 		 2) DDL - 데이터를 저장할 테이블 또는 사용자 등등 오라클의 객체 생성/삭제 명령(create,alter,drop)
--		 3) DCL - 계정 등등 데이터를 다루는데 필요한 기능을 실행 명령(grant, revoke)

-- DDL : 1. 테이블 생성
CREATE TABLE tblTest (    --tblTest 이름의 테이블 만들기
	-- 테이블을 구성하는 컬럼을 정의
	tid NUMBER,				-- 정수 또는 실수
	name varchar2(100)		--최대 100바이트 크기의 문자열
);


-- DDL : 2. 테이블 제거
DROP TABLE TBLTEST ;

-- 문자열 형식 테스트
-- CHAR(길이) : 고정길이 , 단위는 바이트 
-- VARCHAR(길이) : 오라클에서 존재하지만 사용하지 않는 예비자료형.
-- VARCHAR2(길이) : 가변형길이 단위 바이트, 길이는 최대길이이고 실제로 메모리는 데이터크기만큼 사용합니다.
--				최대 2000바이트입니다. UTF-8 인코딩에서 한글은 3바이트, 영문/숫자/기호는 1바이트
-- 고정길이는 지정된 만큼 기억공간을 차지합니다. 가변길이는 데이터크기만큼 기억공간 사용하고 최대 크기로 제한.
CREATE TABLE tbl_string(
	acol char(10),			-- 10 바이트 고정길이 : 데이터를 꼭 10바이트에 저장.
	bcol varchar2(10),		-- 10 바이트 가변길이 : 데이터 크기에 따라 정해진다.(최대 10바이트)
	ccol nchar(10),			-- 10개 문자 고정길이
	dcol nvarchar2(10)		-- 10개 문자 가변길이
);

-- DML : 1. 테이블에 데이터 추가
--INSERT INTO 테이블명 (컬럼명,컬럼명,....) VALUES (컬럼순서에 대응되는 값,값,...);
-- 고정길이 형식은 지정된 길이를 맞추기 위해 공백을 추가
-- 1) 고정길이가 바이트로 지정된 컬럼
INSERT INTO TBL_STRING (acol) VALUES ('abcd');
INSERT INTO TBL_STRING (acol) VALUES ('abcd123456');
INSERT INTO TBL_STRING (acol) VALUES ('abcd1234567');	-- 오류
INSERT INTO TBL_STRING (acol) VALUES ('가나');			-- 한글은 1글자가 3바이트
INSERT INTO TBL_STRING (acol) VALUES ('가나다');
INSERT INTO TBL_STRING (acol) VALUES ('가나다라');			-- 오류
-- 2) 고정길이가 문자로 지정된 컬럼
-- 위의 6개 insert 를 ccol 으로 insert 실행하기
INSERT INTO TBL_STRING (ccol) VALUES ('abcd');
INSERT INTO TBL_STRING (ccol) VALUES ('abcd123456');
INSERT INTO TBL_STRING (ccol) VALUES ('abcd1234567');	-- 오류
INSERT INTO TBL_STRING (ccol) VALUES ('가나');			
INSERT INTO TBL_STRING (ccol) VALUES ('가나다');
INSERT INTO TBL_STRING (ccol) VALUES ('가나다라');

--3) 가변길이 바이트로 지정된 컬럼
INSERT INTO TBL_STRING (bcol) VALUES ('abcd');
INSERT INTO TBL_STRING (bcol) VALUES ('abcd123456');
INSERT INTO TBL_STRING (bcol) VALUES ('abcd1234567');	-- 오류
INSERT INTO TBL_STRING (bcol) VALUES ('가나');			
INSERT INTO TBL_STRING (bcol) VALUES ('가나다');
INSERT INTO TBL_STRING (bcol) VALUES ('가나다라');		-- 오류

--4) 가변길이 문자로 지정된 컬럼
INSERT INTO TBL_STRING (dcol) VALUES ('abcd');
INSERT INTO TBL_STRING (dcol) VALUES ('abcd123456');
INSERT INTO TBL_STRING (dcol) VALUES ('abcd1234567');	-- 오류
INSERT INTO TBL_STRING (dcol) VALUES ('가나');			
INSERT INTO TBL_STRING (dcol) VALUES ('가나다');
INSERT INTO TBL_STRING (dcol) VALUES ('가나다라');	


-- DDL : 3. 테이블의 모든 행 삭제
TRUNCATE TABLE TBL_STRING ;

