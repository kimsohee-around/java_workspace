-- alter table 테이블명 [변경내용키워드] 변경할 내용: 
-- 1) 테이블 이름 변경 : rename to 
-- 2) *컬럼 이름 변경 : rename column 
-- 3) *새로운 컬럼 추가 : add
-- 4) *컬럼 데이터 형식 변경 : modify
-- 5) *기존 컬럼 삭제 : drop
-- 6) *제약 조건 추가 : add constraint  
-- 7) *기존 제약 조건 삭제 : drop constraint 제약조건이름


-- 예제 테이블
CREATE TABLE tbl_test# (
	tid varchar2(3) NOT NULL,
	tname varchar2(10) NOT NULL,
	etc varchar2(10),
	tno number(3)
);
-- 현재 데이터 모두(모든 행, 모든 컬럼) 조회

-- NOT NULL 제약 조건 테스트
INSERT INTO tbl_test#(tid,tname)
VALUES ('tes','테스트');

INSERT INTO tbl_test#(tid)		-- tname 컬럼은 NOT NULL 제약조건 위반 : 오류
VALUES ('te1');

-- 테이블 컬럼 이름 변경 : etc를 t_etc 로 변경하기
ALTER TABLE tbl_test# RENAME COLUMN etc TO t_etc;

-- 테이블 컬럼 추가 : tel 컬럼 추가하기
ALTER TABLE tbl_test# ADD (tel varchar2(20) DEFAULT '000-0000-0000');
-- 실행 후 : 컬럼 추가 하기 전에 insert 한 기존 행에도 기본값이 저장됩니다.

SELECT * FROM tbl_test#;

-- 테이블 컬럼 데이터 형식 변경 : modify
-- tid 의 길이를 20으로 변경하기
ALTER TABLE tbl_test# MODIFY (tid varchar2(20));

-- not null 은 제약조건입니다. -> modify 로 변경은 데이터 형식만 변경합니다. 
-- 제약조건에는 영향이 없습니다.(있던 것 유지) -> 있던 것 삭제하는 제약 조건 변경은 다른 방법으로 합니다.

-- 없던 제약조건 추가는 실행.
ALTER TABLE tbl_test# MODIFY (tname varchar2(25) UNIQUE);		--유일성(값 중복안됨)
ALTER TABLE tbl_test# MODIFY (tno varchar2(25) CHECK(tno > 100));

-- 컬럼 삭제(제거)
ALTER TABLE tbl_test# DROP (tel);
ALTER TABLE "TBL_TEST#" DROP COLUMN tel;

-- 테이블 이름 변경하기 tbl_test# 을 test# 으로 변경하기
ALTER TABLE tbl_test# RENAME TO test#;
ALTER TABLE test# RENAME TO tbl_test#;

-- 제약조건은 추가와 제거만 있습니다. 있는 것 변경은 못합니다.




