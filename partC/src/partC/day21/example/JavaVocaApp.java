package partC.day21.example;

import java.util.Scanner;

public class JavaVocaApp {

	//단어장 프로그램
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String english;
		String korean;
		String level;
		String sel; 
		boolean run = true;
		//1.프로그램을 시작하면 저장된 단어들을 파일에서 읽어옵니다.
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
					break;
				case "s":
					break;
				case "g":
					break;
				case "a":
					break;
				case "e":
					break;
			}	
				
		} //while end
	}//main end
}