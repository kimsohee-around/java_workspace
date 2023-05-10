package partB.day14;

public class B12ClassAFamily {
	
	public static void main(String[] args) {
		// 부모 객체 생성
		ClassA cla1 = new ClassA();
		cla1.title="부모"; cla1.num=12; cla1.message = "테스트";
		System.out.println("나는 부모 클래스 : " + cla1.classA());
		
		// 자식 객체 생성
		ClassAA claa1 = new ClassAA();
		System.out.println("부모 클래스 필드에 값 저장====");
		claa1.title = "상속";
		claa1.num = 99;
		System.out.println("자식 클래스 ClassAA 필드에 값 저장====");
		claa1.point = 101.11;
		
		System.out.println("나는 자식. 부모 클래스 메소드 실행 = " + claa1.classA());
		System.out.println("num = " + claa1.num);
		claa1.message = "헬로우 ";
		System.out.println("protected 필드 변경 = " + claa1.message);
		//1)자식 클래스는 부모 클래스의 필드와 메소드를 사용할 수 있음.(단, private 은 상속 안됨)
	}
	
}

