-- 오라클은 `시퀀스`라는 객체를 사용하여 자동증가 되는 값을 만듭니다.
-- sequence : 행을 식별할 목적으로 일련번호 컬럼을 만들었을 때 값은 시퀀스로 부여하기
-- MYSQL DBMS 에서는 auto increment (자동 증가) 속성을 설정할 수 있습니다.

-- 오라클에서 dual 이름의 임시(더미)테이블 1개 행, 1개 컬럼으로 특정 수식,함수 값 결과 테스트 목적.
SELECT 199+1
FROM dual;

-- 시퀀스 생성하기 (시퀀스 이름은 식별자로 개발자 정하기)
CREATE SEQUENCE test_seq;

-- 시퀀스 삭제하기
DROP SEQUENCE test_seq;

-- 시퀀스 함수 : nextval(다음 시퀀스 값), currval(현재 시퀀스 값)
SELECT test_seq.nextval
FROM dual;				-- test_seq 이름의 시퀀스가 갖는 다음 값 조회
SELECT test_seq.currval
FROM dual;				-- 단, 처음 1번은 먼저 nextval을 꼭 실행해야 currval 값을 조회합니다.

-- 1) tbl_buy에 사용될 시퀀스를 새로 만듭시다.
CREATE SEQUENCE tblbuy_seq
		START WITH 1001;		-- 시작값 지정

DROP SEQUENCE tblbuy_seq;  --  필요시 삭제 후 다시 생성
-- 2) tbl_buy 의 데이터 모두 제거하기
TRUNCATE TABLE tbl_buy;		
-- 3) 7개의 insert 를 시퀀스로 하기
INSERT INTO TBL_BUY 
VALUES (tblbuy_seq.nextval, 'mina012' , 'CJBAb12g' , 5,to_date('2022-03-10 14:33:15','yyyy-mm-dd hh24:mi:ss'));
INSERT INTO TBL_BUY 
VALUES (tblbuy_seq.nextval, 'mina012' , 'APLE5kg' , 2,to_date('2022-03-10 14:33:15','yyyy-mm-dd hh24:mi:ss'));
INSERT INTO TBL_BUY 
VALUES (tblbuy_seq.nextval, 'mina012' , 'JINRMn5' , 2,to_date('2022-03-16 10:13:15','yyyy-mm-dd hh24:mi:ss'));
INSERT INTO TBL_BUY 
VALUES (tblbuy_seq.nextval, 'twice' , 'JINRMn5' , 3 ,to_date('2021-12-25 19:32:15','yyyy-mm-dd hh24:mi:ss'));
INSERT INTO TBL_BUY 
VALUES (tblbuy_seq.nextval, 'twice' , 'MANGOTK4r' , 2 ,to_date('2021-12-25 19:32:15','yyyy-mm-dd hh24:mi:ss'));
INSERT INTO TBL_BUY 
VALUES (tblbuy_seq.nextval, 'hongGD' , 'DOWON123a' , 1 ,to_date('2021-10-21 11:13:25','yyyy-mm-dd hh24:mi:ss'));
INSERT INTO TBL_BUY 
VALUES (tblbuy_seq.nextval,  'hongGD' , 'APLE5kg' , 1 ,to_date('2021-10-21 11:13:25','yyyy-mm-dd hh24:mi:ss'));		

SELECT *
FROM tbl_buy;
