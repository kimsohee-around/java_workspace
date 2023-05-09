package partB.day13;
//객체의 배열 연습.   String 배열을 참고하세요.
public class B10UserArray {
	public static void main(String[] args) {
		
//클래스 타입으로 선언된 변수는 객체의 참조값을 저장!!!
		User momo = new User("twice1","김모모",27,100);
		User nayeon = new User("twice2","나연",25,110);
		User dahyeon = new User("twice3","다현",28,120);
		User zuwi = new User("twice4","쯔위",24,133);
		
		//1. 위의 4개 객체를 저장할 배열을 배열크기 7로 선언하세요. 배열이름은 twice
		//   선언된 배열에 4개의 객체를 저장하세요.
		User[] twice = new User[7];
		twice[0] = momo;
		twice[1] = nayeon;
		twice[2] = dahyeon;
		twice[3] = zuwi;
		
		//객체 참조변수값을 배열에 전달한 결과 확인
		System.out.println(twice[0]);
		System.out.println(momo);
		System.out.println(twice[0].user());
		System.out.println(momo.user());
		System.out.println("==결론: twice[0] 과 momo 가 저장한 값은 동일하다.\n"
				+ "즉, 같은 객체를 참조하고 있다.==");
		//2.위의 선언한 배열의 요소를 모든 필드값 출력해보세요.
		//오류 발생없이 실행되도록 해결해 보세요.
		System.out.println("==배열의 객체 참조 상태 확인==");
		for(int i=0;i<twice.length;i++) {
			System.out.println(twice[i]);
		}
		
		System.out.println("==배열이 참조하는 객체의 필드값 출력==");
		for(int i=0;i<twice.length;i++) {
			if(twice[i] !=null)
			//**객체 null 일때는 메소드 실행 오류**
				System.out.println(twice[i].user());
		}
		
		//3. 새로운 객체를 생성해서 배열 인덱스 4에 저장해 보세요.
		//객체 참조 변수를 선언하지 않고 바로 배열 요소로 대입하기
		twice[4] = new User("twice5", "사나", 26, 150);
		System.out.println("==새로운 객체를 인덱스 4에 대입한 후==");
		for(int i=0;i<twice.length;i++) {
			if(twice[i] !=null)
			//**객체 null 일때는 메소드 실행 오류**
				System.out.println(twice[i].user());
		}
		
	}

}
