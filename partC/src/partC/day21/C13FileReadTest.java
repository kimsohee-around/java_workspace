package partC.day21;

import java.io.File;		//io는 input과 output. 입출력 클래스들의 패키지 입니다.
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C13FileReadTest {
	
	public static void main(String[] args) {
//   D:\iclass0419 에 저장된 words.txt 파일로부터 입력(읽어오기)
		String path ="D:\\iclass0419\\words.txt";
		File file = new File(path);		//1. 읽어올 파일에 대한 객체를 생성합니다.
		
//		Scanner fscc = new Scanner(file);		//2. 파일을 다루는 Scanner 객체 생성(파일입력)
//		3.입출력을 다루는 객체들은 Exception(예외는 프로그램에서 발생하는 오류) 처리를 개발자가 해야합니다.
		
		Scanner fsc = null;
		
		try {			
			//4. try {   } 명령문을 실행하다가 Exception(예외)가 생기면 catch{  }를 실행합니다.
			fsc = new Scanner(file);
			
			//7. 파일에서 읽어온 데이터를 콘솔에 출력하기
			while(fsc.hasNext()) {		//한줄씩 가져오기 했을 때 , 읽어올 것이 더 있나?
				System.out.println(fsc.nextLine());		//한 줄씩(엔터까지) 읽어오는 메소드
			}
			
			
			System.out.println("정상적으로 파일 읽어오기 끝!!");
		}catch (FileNotFoundException e) {	//5. 예외가 발생한 정보를 Exception 객체에 저장합니다.
			//FileNotFoundException 예외만 처리합니다.
			
			System.out.println("파일로부터 읽어오기 - 입력 예외 : " + e.getMessage());
			//예외의 원인을 사용자에게 알려주기
		}finally {
			//6. 정상실행과 예외발생 모두 사용한 자원을 종료하기 위한 명령문을 작성합니다.
			if(fsc !=null) fsc.close();
		}
		
// 참고 : 예외 처리에 try~ catch 와 throws (떠넘기기)
//   	 main 메소드에서 throws를 하면 JVM 이 처리합니다. JVM은 자바프로그램 실행하는 가상머신.		
	}

}





