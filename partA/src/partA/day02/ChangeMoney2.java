package partA.day02;

//테스트용
public class ChangeMoney2 {
	
	public static void main(String[] args) {
		//원화 -> 엔화
	    int kmoney = 100;
	    double jmoney = 10.16;
	    
	    //내가 환전할 금액 : 1,000,000
	    double jmoney2 = jmoney*10000;
	     System.out.println("엔화로 환전된 금액은 : " + (double)jmoney2 + " 입니다.");
	    
	     //남은 금액 : 1000엔
	     int kmoney2 = kmoney*100;
	     System.out.println("원화로 환전된 금액은 : " + (int)kmoney2 + " 입니다.");
	}


}
