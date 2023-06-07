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

/*
컬럼 레벨 또는 테이블레벨에서 제약 조건 설정은 constraint 키워드를 생략할 수 있습니다.
제약조건 이름을 생략하면 오라클이 임의로 이름을 만듭니다.
오라클이 만들어 준 이름의 제약조건은 이미 있는 제약조건을 동일하게 쓰면 오류가 생깁니다.
--> alter table ~ modify 로 제약조건 설정은 컬럼 레벨. 주의해서 사용하기.
*/
-- 컬럼레벨. 제약조건 이름 정의하기
CREATE TABLE tbl_test2# (
	tid varchar2(3) constraint tid_pk primary key,
	tname varchar2(10) constraint tname_notnull NOT NULL,
	etc varchar2(10),
	tno number(3)
);

-- drop table tbl_test2#;

-- 컬럼레벨. 
create table tbl_test3# (
    test varchar2(20) not null,		-- 제약조건 이름 오라클이 정합니다.
    tid varchar2(3) constraint tid_fk
                REFERENCES tbl_test2#(tid)   -- FOREIGN KEY 안씁니다.
);
-- 테이블 컬럼 데이터 형식 변경 : modify
-- tid 의 길이를 20으로 변경하기
ALTER TABLE tbl_test# MODIFY (tid varchar2(20) NOT NULL);  
-- 컬럼레벨 제약조건 설정 . `constraint 제약조건이름 not null` 에서 생략된 형태입니다.

-- 없던 제약조건 추가는 실행.
ALTER TABLE tbl_test# MODIFY (tname varchar2(25) UNIQUE);		--유일성(값 중복안됨)
ALTER TABLE tbl_test# MODIFY (tno varchar2(25) CHECK(tno > 100));

-- 컬럼 삭제(제거)
ALTER TABLE tbl_test# DROP (tel);
ALTER TABLE "TBL_TEST#" DROP COLUMN tel;
-- 컬럼 삭제할 때 오류가 나는 경우 : 다른 테이블 외래키의 부모(참조) 컬럼일때

-- 테이블 이름 변경하기 tbl_test# 을 test# 으로 변경하기
ALTER TABLE tbl_test# RENAME TO test#;
ALTER TABLE test# RENAME TO tbl_test#;

-- 제약조건은 추가와 제거만 있습니다. 있는 것 변경은 못합니다.
-- add constraint 제약조건 이름 [제약조건키워드]
-- drop constraint 제약조건 이름
-- 제약조건 이름은 개발자가 생략하면 오라클이 자동으로 만들어 줍니다.

SELECT 
	*
--CONSTRAINT_NAME 
FROM USER_CONSTRAINTS ;			-- 현재 스키마의 모든 테이블의 제약조건을 조회합니다.
-- 메타데이터. 데이터 또는 db 객체들을 관리하는 데이터 (데이터 사전)

ALTER TABLE "TBL_TEST#" 
ADD						-- 테이블 레벨로 제약 조건 설정 
CONSTRAINT test_pk      -- `CONSTRAINT 제약조건이름` 생략 가능
PRIMARY KEY (tid);		-- 기본키 추가. 

ALTER TABLE "TBL_TEST#" 
DROP CONSTRAINT test_pk;		-- 설정된 기본키 삭제

SELECT * FROM "TBL_TEST#" tt ;	

INSERT INTO "TBL_TEST#" (tid,tname)
VALUES ('tes','테스트2');			-- 중복된 tid 값 입력해보기 : 정상 실행.

-- 위 PK 추가 하면 오류 : 중복된 값을 갖고 있으면 PK 추가 못합니다.

-- PK 없는 처음 상태에서 테스트하기
-- 이미 있는 not null 제약 조건도 잘 실행됩니다.(제약 조건이름이 다르기때문 입니다.)
ALTER TABLE tbl_test# 
ADD CONSTRAINT test_id 		-- 개발자가 정하는 제약조건 이름
CHECK (tid IS NOT NULL);	-- NOT NULL 제약조건 추가는 CHECK 키워드로 합니다.


ALTER TABLE tbl_test# 
ADD CONSTRAINT t_etc 		-- 개발자가 정하는 제약조건 이름
CHECK (t_etc IS NOT NULL);  -- NULL 허용 컬럼을 NOT NULL.  
-- t_etc 컬럼값에 이미 null 입력이 된 상태이면 오류


