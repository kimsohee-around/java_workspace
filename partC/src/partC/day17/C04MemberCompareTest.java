package partC.day17;

import java.util.Arrays;

public class C04MemberCompareTest {
	//Member 객체의 compare(비교)
	public static void main(String[] args) {
		
		Member m1 = new Member("김모모", 23);
		Member m2 = new Member("최사나",20);
		
		System.out.println("1.m1 참조객체와 m2 참조객체를 비교할 수 있나요?");
		System.out.println("답 : 객체자체로는 비교안됩니다. 객체의 특정 필드로 비교해야 합니다.");
		System.out.println("\n2. 객체의 특정 필드로 어떻게 비교 할 수 있나요?");
		System.out.println("답 : Member 클래스를 비교할 수 있는 클래스로 구현합니다.");
		System.out.println("m1.compareTo(m2) = "+m1.compareTo(m2));		//
		System.out.println("m2.compareTo(m1) = "+m2.compareTo(m1));	    //
		
		System.out.println("\n3.이렇게 비교 하는 것은 정렬(sort)에 사용됩니다.");
		int[] numbers = {56,34,89,45,99,88};
		String[] names = {"김모모","김나나","최사나","박쯔위","정다현","이나연"};
		Arrays.sort(numbers);
		Arrays.sort(names);
		System.out.println("int 배열 정렬 결과 = " + Arrays.toString(numbers));
		System.out.println("String 배열 정렬 결과 = " + Arrays.toString(names));
		
		Member[] members = new Member[5];
		members[0] = m1;  members[1]=m2; 
		members[2] = new Member("정다현", 22);
		members[3] = new Member("박쯔위", 21);
		members[4] = new Member("이나연", 25);
		
		//Member 클래스에 재정의된 compareTo 있으므로 sort 할수 있습니다.
		System.out.println("Member 배열 초기 상태 = " + Arrays.toString(members));
		Arrays.sort(members);
		System.out.println("Member 배열 정렬 결과 = " + Arrays.toString(members));
		
		
		//Comparable<Member> 은 Member 클래스를 Comparable 로 하겠다.<T> 제너릭 타입으로 설정.
		//고정된 필드로 compareTo를 미리 코드에 작성해야하며 정렬 필드를 변경하려면
		//하드 코딩으로 해야합니다. => Comparator 인터페이스로 sort 실행 시점에서 필드를 결정할 수 있게 변경합시다.
	}
}




