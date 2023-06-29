package partD.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//바이트 기반 스트림  //
//예시 5: 입력장치- 파일 => 프로그램 =>  출력장치-파일 
public class D05FileToFile {
	//byte 배열을 프로그램 버퍼로 사용할 것인가? 선택해서 하세요.
	
	public static void main(String[] args) {
		
		int count =0;
		try(
				//파일 입력 스트림(입력장치)
		InputStream fin = new FileInputStream("d:/temp/cafe.jpg");		//복사하고 싶은 파일
				//파일 출력 스트림(출력장치)
		OutputStream fout = new FileOutputStream("d:/temp/cafe_copy.jpg");	//복사해서 생성될 파일 
		){
			int b;
			 while((b = fin.read())!=-1) {
	        		count++;
		            fout.write(b);				
		    }
		
		} catch( IOException ex ) {
            System.err.println( "입출력오류: " + ex.getMessage() );
        }
            System.out.println("===" + count + " 바이트 파일 복사완료.===");
	}
}
