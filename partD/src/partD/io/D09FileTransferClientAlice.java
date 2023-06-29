package partD.io;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;


//바이트 기반 스트림  //
//예시 9: 입력장치- 네트워크 소켓 => 프로그램 =>  출력장치-네트워크 소켓  +---+ 네트워크를 이용해서 클라이언트가 서버에게 파일을 보냅니다.(서버를 먼저 실행하기)
//소켓은 네트워크 상의 컴퓨터가 데이터를 보내거나 받기 위해 사용하는 것이 네크워크 연결 접속점 이다.TCP와 UDP 프로토콜 즉 OSI 7 계층의 전송계층에서 동작한다.
public class D09FileTransferClientAlice {
	//클라이언트 동작하는 main
	public static void main(String[] args) {
		
		System.out.println("[연결 요청]");
		
		try(		Socket socket=new Socket();		) 	{
			socket.connect(new InetSocketAddress("192.168.0.145", 5050));		
				//소켓연결을 요청하는 서버의 IP주소, 서버와 약속한 애플리케이션 포트번호
			System.out.println("[연결 성공]");					//연결 오류일 때는 예외 발생
			
			InputStream is = socket.getInputStream();		//소켓으로 만드는 입력 스트림
			OutputStream os = socket.getOutputStream();		//소켓으로 만드는 출력 스트림
			
			//인코딩된문자열 파일명, Long 타입 파일크기 데이터를 네트워크로 출력할 소켓의 보조스트림 
			DataOutputStream dos = new DataOutputStream(os);	
			//서버가 보낸 데이터(인코딩된 문자열)를 받기 위해 네트워크에서 입력할 소켓의 보조스트림 
			DataInputStream dis = new DataInputStream(is);	
			
			String filename="d:/temp/cafe.jpg";
			File f= new File(filename);
			long fsize =f.length();		//파일의 크기를 구함
			
			System.out.println("전송할 파일은 " + filename + "입니다. 파일크기 : " + fsize + " 바이트.");
			dos.writeUTF(filename); 		//출력

			FileInputStream fis = new FileInputStream(filename);	//파일 장치에 대한 입력 스트림
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			int b;int cnt=0;
			dos.writeLong(fsize);			//출력
			while((b=bis.read())!=-1) {		//파일 장치에서 입력
				dos.write(b);				//소켓으로 출력. 	//bos 사용하면 오류. 출력은 동일한 리소스에 대해 2개의 보조출력스트림을 만들때 오류.
				cnt++;
			}
			if(cnt==fsize) 
				System.out.println("클라이언트 파일 보내기 성공!");

			System.out.println("/// 서버가 보낸 메시지 ///");
			System.out.println(dis.readUTF());

			dis.close();
			dos.close();
			fis.close();
			bis.close();
		}catch(IOException e) {
			e.printStackTrace();
//			System.out.println("예외 발생 : " + e.getMessage()); 
			
		}
	}

}
