package partD.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;


//바이트 기반 스트림  //
//예시 4: 입력장치- 파일 => 프로그램 =>  출력장치-콘솔  +---+ byte[] 바이트 배열 사용 하기 전후 실행 시간 비교
//		 단, 파일의 인코딩 형식과 출력하는 프로그램(이클립스)의 인코딩 형식이 일치해야 문자가 정상적으로 보입니다. 
public class D04FileInputStreamBoth {

    public static void main(String[] args) throws IOException {
        InputStream fin = new FileInputStream("d:/temp/PFRO.log");
        //파일이 해당경로에 있는지 확인해 보세요.없으면 .log 파일 중에 있는 것으로 하세요.

        int rByte;

        System.out.println("[파일을 바이트 단위로 읽어서 System.out 에 출력]\n\n");
        long cnt1=0;
        long start = System.nanoTime();
        while(true) {
            rByte = fin.read();   //읽은 바이트값. 여기서는 데이터. 

            if(rByte == -1) break;	//파일입력이므로 파일의끝 EOF 일때 read() 리턴은 -1
            cnt1++;					//읽은 횟수 read 카운트 => 배열 사용안할 때는 읽은 바이트 수와 같음.
            System.out.write(rByte);           
        }
        long worktime = System.nanoTime()-start;
        fin.close();				//같은 파일을 한번 더 읽기위해 close 필요
        
        
        System.out.println("[파일을 바이트buf(배열)크기로 읽어서 System.out 에 출력]\n\n");
        fin = new FileInputStream("d:/temp/PFRO.log");	//같은 파일이지만 다시 읽어오기 위해 스트림 객체 생성

        byte[] buf = new byte[10];      //byte[] buf = new byte[fis.available()];   //현재 파일 포인터 위치에서 읽을 수 있는 바이트 수 반환
        int bcnt=0;			//실제로 읽은 바이트 수. 마지막에는 10바이트 보다 적은 데이터를 읽을수 있다.
        long cnt2=0;		//
        start = System.nanoTime();

        while(true) {
            bcnt=fin.read(buf);         //fis.read(buf,0,buf.length)
            System.out.write(buf);
            if(bcnt==-1) break;
            cnt2+=bcnt;
            //data+=new String(buf,0,bcnt);
        }
        System.out.println("\n첫 번째 => "+ cnt1 + "바이트 읽음.");
        System.out.println(" *실행시간 : " + worktime +"ns");

        System.out.println("\n두 번째 => "+ cnt2 + "바이트 읽음.");
        System.out.println("**실행시간 : " + (System.nanoTime()-start) +"ns");

        fin.close();

    }
}
