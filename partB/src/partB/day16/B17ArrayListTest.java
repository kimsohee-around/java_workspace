package partB.day16;

import java.util.ArrayList;		//자바에서 제공하는 자료구조 클래스

//새로운 자료구조 ArrayList 연습합니다. 배열과 동작방식이 유사한 List 자료구조 중 하나입니다.
// 자료구조? 데이터를 저장하고 다루는 방식.(List, Set, Map)
// ArrayList<E> : <E> 에서 E는 Element 약자, <> 제너릭 타입 기호. 리스트에서 다룰 데이터의 클래스 타입을 지정.
//				  기본형 타입 int,long,char.... 는 Wrapper 클래스를 사용합니다.
//				Integer.valueOf(19) 는 int 19를 Integer 객체(필드값은 19)로 변환
//				remove 외에 일반적인 경우에는 Integer와 int는 자동캐스팅이 됩니다.
public class B17ArrayListTest {

	public static void main(String[] args) {
		int[] numbers = {45,23,7,21,19,11,44};
		
		//ArrayList 를 이용하여 numbers 배열과 같은 방식으로 데이터를 저장할 객체를 생성.
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("\n1. 배열처럼 인덱스로 접근 위치를 지정합니다.");
		System.out.println("===테스트 데이터 저장하기 : add(저장할 값) 메소드 ===");
		list.add(45); list.add(23); list.add(7); list.add(21);
		list.add(19); list.add(11); list.add(44); 
		System.out.println("===저장한 데이터 가져오기 : get(인덱스) 메소드 ===");
		System.out.println("list.get(3)=" +list.get(3));
		System.out.println("list.get(5)=" +list.get(5));
		System.out.println("list.get(6)=" +list.get(6));
//		System.out.println(list.get(7));  //오류: 인덱스 범위 out of bounds(범위를 넘어갔음)
		
		System.out.println("\n2. 리스트의 크기를 구하는 메소드 : size() 메소드 ");
		System.out.println("list 의 크기 = " + list.size());			//7
		list.add(999);
		System.out.println("데이터 추가 후 list 의 크기 = " + list.size());			//8
		System.out.println("=== 배열은 초기에 지정된 크기가 변경될 수 없으나 list 는 변경 가능 ===");
		
		System.out.println("\n3. for 문으로 list 의 값들 출력하기");
		for(int i=0;i<list.size();i++) {
			System.out.println("list.get(i) = " + list.get(i));
		}
		System.out.println("=== 향상된 for 문 (for each) === ");
		for( int num  : list)
			System.out.println("list num = " + num);
		System.out.println("=== ArrayList 의 toString 확인");
		System.out.println(list.toString());
		System.out.println(list + ", 리스트의 크기 =" + list.size());    //toString()은 생략하고 작성합니다.
		
		System.out.println("\n4. 특정 위치 데이터 제거 / 특정 위치에 데이터 추가");
		list.add(3,999);
		System.out.println("list.add(3,999) 실행 후 ===");
		System.out.println(list +", 리스트의 크기 =" + list.size());	
		list.remove(4);
		System.out.println("list.remove(4) 실행 후 ===");
		System.out.println(list +", 리스트의 크기 =" + list.size());	
		//remove(Object o) 는 인자로 지정된 데이터를 삭제. 리턴은 boolean
		boolean result = list.remove(Integer.valueOf(11));
		System.out.println("list.remove(Integer.valueOf(11)) 실행 후 ===");
		System.out.println("remove result = " + result);
		System.out.println(list +", 리스트의 크기 =" + list.size());
		
		result = list.remove(Integer.valueOf(77));
		System.out.println("list.remove(Integer.valueOf(77)) 실행 후 ===");
		System.out.println("remove result = " + result);
		System.out.println(list +", 리스트의 크기 =" + list.size());
		System.out.println("2개 있는 999 모두 삭제하기 ====");
		while(list.remove(Integer.valueOf(999))) {};
		System.out.println(list +", 리스트의 크기 =" + list.size());
		
		System.out.println("\n5.List 에 저장된 데이터 찾기");
		System.out.println("1) 찾는 데이터가 존재하는가? - boolean");
		System.out.println("999가 리스트에 존재하는가? " + list.contains(99));
		System.out.println("19가 리스트에 존재하는가? " + list.contains(19));
		
		System.out.println("2) 찾는 데이터가 어디에 있는냐? - index");
		System.out.println("999가 저장된 index는? " + list.indexOf(99));
		System.out.println("19가 저장된 index는? " + list.indexOf(19));
		
	}
}







