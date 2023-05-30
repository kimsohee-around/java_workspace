DROP TABLE tbl_buy;
DROP TABLE tbl_custom;
DROP TABLE tbl_product;

-- 고객 테이블
CREATE TABLE tbl_custom (
	custom_id varchar2(20) PRIMARY KEY ,  
	name varchar2(40) NOT NULL,		
	email varchar2(40),
	age number(3) DEFAULT 0,		-- 기본값
	reg_date date DEFAULT sysdate 
);

INSERT INTO 
	TBL_CUSTOM 
VALUES
	( 'mina012', '김미나', 'kimm@gmail.com', 20, 
--	  '2022-03-10 14:23:25'		-- 타입이 DATE 일때 시:분:초 포함된 문자열은 자동 변환이 안됩니다.오류!!!
	  to_date('2022-03-10 14:23:25',
	  		  'yyyy-mm-dd hh24:mi:ss')   -- 함수로 문자열에서 날짜형식 변환. 문자열의 패턴이 필요.
	);
INSERT INTO tbl_custom 
VALUES ('hongGD', '홍길동', 'gil@korea.com', 32, to_date('2021-10-21 11:12:23','yyyy-mm-dd hh24:mi:ss'));
INSERT INTO tbl_custom 
VALUES ( 'twice', '박모모', 'momo@daum.net', 29, to_date('2021-12-25 19:23:45','yyyy-mm-dd hh24:mi:ss'));
-- 현재날짜와 시간 입력하는 것은 컬럼의 기본값을 오라클의 sysdate 로 설정합니다.
INSERT INTO tbl_custom (custom_id,name,email)
VALUES ( 'wonder', '이나나', 'lee@naver.com');


-- 상품 테이블 : 

CREATE TABLE tbl_product(
	pcode varchar2(20) PRIMARY KEY ,
	category char(2) NOT NULL,
	pname varchar2(40) NOT NULL,
	price number(9) NOT NULL 
);



-- 구매 테이블 : 어느 고객이 무슨 상품을 구입하는가? 고유ID 또는 상품코드로 기본키를 만들 수 있을까요? -> 없습니다. 
CREATE TABLE tbl_buy(
	buy_seq number(8) PRIMARY KEY ,		-- 구매 번호
	customId varchar2(20) NOT NULL ,			-- 참조테이블 컬럼명과 다르게 할수 있습니다.
	pcode varchar2(20) NOT NULL ,
	quantity number(5) DEFAULT 1 ,		--수량
	buy_date DATE,
	FOREIGN KEY (customId)				-- 이 테이블의 외래키 컬럼
			REFERENCES tbl_custom(custom_id),	-- 참조하는 테이블과 컬럼명
	FOREIGN KEY (pcode)
			REFERENCES tbl_product(pcode)
);





