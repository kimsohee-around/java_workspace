-- 고객 테이블
CREATE TABLE tbl_custom (
	custom_id varchar2(20) PRIMARY KEY ,  
	name varchar2(40) NOT NULL,		
	email varchar2(40),
	age number(3) DEFAULT 0,		-- 기본값
	reg_date date 
);

DROP TABLE tbl_custom;

-- 상품 테이블 : 

CREATE TABLE tbl_product(
	pcode varchar2(20) PRIMARY KEY ,
	category char(2) NOT NULL,
	pname varchar2(40) NOT NULL,
	price number(9) NOT NULL 
);

DROP TABLE tbl_product;

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





