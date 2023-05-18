package partC.day19.review;

public class Member {
	
	private String name;
	private int age;
	
	public Member(String name,int age) {
		this.name =name;
		this.age=age;
	}
	
	boolean isAdopt(Animal animal) {	//메소드의 인자가 Animal 타입  //인자로 받은 동물이 분양 자격있는지
//	요구사항 :  강아지는 15세이상, 고양이는 18세이상, 토끼는 13세 이상 분양받을 수 있습니다.그외 동물은 20세 이상
//	Animal 타입이 실제 객체가 무엇인지는 ? 아직모름. 실행 시점에서 알수 있습니다.
		if(animal instanceof Puppy && age >=15)  
	//instanceof 연산 : 실제 객체 타입을 검사. 클래스 상속객체들에게 사용하는 연산.
			return true;
		else if(animal instanceof Cat && age >=18)
			return true;
		else if(animal instanceof Rabbit && age >=13)
			return true;
		else if(animal instanceof Animal && age >=20)
			return true;
		else 
			return false;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
}
