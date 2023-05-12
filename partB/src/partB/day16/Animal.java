package partB.day16;

import java.util.Arrays;

import partB.day12.Member;

//Object 타입으로 필드 또는 메소드의 인자와 리턴타입으로 사용하는 예시.
public final class Animal {
	
		Object name;
	
		void iamAnimal(Object object) { //메소드 인자를 Object 타입으로 받습니다.
			if(object instanceof Member) {
				Member member = (Member)object;
				System.out.println("인자 Object = " + member.member() +",name=" + name );
			}else if(object instanceof String[]) {
				String[] temp = (String[]) object;
				System.out.println("인자 Object = " + Arrays.toString(temp) +",name=" + name );
			}else
			System.out.println("인자 Object = " + object +",name=" + name );
		}
	
}
//오류: Animal 은 final이므로 상속이 안되는 클래스
/*
class Puppby extends Animal {
	
}
*/
