package partC.day23;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
//@EqualsAndHashCode
@ToString
public class CustomerENH {
	private String id;
	private String name;
	private int age;
	
	//	-> 3개의 필드값으로 해시코드 계산하고 , 결국 필드값이 같으면 같은 값의 정수가 리턴
	@Override
	public int hashCode() {			//동일성
		final int prime = 31;		//소수
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	//		-> 3개의 필드값이 모두 같으면 equals '참'으로 리턴
	@Override		//동등성
	public boolean equals(Object obj) {		//this와 인자로 받은 obj 를 비교
		if (this == obj)		//비교 대상과 완전 같은 주소의 객체일 때
			return true;
		if (obj == null)		//비교 대상이 null 일때 
			return false;
		if (getClass() != obj.getClass())	//클래스 타입이 다르면
			return false;
		
		CustomerENH other = (CustomerENH) obj;	//위의 3가지에 해당하지 않으면 업캐스팅
		if (age != other.age)		//age 필드값이 다를 때
			return false;
		
		if (id == null) {			//this의 id가 null이고 비교대상 id가 null 이 아닐 때
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))	//this와 비교대상 id가 다를 때
			return false;
		
		if (name == null) {			//this의 name이 null이고 비교대상 name가 null 이 아닐 때
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))  //this와 비교대상 name이 다를 때
			return false;
		return true;	
		//위의 6개 이외의 나머지 경우 즉, id와name,age필드값이 모두 같을 때(null 제외)는 `참`
	}
	
	

}
