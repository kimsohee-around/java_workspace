package partC.day18;

import java.util.Arrays;
import java.util.Comparator;

public class C07UserComparatorTest {
	//Member 객체의 compare(비교)
	public static void main(String[] args) {
		
		User m1 = new User("김모모", 23);
		User m2 = new User("최사나",20);
		
		System.out.println("\n1. 기본타입 배열 정렬(sort)에 사용됩니다.");
		int[] numbers = {56,34,89,45,99,88};
		String[] names = {"김모모","김나나","최사나","박쯔위","정다현","이나연"};
		Arrays.sort(numbers);
		Arrays.sort(names);	//String 클래스는 이미 Comparable 인터페이스 구현헀습니다.
		System.out.println("int 배열 정렬 결과 = " + Arrays.toString(numbers));
		System.out.println("String 배열 정렬 결과 = " + Arrays.toString(names));
		
		System.out.println("\n2. User 타입 배열 정렬 합니다.- Comparator(비교자) 인터페이스 사용");
		User[] users = new User[5];
		users[0] = m1;  users[1]=m2; 
		users[2] = new User("정다현", 22);
		users[3] = new User("박쯔위", 21);
		users[4] = new User("이나연", 25);
		
		System.out.println("Member 배열 초기 상태 = " + Arrays.toString(users));
		
		//중요: User 클래스 객체의 sort 기능을 위해 비교자를 구현합니다.
		//return int : 조건은 순서(위치) 를 교환하지 않는 조건식으로 작성합니다.
		Comparator<User> ascName = new Comparator<User>() {
			//오름 차순 : ascending
			@Override
			public int compare(User o1, User o2) {
				return o1.getName().compareTo(o2.getName());
			}  //문자열 compareTo는 사전순 비교 o1 < o2 이면 음수, o1>o2 이면 양수 리턴.
		};
		
		Arrays.sort(users,ascName);
		System.out.println("\nascName(name 필드 오름차순) 비교자 적용 정렬 = \n" + Arrays.toString(users));
		
		//Comparator<User> 인터페이스의 익명내부구현 클래스
		Comparator<User> desName = new Comparator<User>() {
			//내림 차순 : descending
			@Override
			public int compare(User o1, User o2) {
				// TODO Auto-generated method stub
				return o2.getName().compareTo(o1.getName());
			}
		};
		
		Arrays.sort(users,desName);
		System.out.println("\ndesName(name 필드 내림차순) 비교자 적용 정렬 = \n" + Arrays.toString(users));
		
		Comparator<User> ascAge = new Comparator<User>() {
				@Override
				public int compare(User o1, User o2) {
					// TODO Auto-generated method stub
					return o1.getAge()-o2.getAge();   //o1<o2 일때 음수
				}
		};
		
		Arrays.sort(users,ascAge);
		System.out.println("\nascAge(age 필드 오름차순) 비교자 적용 정렬 = \n" + Arrays.toString(users));
		
		Comparator<User> desAge = new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				return o2.getAge()-o1.getAge();
			}
		};
		
		Arrays.sort(users,desAge);
		System.out.println("\ndesAge(age 필드 내림차순) 비교자 적용 정렬 = \n" + Arrays.toString(users));
		
		users[0].setPoint(1234.23);
		users[1].setPoint(945.33);
		users[2].setPoint(888.11);
		users[3].setPoint(9991.23);
		users[4].setPoint(3456.67);
		
		Arrays.sort(users,new AscendingPointComparator());   //sort 메소드 2번쨰 인자는 업캐스팅입니다.
		System.out.println("\n point 필드 오름차순 비교자 AscendingPointComparator 클래스 적용 정렬 = \n" 
		+ Arrays.toString(users));
		
		//이렇게 작성하는 것이 가장 많이 사용하는 유형입니다.
		Arrays.sort(users,
				new Comparator<User>() {
					@Override
					public int compare(User o1, User o2) {
						return (int)(o2.getPoint()-o1.getPoint());
					}
				});
		
		System.out.println("\n point 필드 내림차순 비교자 sort 메소드 2번째 인자로 익명 클래스 구현 = \n"
		+ Arrays.toString(users));
		
		Integer[] ints = {2,6,4};
		Arrays.sort(ints);
		System.out.println(Arrays.toString(ints));
	}
}




