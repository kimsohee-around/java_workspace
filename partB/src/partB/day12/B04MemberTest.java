package partB.day12;

import java.util.Arrays;

public class B04MemberTest {
	
	public static void main(String[] args) {
		Member momo = new Member();
		System.out.println("==momo 객체의 초기상태==");
		System.out.println(momo.getId()); System.out.println(momo.getName());
		System.out.println(momo.getAge()); System.out.println(momo.getPoint());
		System.out.println(momo.getMessage());
		System.out.println("==momo 객체의 필드값 set 실행.....==");
		momo.setId("momo"); momo.setAge(27); momo.setName("김모모");
		momo.setPoint(567.4);  
		String[] msg = {"hi","헬로우","hello","하이"}; momo.setMessage(msg); 
		System.out.println("==momo 객체의 현재 상태==");
		System.out.println(momo.getId()); System.out.println(momo.getName());
		System.out.println(momo.getAge()); System.out.println(momo.getPoint());
		System.out.println(momo.getMessage());
		//배열값으로 문자열 변환 후 리턴
		System.out.println(Arrays.toString(momo.getMessage()));   
		System.out.println("==momo 객체 현재 상태==============");
		System.out.println(momo.member());
	}

}
