package solution;

/*
  		작성자 : XXX  
*/
		//문제1 -[1]
public abstract class Product {
		//문제1 -[1]
		protected int price;
		protected String prdName;
		
		//문제1 -[2]	
		public abstract String sell(Object object);
}
/*
[1] Product 클래스에 문자열 타입 ‘상품명’ 필드와 정수형 타입 ‘가격’ 필드를 각각 선언하세요. 필드명은 prdName, price 입니다.
 필드 접근 한정자를 protected로 합니다.
[2] Product 클래를 추상클래스로 변경하고 sell 이라는 추상메소드를 public 으로 선언하세요.
 : 메소드의 리턴타입은 String, 인자는 Object 1개 입니다.

*/
