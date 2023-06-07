-- 오늘 수업할 것.
-- 1. 외래키 옵션
-- 2. 데이터베이스 테이블 데이터가 외부 다른 형식로 변경 가능합니다.
--    데이터 가져오기와 내보내기
-- 3. 뷰 , 인덱스
-- jdbc 후에 추가로 진도 내용 : 프로시저(함수) , 트리거

-- 외래키 옵션
-- 외래키로 참조관계가 설정이되면 부모 테이블의 데이터가 삭제 시 오류
-- 옵션으로 다른 동작을 하도록 합니다.

-- 외래키 옵션 테스트 테이블 생성(서브쿼리 이용해서 select 조회 결과를 복사해서 테이블 생성)
-- pk,fk 는 복사되지 않습니다.
CREATE TABLE tmp_student
AS
SELECT * FROM TBL_STUDENT ts ;	-- 기본키 stuno

CREATE TABLE tmp_score
AS
SELECT * FROM TBL_SCORE ts ;	-- 기본키 (stuno,subject)

SELECT * FROM tmp_student;
SELECT * FROM tmp_score;

-- 외래키 옵션 테스트를 위해서 기본키를 만듭니다.(기본키 여부 확인 필요.)- alter table
-- 외래키가 참조하는 부모 테이블 컬럼은 pk 또는 unique 컬럼이어야 합니다.
ALTER TABLE TMP_STUDENT 
ADD
-- CONSTRAINT 제약조건이름 
PRIMARY KEY (stuno);

ALTER TABLE TMP_SCORE 
ADD
PRIMARY KEY (stuno,subject);

-- 외래키의 on delete 옵션 3가지 테스트 하기
-- 1. 아무것도 설정안한면 기본은 no action
ALTER TABLE TMP_SCORE 
ADD
CONSTRAINT score_fk
FOREIGN KEY (stuno) REFERENCES tmp_student(stuno);
-- 참조하는 부모테이블의 행을 삭제하기.(조건식은 참조컬럼 사용)
DELETE FROM TMP_STUDENT ts WHERE stuno = '2020017';  --오류:자식테이블이 참조하고 있음.

-- 다른 옵션 테스트를 위해서 외래키 삭제하기.
ALTER TABLE TMP_SCORE 
DROP
CONSTRAINT score_fk;

-- 2. cascade(계단식의) 
-- 부모테이블을 참조하고 있는 자식테이블의 `같은 값을 참조하고 있는`행을 삭제합니다.
ALTER TABLE TMP_SCORE 
ADD
CONSTRAINT score_fk
FOREIGN KEY (stuno) 
REFERENCES tmp_student(stuno)
ON DELETE cascade;			-- ON DELETE 옵션 설정

-- 데이터 삭제 테스트 후 다시 살리기 위해 트랜잭션 모드는 자동커밋 해제.
DELETE FROM TMP_STUDENT ts WHERE stuno = '2020017';
-- 학생과 성적 테이블 모두 2020017 행이 삭제됨.
SELECT * FROM TMP_STUDENT ts ;
SELECT * FROM TMP_SCORE ts ;

-- 데이터 원복
ROLLBACK;


-- 3. set null 
-- 외래키 컬럼이 기본키를 구성하는 컬럼 즉 `식별관계`일때는 동작 못합니다.
-- 비식별관계에서 외래키 컬럼이 null 허용이 된 경우에만 가능합니다.

-- 참조관계를 `비식별관계`로 하기 위해 기본키 컬럼 추가(기본 기본키 삭제하기)
ALTER TABLE TMP_SCORE 
ADD (score_no NUMBER(5));
-- score_no 컬럼에 중복되지 않는 값을 입력하고 아래와 같이 기본키 추가.
ALTER TABLE TMP_SCORE 
ADD PRIMARY KEY (score_no);

-- on delete 옵션 set null을 하려면 외래키 컬럼을 null 허용 확인.
-- 기존 외래키 삭제
ALTER TABLE TMP_SCORE 
DROP
CONSTRAINT score_fk;
-- 외래키 옵션 변경
ALTER TABLE TMP_SCORE 
ADD
CONSTRAINT score_fk
FOREIGN KEY (stuno) 
REFERENCES tmp_student(stuno)
ON DELETE SET NULL;			-- ON DELETE 옵션 설정

-- 데이터 삭제 테스트 후 다시 살리기 위해 트랜잭션 모드는 자동커밋 해제.
DELETE FROM TMP_STUDENT ts WHERE stuno = '2020017';

-- 학생과 성적 테이블 모두 2020017 행이 삭제됨.
SELECT * FROM TMP_STUDENT ts ;
SELECT * FROM TMP_SCORE ts ;

ROLLBACK;
COMMIT;

