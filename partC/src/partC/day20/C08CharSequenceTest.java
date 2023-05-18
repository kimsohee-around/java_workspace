package partC.day20;

public class C08CharSequenceTest {
	// CharSequence(순서대로 나열된 문자) 인터페이스 : String , StringBuffer, StringBuilder 가 구현 클래스
	public static void main(String[] args) {
	// 복습 : 해시코드는 객체의 주소로 만들어지는 객체의 식별을 위한 값입니다. 
	//       Integer.toHexString 는 정수(인자)를 16진수로 변환하여 문자열 리턴. 16진수 구별을 "0x" 을 앞에 붙입니다.
		
		System.out.println("1. String 클래스의 객체");
		String result = new String();   //""
		System.out.println("초기 result : " + result);
		for (int i = 0; i < 5; i++) {
			result += i + "/"; // result =result+ i + "/";
			System.out.println("중간결과 result :" + result);
			System.out.println(String.format("중간결과 result 객체 해시코드  ↓ \n 10진수 = %d , 16진수 = 0x%8s\n" ,
						result.hashCode(), Integer.toHexString(result.hashCode())));
		}
		//해시코드값이 같다면 동일한 객체에 값의 상태가 바뀌는 것이고 그렇지 않다면 객체가 새로 만들어지는 것.
		System.out.println("=== String 객체는 문자열이 변경되면 참조값이 변경됩니다.(불변객체) ===\n");

		System.out.println("\n2. StringBuffer 클래스의 객체");
		StringBuffer sb = new StringBuffer();
		System.out.println("초기 sb : " + sb);
		for (int i = 0; i < 5; i++) {
			sb.append(i).append(":");
			System.out.println("중간결과 sb :" + sb);
			System.out.println(String.format("중간결과 sb 객체 해시코드  ↓ \n 10진수 = %d , 16진수 = 0x%8s\n" ,
					sb.hashCode(), Integer.toHexString(sb.hashCode())));
		}
		System.out.println(
				"=== StringBuffer(StringBuilder) 객체는 객체의 문자열을 변경할 수 있습니다.(가변 객체) \n" + 
				"문자열 추가 append 메소드가 있습니다. ");
		System.out.println("문자열의 delete(제거) , insert(중간 삽입) 기능도 있습니다. === ");
		System.out.println("sb.insert(2, \"***\") = "+sb.insert(2, "***"));   //문자열의 2번 인덱스 위치에 삽입
		System.out.println("sb.delete(2, 4) = "+sb.delete(2, 4));		//2번 인덱스부터 (4-2) 개를 제거하기
		
		//StringBuilder 는 StringBuffer 와 같은 동작으로 구현된 클래스입니다. 
		// 				단, StringBuffer 는 멀티스레드에 안전합니다. (멀티스레드는 뒤에서 진도 예정)
		
		System.out.println("\n3. String 클래스의 contains 메소드 인자는 CharSequence 타입니다.");
		String sample = "abc0/1/2/3/4/xyz";
		CharSequence cs = result;		//CharSequence 인터페이스 타입으로 업캐스팅. 
		System.out.println("sample.contains(result) = "  +sample.contains(cs));
		cs = sb; 
		System.out.println("sample.contains(sb) = "  +sample.contains(cs));
		
	}

}


