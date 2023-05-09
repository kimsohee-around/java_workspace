package partB.day13;

public class B06ProductTest {
	public static void main(String[] args) {
		Product tv 			//new 연산으로 생성된 객체를 참조하는 변수 tv 선언
		=new Product();   // new Product(); 에서 new 연산이 뒤에 나오는 Product() 생성자 호출
		System.out.println(tv.product());
		
		Product audio = new Product("LG블루트스 오디오");
	}
}
