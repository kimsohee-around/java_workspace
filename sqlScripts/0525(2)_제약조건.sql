-- 제약 조건 constraints
-- 		: 테이블에 저장되는 데이터가 부적절한 값을 갖지않도록 규칙을 적용.
-- 1) NOT NULL   2) UNIQUE(유일한 값)    3) PRIMARY KEY : 1) 과 2)를 모두 만족. **데이터 행을 식별(구별)


-- tbl_member 테이블 mno 값이 1 있습니다. 
SELECT * FROM TBL_MEMBER tm WHERE mno =1;
-- 또 mno값 1이 입력되나요?
INSERT INTO TBL_MEMBER VALUES (1,'김모모','momo@naver.com','2022-11-24');

-- 회원 가입 서비스를 예시로 하면, 회원 구별은 id(아이디) 또는 email 또는 회원번호 
-- 회원을 구별(식별)하는 컬럼입니다.=> not null 이면서 unique 해야합니다.=> 기본키 PK (*****)로 선정합니다.


-- PK를 설정하고 관계를 갖도록 하는 테이블 예시 : 성적처리 
--			 테이블과 컬럼을 데이터의 중복을 최소화 하도록 설계.
CREATE TABLE tbl_student (
	stuno char(7) PRIMARY KEY,   -- 제약조건 설정방법 1) 컬럼레벨   -- 학번을 기본키.
	name varchar2(30) NOT NULL,  -- 학생 이름
	age number(3) CHECK (age BETWEEN 10 AND 30),	-- 나이 : 입력값의 범위 설정
	address nvarchar2(50)		-- 주소
);

-- '학번'에 해당 학생이 'subject' 과목을 'teacher' 선생님에게 강의를 듣고 시험 'term'(언제) 점수 'jumsu' 받음.
CREATE TABLE tbl_score(
	stuno char(7),		-- 외래키로 `학생`테이블의 `학번`값을 참조합니다.
	subject nvarchar2(20),		-- 과목명
	jumsu number(3) NOT NULL ,	-- 점수
	teacher nvarchar2(20) NOT NULL ,	-- 담당교사
	term char(6) NOT NULL,				-- 수강학기  230101 (예)
-- 제약조건 설정방법 2) 테이블레벨	
	PRIMARY key(stuno,subject), 	-- 기본키는 복합컬럼으로 설정
	FOREIGN key(stuno) REFERENCES tbl_student(stuno)   -- 참조관계설정(외래키)
--	FOREIGN key(성적테이블컬럼) REFERENCES 참조테이블(참조테이블컬럼)   
--		* 참조컬럼(stuno) 조건은 ? 기본키 또는 unique 컬럼이어야합니다. 
--	    **참조관계를 만들 떄 사용한 성적테이블 stuno는 값의 제약이 있습니다. tbl_student 테이블 stuno 컬럼에
--		 입력된 값으로 제한됩니다.	`성적 테이블의 stuno 컬럼은 학생 테이블의 stuno 컬럼을 참조한다` 고
--		 하며 참조컬럼은 학생테이블의 stuno 이고 , 외래키 컬럼은 성적테이블의 stuno 입니다.	
);

-- 참조관계일때는 자식 테이블 삭제 후 부모 테이블 삭제합니다.
DROP TABLE TBL_SCORE ;
DROP TABLE TBL_STUDENT ;

SELECT * FROM TBL_SCORE ts ;
SELECT * FROM TBL_STUDENT ts ;

-- 참조관계일때 자식 행 모두 제거 후 부모 테이블 제거 실행 오류 입니다.
TRUNCATE TABLE TBL_SCORE ;
TRUNCATE TABLE TBL_STUDENT;


-- 학생 테이블에 데이터 입력
INSERT INTO tbl_student(stuno,name,age,address)
VALUES ('2021001','김모모',16,'서초구');
INSERT INTO tbl_student(stuno,name,age,address)
VALUES ('2019019','강다현',18,'강남구');
INSERT INTO tbl_student(stuno,name,age,address)
VALUES ('2020017','박나래',16,'경기도');

-- 성적 테이블에 데이터 입력
-- 성적 테이블은 stuno와 subject 가 한쌍이 되어 기본키 만들어졌습니다.
-- 이 때 요구사항은 학생 1명은 같은 이름의 과목을 1번만 수업을 듣는다는 조건이 필요합니다.
INSERT INTO tbl_score(stuno,subject,jumsu,teacher,term)
VALUES ('2021001','국어',89,'이나연','2022_1');
INSERT INTO tbl_score(stuno,subject,jumsu,teacher,term)
VALUES ('2021001','영어',78,'김길동','2022_1');
INSERT INTO tbl_score(stuno,subject,jumsu,teacher,term)
VALUES ('2020017','과학',67,'박세리','2021_2');
INSERT INTO tbl_score(stuno,subject,jumsu,teacher,term)
VALUES ('2019019','국어',92,'이나연','2019_2');
INSERT INTO tbl_score(stuno,subject,jumsu,teacher,term)
VALUES ('2019019','영어',85,'박지성','2019_2');
INSERT INTO tbl_score(stuno,subject,jumsu,teacher,term)
VALUES ('2019019','과학',88,'박세리','2020_1');

-- 성적 테이블에 데이터 입력 : 오류 원인은?  `외래키` 무결성 `제약조건` 위반
INSERT INTO tbl_score(stuno,subject,jumsu,teacher,term)
VALUES ('2021002','국어',89,'이나연','2022_1'); 
-- 학번 2021002 는 학생테이블에 없습니다.






