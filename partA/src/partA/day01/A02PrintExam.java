package partA.day01;

public class A02PrintExam {
	
	public static void main(String[] args) {
		System.out.println("::: 나의 소울 푸드 :::");
		myFood();
		System.out.println("\n::: 나의 반려 동물 :::");   //println , print+line 은 출력+줄바꿈
		myAnimal();
	}

	private static void myFood() {
		// \n은 줄바꿈 기능의 문자
		System.out.println("치킨\n스파게티\n삼겹살");
		System.out.println("--tab으로 구분--");
		System.out.println("12345678123456781234567812345678");
		System.out.println("치킨\t스파게티\t삼겹살\t");		//tab은 일정 간격(8칸)
	}

	private static void myAnimal() {
		System.out.println("도마뱀\n개구리\n강아지");
		System.out.println("--tab으로 구분--");
		System.out.println("도마뱀\t개구리\t강아지\t");
	}
}
