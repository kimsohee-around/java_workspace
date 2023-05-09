package partB.day13;

public class B06ProductTest {
	public static void main(String[] args) {
		Product tv 			//new 연산으로 생성된 객체를 참조하는 변수 tv 선언
		=new Product();   // new Product(); 에서 new 연산이 뒤에 나오는 Product() 생성자 호출
		System.out.println(tv.product());
		
		Product audio = new Product("LG블루트스 오디오");
		System.out.println(audio.product());
		
		Product notebook = new Product(76763434, "LG그램", 2200000, "LG");
		System.out.println(notebook.product());
		
		Product snack = new Product(5500, "오리온");
		System.out.println(snack.product());
		
		Product pizza = new Product("도미노스테이크피자", 32000, "도미노");
		System.out.println(pizza.product());
	}
}
