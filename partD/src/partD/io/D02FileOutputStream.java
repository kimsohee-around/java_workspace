package partD.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//FileOutputStream 클래스는 출력스트림 OutputStream 의 자식 클래스 입니다.
//   바이트 기반 스트림  //
//예시 2: 입력장치- 콘솔  => 프로그램 =>   출력장치-파일
public class D02FileOutputStream {
    public static void main(String[] args) {

        int count = 0;
        int b;
        System.out.println("파일에 저장할 내용을 입력하세요. ↓");
        OutputStream fo=null;
        try {
            fo = new FileOutputStream("d:/temp/d02-2.txt");			
            //출력장치 파일시스템은 경로와 파일명으로 객체 생성
            while ((b = System.in.read()) != -1) {
                count++;
                fo.write(b);
            }
        } catch (IOException ex) {
            System.err.println("입출력오류: " + ex.getMessage());
        } 
        /*
        finally {
            if (fo != null) {
                try {
                    fo.close();			//파일 출력 장치에 대한 close 꼭 필요.- 지금은 없어도 정상동작 하지만 파일 입력 등 다른 실행과
                    					// 		동시에 일어날때는 실행에 오류가 생길 수 있습니다.
                } catch (IOException e) {
                }
            }
        }
        */
        System.out.println(count + " 바이트 파일에 저장.");
    }
}
/*
컴퓨터 공학 전반에서 이야기되는 스트림(Stream)은 데이터가 출발지에서
도착지로 단일 방향으로 흘러가는 개념을 의미한다. 
데이터는 키보드에서 프로그램으로, 프로그램에서 모니터로, 프로그램에서 파일로 혹은 소켓과 소켓으로 흐를 수 있다.
프로세스가 데이터의 도착지라면 입력 스트림(InputStream), 프
로세스가 데이터의 출발지라면 출력 스트림(OutputStream) 이라고 불린다. 기준은 항상 프로그램이다.
 */
