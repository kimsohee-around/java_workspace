package partC.day19.review;

public class AnimalCommunity {

	public static void main(String[] args) {
//			Animal[] animals = new Animal[3];
			Animal[] animals = new Animal[10];
			animals[0] = new Puppy("브라운");
			animals[1] = new Cat();
			animals[2] = new Rabbit();

			animals[1].setColor("그레이");
			animals[2].setColor("화이트");
			
			System.out.println("[[반려동물 목록을 보여드리겠습니다.]] \n");
			for(int i=0;i<animals.length;i++) {
	//animals.length : 반드시 배열의 크기로 반복하도록 코딩합니다.
	//그래서 null 아닐때만 sound()를 실행합니다.			
				if(animals[i]!= null)
					animals[i].sound(); 		//sound() 메소드로 다형성 구현합니다.
			}	
			
	/////	모모회원이 동물 분양 받을 수 있는지 셀프 체크   ///////////
	//	강아지는 15세이상, 고양이는 18세이상, 토끼는 13세 이상 분양받을 수 있습니다.그외에는 20세.		
		Member momo = new Member("모모", 17);	
		
		boolean result =momo.isAdopt(animals[1]);
		String message=momo.getName() + " 회원님은 ";	
	
//강아지,고양이,토끼 출력방법은 여러가지 가능합니다.		
		//방법 1)
		if(animals[1] instanceof Puppy)	
			message +="강아지";
		else if(animals[1] instanceof Cat)	
			message +="고양이";
		else if(animals[1] instanceof Rabbit)	
			message +="토끼";
		
		print(result,message);
		
		//다른 멤버 추가해서 다른 animal 도 테스트. -> TYPE 상수 활용.
		Member sana = new Member("사나",16);
		//방법 2)
		result = sana.isAdopt(animals[0]);
//		message=sana.getName() + " 회원님은 " + animals[0].TYPE;	  
//animals배열타입 Animal -"동물". 상수에 대해서는 오버라이딩 적용되지 않습니다. animals[0].TYPE 은 항상 '동물'
//		==> 그래서 방법 3) 또는 아래의 getType() 메소드 사용.(다형성)	
		
		message=sana.getName() + " 회원님은 " + animals[0].getType();	
		print(result,message);
		
		Member mina = new Member("미나",20);
		result = mina.isAdopt(animals[0]);
		message = mina.getName() + " 회원님은 ";
		//방법 3)
		if(animals[0] instanceof Puppy)	 {
			message +=Puppy.TYPE;
		}else if(animals[0] instanceof Cat)	{
			message +=Cat.TYPE;
		}else if(animals[0] instanceof Rabbit) {	
			message +=Rabbit.TYPE;
		}	
		print(result,message);

//결론 : 여러가지 방법 중에 다른 메소드(기능)와의 동작 그리고 재사용성을 고려해서 적합한 것으로 선택.!!
		
		
		
		}//main end
	
		//main 에서만 사용할 메소드. static 은 static 만 사용 가능합니다.(공유 영역에 있는 것 끼리 사용)
		static void print(boolean result , String message) {
			if(result) {
				System.out.print(message + " 분양 가능합니다.");
				System.out.println("😃");
			} else {
				System.out.print(message + " 분양 자격이 안됩니다.");
				System.out.println("😓");
			}
			//info();			//오류:static 만 사용 가능합니다.
		}
		
		void info() {
			System.out.println("동물 입양 커뮤니티입니다.");
		}

}







