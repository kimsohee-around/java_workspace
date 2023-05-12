package solution;

/*
작성자 : XXX  
*/
public class ProductTest {

	
	public static void main(String[] args) {
		
		//문제1-[3] 테스트
		Bike bike = new Bike(); System.out.println(bike.sell(20));
		//문제1-[4] 테스트
		Electronics elec = new Electronics(); System.out.println(elec.sell("사운드바"));
		
		
		//문제2 -[1]
		Product[] cart = new Product[10];
		
		cart[0] = new Bike(123000,"MTB",25);
		cart[3] = new Bike(99000,"삼천리",25);
		
		//Electronics 커스텀 생성자로 필드 초기화
		cart[1] = new Electronics(); 
		cart[1].price=35000; cart[1].prdName="USB";
		
		cart[5] = new Electronics();
		cart[5].price=117000; cart[1].prdName="ipad";
		
		cart[7] = new Electronics();
		cart[7].price=2250000; cart[1].prdName="lg 냉장고";
		
		//문제2 -[3]
		for(int i=0;i<cart.length;i++) {
			if(cart[i]!=null && cart[i].price >= 100000) {
				System.out.println("cart index=" + i + ",상품명=" + cart[i].prdName 
						+ ",가격=" + cart[i].price);  //toString()은 여러분이 코딩하세요.
			}
		}
	}
}
