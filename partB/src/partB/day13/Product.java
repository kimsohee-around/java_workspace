package partB.day13;

//쇼핑몰에서 구입할 상품정보를 저장하는 예시로 클래스 정의. 생성자 메소드 오버로딩이 핵심.
public class Product {
	//인스턴스 필드 (전역변수) 
	private long code;
	private String productName;
	private long price;
	private String company;
	
	//생성자는 `클래스와 이름이 같은 리턴타입은 없는 형식의 메소드` 입니다. 클래스 내부에 생성자 선언을 생략했다면, 컴파일러는 
	//중괄호 { } 블록 내용이 비어있는 기본 생성자(Default Constructor)를 바이트 코드에 자동
	//추가 시킨다. 생성자도 메소드이므로 오버로딩이 가능합니다.  
	//this() 또는 this(매개변수들) 와 같이 생성자 호출도 가능합니다.
	public Product() {
		// 기본 생성자
		// code 필드의 초기값 변경
		this.code = 999999999L;		//맨뒤에 L은 long 타입 리터럴 표시
	}
	
	public Product(String productName) {
		//생성자 역할은 초기화
		this();				//기본 생성자를 호출(실행). 다른 생성자 메소드 호출은 항상 맨앞에.
		this.productName = productName;
	}
	
//	public Product(String company) {//메소드 시그니처(인자 형식과 개수) 동일한 2개가 동시에 존재 못함.
//		this.company=company;
//	}
	
	public Product(long price) {
		this.price=price;
	}
	
	public Product(long price,String company) {
		this.price = price;
		this.company = company;
	}
	
	//실행 결과는?
	public Product(String productName, long price,String company) {
		this(productName);			//생성자 메소드 중에 String 매개변수 1개인 것 호출
		this.price = price;
		this.company = company;
	}
	
	//모든 필드값을 초기화하는 생성자를 만들어 보세요.매개변수 4개를 모두 받는 형식.
	public Product(long code,String productName, long price , String company) {
		this.code=code;
		this.productName=productName;
		this.price=price;
		this.company=company;
	}
	
	//getter
	public long getCode() { return this.code; }
	public String getProductName() { return this.productName; }
	public long getPrice() {  return price; }
	public String getCompany() { return company;  }
	
	//setter
	public void setCode(long code) { this.code = code; }
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setPrice(long price) { 	this.price = price; 	}
	public void setCompany(String company) { 	this.company = company; 	}
	
	//모든 필드값으로 문자열 생성
	public String product() {
		return String.format("상품코드 = %d , 상품명=%s, 가격=%d, 제조사=%s \n", 
				code,productName,price,company);
	}
	
}
