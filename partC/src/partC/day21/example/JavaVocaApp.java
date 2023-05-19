package partC.day21.example;

import java.util.Scanner;

public class JavaVocaApp {

	//단어장 프로그램
	public static void main(String[] args) {
		
		JavaVocaNote myNote = new JavaVocaNote();
		
		Scanner sc = new Scanner(System.in);
		String english;
		String korean;
		String level;
		String sel; 
		boolean run = true;
		String path = "D:\\iclass0419\\javavoca.txt";
		//1.프로그램을 시작하면 저장된 단어들을 파일에서 읽어옵니다.
		myNote.load(path);
		
		System.out.println("선택 기능 👉 [n]새 단어 저장 [s]단어 찾기 [g]그룹선택 보기   [a]전체보기 [e]프로그램 끝내기");
		
		while (run) { 
			System.out.print("선택 ✏ ->");
			sel = sc.nextLine();
			
			switch (sel) {
				case "n": 
					System.out.print("단어 입력 ✏ ");
					english = sc.nextLine(); 
					System.out.print("뜻(의미) ✏ ");
					korean = sc.nextLine();
					System.out.print("그룹(1:기초,2:중급,3:고급) ✏ ");
					level = sc.nextLine();
					//add()메소드 실행하기
					JavaVoca v = new JavaVoca(english, korean, level);   
					v.setLevel(level);  //level 1,2,3 입력 받은 것을 해당 문자열로 변환하기
					myNote.add(v);
					break;
				case "s":
					System.out.print("찾을 자바 단어 입력 ✏ ");
					english = sc.nextLine(); 
					JavaVoca s = myNote.getVoca().get(english);	//???????
					if(s==null) System.out.println("찾는 단어가 없습니다.");
					else System.out.println("단어를 찾았습니다. => " + s);
					break;
				case "g":
					break;
				case "a":
					//화면에 모두 출력 메소드 호출
					myNote.print();
					break;
				case "e":
					run=false;		//종료조건
					break;
			}	
		} //while end
		System.out.println("::::::::: 너의 자바 단어장을 종료합니다. !!! :::::::::::::");
	}//main end
}