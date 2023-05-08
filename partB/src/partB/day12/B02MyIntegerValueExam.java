package partB.day12;

public class B02MyIntegerValueExam {
	//클래스는 도면, 객체는 도면을 보고 만든 실체
	public static void main(String[] args) {
		//객체 생성 - new 연산.   생성된 객체를 참조하는 변수 my1,my2
		MyIntegerValue my1 = new MyIntegerValue();
		//저장할 데이터가 다르면 또 객체 생성(새로운 실체)
		MyIntegerValue my2 = new MyIntegerValue();
		
		//인스턴스 필드에 값 저장
		my1.value1 = 23; 	my1.value2 = 45;
		my2.value1 = 987;	my2.value2 = 345;
		
		//인스턴스 메소드 실행
		System.out.println("my1 출력 my1.value1 =" + my1.value1 
						+ ",my1.value2=" + my1.value2);
		int result = my1.add();
		System.out.println("my1.add() =" + result);
		System.out.println("my1.subtract() =" + my1.subtract());
		System.out.println("my1.multiply() =" + my1.multiply());
		System.out.println("my1.divide() =" + my1.divide());
		result = my1.remaind();
		System.out.println("my1.remaind() =" +result);
		
		System.out.println();
		System.out.println("my2 출력 my2.value1 =" + my2.value1 
				+ ",my2.value2=" + my2.value2);
		result = my2.add();
		System.out.println("my2.add() =" + result);
		System.out.println("my2.subtract() =" + my2.subtract());
		System.out.println("my2.multiply() =" + my2.multiply());
		System.out.println("my2.divide() =" + my2.divide());
		result = my2.remaind();
		System.out.println("my2.remaind() =" +result);
		
		//3) private 변수 테스트
		//my1.name = "김모모";		
//변경 불가능. 자바 객체지향 은닉성(필드 또는 메소드를 다른 클래스에서 직접 접근 못하게 합니다.)
// 특히 private 필드는 읽기/쓰기를 위한 메소드가 필요합니다.
		System.out.println("===private 변수 테스트===");
		my1.name("김모모");
		my1.printName();
		System.out.println("my1 객체의 name = " + my1.getName());
	} 
	//MyIntegerValue 클래스에도 static 요소 포함 할 수 있습니다. 예시는 B01 참고
}









