
-- DML : 데이터 수정, 삭제는 조건식으로 실행하도록 하는 것이 기본입니다.
--		 전체 행에 대해 수정 또는 삭제하는 것은 위험한 작업.

-- update 테이블명 set 컬럼명=변경될값, 컬럼명=변경될값,.... where 조건식
--	

SELECT * FROM TBL_MEMBER tm ;

UPDATE
	TBL_MEMBER
SET
	JOIN_date = SYSDATE
WHERE
	mno = 9;		-- 예상:1개 행을 반영

UPDATE 
	TBL_MEMBER 
SET 
	email = 'guest@koreait.kr'
WHERE 
	email IS NULL;	-- 예상:2개 행을 반영

UPDATE 
	TBL_MEMBER 
SET 
	email = 'guest2@koreait.kr',mno=10		-- 2개의 컬럼을 값 수정
WHERE 
	mno=9;	-- 예상:1개 행 반영

DELETE FROM TBL_MEMBER tm 
WHERE mno=3; 

SELECT * FROM TBL_MEMBER tm ;

-- DML 명령 중에 데이터 변경과 관련된 insert, update, delete 는 ROLLBACK 을 할수 있습니다.
-- ROLLBACK 은 실행된 데이터입력,수정,삭제를 취소하는 명령. (트랜잭션 모드 autocommit을 OFF 일때만 가능.)
-- COMMIT 은  데이터 입력,수정,삭제를 최종 승인(트랜잭션 모드 autocommit을 OFF 일때만 가능.)


-- 트랜잭션의 commit 을 테스트하는 순서.
-- 1.새로운 데이터 입력
INSERT INTO TBL_MEMBER VALUES (2,'박나연','parkny@gmail.com','2022-10-24');
INSERT INTO TBL_MEMBER VALUES (3,'최슬기','slgichoi@naver.com','2021-09-24');

-- 2. 디비버에서 조회하기
SELECT * FROM TBL_MEMBER tm ;

-- 3. SQL plus 는 다른 사용자입니다. 다른 사용자가 조회하면 새로운 입력이 보이나요? 안 보입니다.
-- 이유는 데이터 입력한 디비버 사용자가 commit 을 안했습니다.

-- 4. 3번 상태에서 rollback
ROLLBACK;

-- 5. 디비버에서 조회하기
SELECT * FROM TBL_MEMBER tm ;


	