package partA.day02;

//데이터의 종류 : 원시타입 primitive type
public class A03DataTest {
	
	public static void main(String[] args) {
		
		System.out.println(":::: 원시타입 primitive type ::::");
		System.out.println("1. 정수는 기본 타입이 int 입니다.");
		System.out.println("2. 실수는 기본 타입이 double 입니다.");
		System.out.println("3. 논리형식 boolean 은 참 또는 거짓을 표현합니다.");
		System.out.println("4. 문자형식 char 은 문자 1개를 ''안에 표현합니다.");
		
		System.out.println(":::: 리터럴(값 자체) 형식 ::::");
		System.out.println("정수 : " + 2345);			//문자열에서 사용하는 + 는 연결기능입니다.
		System.out.println("실수 : " + 3.1419);
		System.out.println("논리 : " + true +"," + false);
		System.out.println("문자 : " + 'a' + "," + '8');
		System.out.println("*참고*문자열 : " + "2345");
		
		// 정수,실수는 사칙연산을 할수 있습니다.(더하기,빼기,곱하기,나누기)
		// 리터럴은 한번 사용하고 끝나는 값이므로 저장해서 또 사용하고 싶은 데이터는 변수를 활용합니다.
		
		System.out.println(":::: 변수 활용 ::::");
		//(1)데이터 저장
		int age = 26;					//나이
		double weight = 57.89;			//몸무게
		boolean isAdult = true;			//성인 여부
		char gender = 'F';				//성별
		
		System.out.println("나이 :" + age);				//(2)데이터 읽기
		System.out.println("몸무게 : " + weight);
		System.out.println("성인 여부 : " + isAdult);
		System.out.println("성별 : " + gender);
		
		System.out.println("변수를 사용하면 메모리에 저장된 상태이고 저장된 값을 변경할 수 있습니다.");
		//(3) 데이터 값 변경
		//예, 운동을 했더니 1.3kg 감량이 되었습니다.
		weight = weight - 1.3;
		System.out.println("감량된 몸무게 : " + weight);
		weight -= 1.3;			//weight = weight - 1.3 수식을 줄여서 쓰는 형식
		System.out.println("감량된 몸무게 : " + weight);
		//예, 7년동안 직장생활을 열심히 하면 나이가 몇살이 되나요?
		age = age + 7;
		System.out.println("7년 후 나의 나이는 : " + age);
		age += 7;
		System.out.println("7년 후 나의 나이는 : " + age);
		
		System.out.println("::: 조건 연산자 해보기 :::");
		System.out.println((age >= 20)? "성인입니다.":"청소년 입니다.");		//검사하고싶은 수식? 참일때 : 거짓일때
		System.out.println("나이 age를 17 로 변경해서 다시 실행하면 ?");
		age = 17;
		System.out.println((age >= 20)? "성인입니다.":"청소년 입니다.");		//검사하고싶은 수식? 참일때 : 거짓일때
		
		isAdult = age >=20;			//실행(연산)순서 :  >= 를 실행한 후에 =(대입) 실행
		System.out.println("나이 age가 변경된 후 성인여부 : " + isAdult);
		//age>=20 는 관계연산으로 결과가 true 또는 false 입니다. 
		//따라서, 실행결과를 대입하는 변수는 형식이 일치되도록 boolean 타입 변수로 해야 합니다.
		
		//아래와 같은 경우는 = 기준 오른쪽과 왼쪽 타입이 일치하지 않으므로 오류 
		//age = age > = 20;
		
		double myWeight = weight + 3.5;
		System.out.println("새로운 나의 몸무게 : " + myWeight);
		
	}
	

}
