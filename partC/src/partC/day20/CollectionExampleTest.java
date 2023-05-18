package partC.day20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionExampleTest {
	//실행결과 분석해보시고 미리 공부해 보세요. 설명은 내일합니다.
	public static void main(String[] args) {
		
		//List 는 데이터를 순서를 갖도록 저장하며 인덱스 사용한다.동일한 값을 중복하여 저장할 수 있다. 
		System.out.println("1. 리스트");
		List<String> list = new ArrayList<>();
		list.add("트와이스");
		list.add("뉴진스");
		list.add("에스파");
		list.add("소녀시대");
		list.add("원더걸스");
		list.add("뉴진스");
		System.out.println("list 의 크기 = " + list.size());
		System.out.println("list 에 저장된 문자열 = " + list);
		for(int i=0;i<list.size();i++)
			System.out.println(String.format("list[%d] 의 값 = \"%s\"", i,list.get(i)) );
		
		
		//Set 은 데이터 저장에 순서가 없다. 동일한 값을 중복하여 저장할 수 없다.
		System.out.println("\n2. Set");
		Set<String> set = new HashSet<>();
		set.add("트와이스");
		set.add("뉴진스");
		set.add("에스파");
		set.add("소녀시대");
		set.add("원더걸스");
		set.add("뉴진스");
		System.out.println("set 의 크기 = " + set.size());
		System.out.println("set 에 저장된 문자열 = " + set);
		
		//set 은 list의 get() 메소드와 같은 역할의 메소드가 없습니다.
		System.out.println("== Iterator 반복자를 이용한 set 의 값 가져오기 ==");
		Iterator<String> setIterator = set.iterator();
		int cnt =0;
		while(setIterator.hasNext()) {
			String temp =setIterator.next();
			System.out.println("cnt = " + cnt++ + ", 값 = " + temp);
		}
			
		
		//Map 은 key-value 한쌍으로 데이터를 저장하며 , key를 이용하여 value를 가져올 수 있다. 
		//		 key는 동일한 값을 중복하여 저장할 수 없다.
		System.out.println("\n3. Map");
		Map<String,String> map = new HashMap<>();
		map.put("tw", "트와이스");
		map.put("nu", "뉴진스");
		map.put("as", "에스파");
		map.put("gr", "소녀시대");
		map.put("tw", "원더걸스");
		map.put("js", "뉴진스");
		System.out.println("map 의 크기 = " + map.size());
		System.out.println("map 에 저장된 문자열 = " + map);
		System.out.println("== Iterator 반복자를 이용한 set 의 값 가져오기 ==");
		Iterator<String> mapIterator = map.keySet().iterator();
		cnt =0;
		while(mapIterator.hasNext()) {
			String temp =mapIterator.next();
			System.out.println(String.format("count=%d , key= %s , value=%s", cnt++,temp,map.get(temp)));
		}
		
	}

}
