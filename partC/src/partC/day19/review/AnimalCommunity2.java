package partC.day19.review;

import java.util.Scanner;

public class AnimalCommunity2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name; int age;   //사용자 정보 저장할 변수
		System.out.println("환영합니다.!!");
		System.out.println("회원정보를 입력하세요.");
		System.out.print("이름 >>> ");
		name = sc.nextLine();
		System.out.print("나이 >>> ");
		age = sc.nextInt();
		
		//Member 객체
		Member member = new Member(name, age);
		
		System.out.println("\n[[반려동물 목록을 보여드리겠습니다.]] \n");
		
		Animal[] animals = new Animal[10];
		animals[0] = new Puppy("브라운");
		animals[1] = new Cat();
		animals[2] = new Rabbit();
		//animals[0].setColor("브라운");
		animals[1].setColor("그레이");
		animals[2].setColor("화이트");
		
		//익명클래스(Anonymous) - 이름이 없는 클래스
		animals[3] = new Animal() {     //Inner : 클래스안에서 클래스를 정의하는 것
			static final String TYPE ="쥐";		//상수 필드 정의 가능
			//추상메소드 구현이 필요합니다.
			
			@Override
			public void sound() {
				System.out.println(this.getColor() +" 쥐는 🐭🐭찍찍하고 울어댑니다.");
			}
			
			@Override
			public String getType() {
			//	return this.TYPE;	
			//경고:인스턴스 메소드에서는 static 이 접근가능하지만 좋은 방법은 아닙니다. 
			//	  static 필드 또는 메소드는 클래스이름.TYPE 또는 클래스이름.메소드() 으로 사용합니다.
				return "쥐";
			}
		};
		animals[3].setColor("다크그레이");
		System.out.println("animals[3].getType() =" + animals[3].getType());
		
		animals[4] = new Animal("칼라풀") {
			@Override
			public void sound() {
				System.out.println(this.getColor() +" 앵무새🐦🐦는 안녕~하고 말합니다.");
			}
			
			@Override
			public String getType() {
				return "앵무새";
			}
		};
		
		for(int i=0;i<animals.length;i++) {
				if(animals[i]!= null) {
					System.out.print("[" +(i+1) +"] ");
					animals[i].sound(); 		//sound() 메소드로 다형성 구현합니다.
				}	
		}	

		System.out.print("분양을 원하는 반려동물 선택해주세요. >>> ");
		int index = sc.nextInt();
		
		Animal temp = animals[index-1];
		boolean result =member.isAdopt(temp);
		
		String message=member.getName() + " 회원님은 ";	
		if(temp instanceof Puppy)	 {
			message +=Puppy.TYPE;
		}else if(temp instanceof Cat)	{
			message +=Cat.TYPE;
		}else if(temp instanceof Rabbit) {	
			message +=Rabbit.TYPE;
		}else if(temp instanceof Animal) {
			message += temp.getType();
		}
		print(result,message);

		sc.close();
		
		}//main end
	
	
		static void print(boolean result , String message) {
			if(result) {
				System.out.println(message + " 분양 가능 😃 합니다.");
			} else {
				System.out.println(message + " 분양 자격이 😓 안됩니다.");
			}
		}

}







