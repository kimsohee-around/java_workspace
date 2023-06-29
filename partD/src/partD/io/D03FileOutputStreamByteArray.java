package partD.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//바이트 기반 스트림  //
//예시 3: 입력장치- 콘솔 => 프로그램 =>  출력장치-파일  +---+ byte[] 바이트 배열을 버퍼로 사용함.
public class D03FileOutputStreamByteArray {
    public static void main(String[] args) {

        int count=0;
        int r;
        System.out.println("저장할 내용을 입력하세요. ↓");
        byte[] keyin = new byte[20];		//프로그램에서 지정하여 배열을 버퍼처럼 사용하기
        								    //바이트 단위 입출력은 입출력 데이터의 양이 많을 때 실행 속도가 늦습니다.
        									//프로그램에서 처리하는 단위를 20바이트로 합니다. 
        int rBytes=0;
        try (
       		OutputStream fo = new FileOutputStream("d:/temp/d02-3.txt");
        	){
            while((r = System.in.read(keyin)) != -1) {		
            	//r은 실제 입력된 바이트 수로 리턴됩니다.데이터는 배열 keyin에 저장합니다.
            	
                fo.write(keyin, 0, r);		//keyin 배열에서 출력할 위치 인덱스 0부터 r 바이트 만큼.
                rBytes+=r;        //r 실제 입력한(읽기) 바이트 수
                 count++;					//프로그램에서 입출력한 횟수 카운트
            }
        } catch( IOException ex ) {
            System.err.println( "입출력오류: " + ex.getMessage() );
        }

        System.out.println(rBytes + " 바이트 파일에 저장.(write: " + count + " 번)");

    }	//실행할 때 내용을 적어도 100바이트 정도로 하세요.
}




