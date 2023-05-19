package partC.day21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C14FileWriteTest {

	public static void main(String[] args) {
	//   D:\iclass0419 경로 note.txt 파일로 출력(저장하기.쓰기)
			String path ="D:\\iclass0419\\note.txt";
			File file = new File(path);
			Scanner sc = new Scanner(System.in);		//표준입력 스캐너 객체
			
			//파일 출력 클래스
			PrintWriter fpw = null;
			try {
				fpw = new PrintWriter(file);  //파일출력 PrintWriter 객체
				
				//테스트용
				//fpw.print("테스트");  fpw.println("TEST"); fpw.print("테스트");
				while(true) {
					System.out.print("자바에서 쓰는 영어 단어 입력 >>> " );
					String english = sc.nextLine();
					if(english.equals("_end_")) break;		//종료조건
					System.out.print("단어의 의미를 입력 하세요. >>> ");
					String korean = sc.nextLine();
					
					fpw.print(english);			//fpw 에서 지정한 파일로 쓰기
					fpw.print("/");
					fpw.println(korean);
					
					System.out.println("1개 단어 추가 완료!");
				}
				
				System.out.println("단어 등록 완료!!!");
				
			} catch (FileNotFoundException e) {
				System.out.println("파일로 저장하기 - 출력 예외 : " + e.getMessage());

			} finally {
				if(fpw !=null) fpw.close();
				sc.close();
			}	
	
			
			
			
	}
}
