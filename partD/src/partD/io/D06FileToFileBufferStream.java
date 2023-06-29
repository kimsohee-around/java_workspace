package partD.io;
import java.io.*;

//바이트 기반 스트림  //
//예시 6: 입력장치- 파일 => 프로그램 =>  출력장치-파일  +---+ byte[] 바이트 배열과 버퍼스트림 사용에 대한 속도 비교
public class D06FileToFileBufferStream
{
	public static void main( String[] args ) 
	{

		int count=0;
		int b; 
		System.out.println("[입력]파일 A를 [출력]파일 B로 복사합니다.. ↓");
		byte[] keyin = new byte[20];
		int bytesCnt=0;

		long start = System.nanoTime();
        System.out.println("/// byte[] 배열 사용할 때 ///");

		try (
				FileInputStream fi = new FileInputStream("d:/temp/cafe.jpg");
				FileOutputStream fo = new FileOutputStream("d:/temp/cafe_copy_1.jpg");		//이미지 파일
			){
			while((b = fi.read(keyin)) != -1) {		//파일의 데이터가 20바이트씩 keyin 배열에 저장됩니다. b는 실제 읽은 바이트 수.
				fo.write(keyin,0,b);	//keyin 배열에 읽은 내용을 0번 인덱스부터 b 바이트 크기만큼 파일로 출력하기
										//fo.write(keyin) 는 무조건 배열의 크기 20바이트를 파일로 출력해서
										//				   마지막에는 읽은 바이트보다 더 많이 출력할 수도 있습니다.
				count++;			//몇번 읽어왔는지 카운트
				bytesCnt+=b;        //b를 누적해서 더해 놓기
			}
		} catch( IOException ex ) {
			System.err.println( "입출력오류: " + ex.getMessage() );
		}

		System.err.println(" *첫 번째 => " + bytesCnt + " 바이트복사됨.(read " + count + " 번)");
		System.out.println(" *실행시간 : " + (System.nanoTime()-start) +"ns");
		
		System.out.println("\n/// BufferedStream  사용할 때 ///");
		//keyin 배열을 사용하지 않고 입출력 스트림에 버퍼 기능 장착된 버퍼스트림을 사용합니다.

		try (
				FileInputStream fi = new FileInputStream("d:/temp/cafe.jpg");
				FileOutputStream fo = new FileOutputStream("d:/temp/cafe_copy_2.jpg");		//이미지 파일
			){
			BufferedInputStream bis = new BufferedInputStream(fi);
			BufferedOutputStream bos = new BufferedOutputStream(fo);
			count=0;bytesCnt=0;
			start = System.nanoTime();
			while((b = bis.read()) != -1) {		
				count++;			//몇번 읽어왔는지 카운트
				bos.write(b);
				bytesCnt++;        //b를 누적해서 더해 놓기
			}
			
			bis.close();
			bos.close();		//close 를 안하면 파일탐색기의 파일 크기가 원본보다 작음. (98,304) 전체 파일을 읽었지만 버퍼에서 출력되지 않음. flush() 메소드 실행해도 됨.
//			bos.flush();		//close 와 flush 동작을 확인하기 위해 주석처리하고 실행헀을 때 실행결과 복사된 파일의 크기를 확인하세요. 
		} catch( IOException ex ) {
			System.err.println( "입출력오류: " + ex.getMessage() );
		}
		
		System.err.println(" *두 번째 => " + bytesCnt + " 바이트복사됨.(read " + count + " 번)");
	     System.out.println("**실행시간 : " + (System.nanoTime()-start) +"ns");
	}
}
/*
[입력]파일 A를 [출력]파일 B로 복사합니다.. ↓
/// byte[] 배열 사용할 때 ///
 *첫 번째 => 105040 바이트복사됨.(read 5252 번)
 *실행시간 : 45375000ns

/// BufferedStream  사용할 때 ///
 *두 번째 => 105040 바이트복사됨.(read 105040 번)
**실행시간 : 8710100ns




*/