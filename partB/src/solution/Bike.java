package solution;

/*
작성자 : XXX  
*/
public class Bike extends Product{
	//문제1 -[3]
		@Override
		public String sell(Object object) {
			return String.format("추가 할인 행사 - %d %% 인하", object);
		}
	
	//문제1 -[5]
	private int speed;
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//문제1 -[6]
	public Bike() {
	}
	
	public Bike(int price, String prdName, int speed) {
		super.price = price;
		super.prdName = prdName;
		this.speed = speed;
	}
	
	
}

class Electronics extends Product {
	
	//문제에서 특별한 요구사항이 없을때는 기본 생성자만 사용합니다.
	
	//문제1 -[4]
	@Override
	public String sell(Object object) {
		return String.format("묶음 상품 = %s(1set)", object);
	}
	
	
	
}
