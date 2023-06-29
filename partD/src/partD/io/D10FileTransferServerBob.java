package partD.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

//클라이언트가 파일을 보내면 서버가 받습니다.파일을 정상적으로 받기 완료하면 클라이언트에게 '서버 파일 받기 완료.' 메시지 보냅니다.
//바이트 기반 스트림  //
//예시 9: 입력장치- 네트워크 소켓 => 프로그램 =>  출력장치-네트워크 소켓  +---+ 네트워크를 이용해서 클라이언트가 서버에게 파일을 보냅니다.(서버를 먼저 실행하기)
public class D10FileTransferServerBob {
	//서버로 동작하는 main
	public static void main(String[] args) {
		
		File f=null;
		try 
		(
				ServerSocket server = new ServerSocket();
		
		)
		{
			server.bind(new InetSocketAddress("192.168.0.145", 5050));		
						//소켓연결 요청을 수락할 서버의 IP주소, 클라이언트와 약속한 애플리케이션 포트번호
			System.out.println("[서버 준비 완료 : 연결요청 기다림]");
			Socket socket = server.accept();

			OutputStream os = socket.getOutputStream();		//소켓으로 만드는 출력 스트림
			InputStream is = socket.getInputStream();		//소켓으로 만드는 입력 스트림

			BufferedInputStream bis = new BufferedInputStream(is);
			DataOutputStream dos = new DataOutputStream(os);		//클라이언트에게 파일전송 성공여부 메시지를 보낼 네트워크 출력 소켓의 보조스트림
			DataInputStream dis = new DataInputStream(is);         //파일명,파일크기를 전송 받기 위한 네트워크 입력 소켓의 보조스트림
			BufferedOutputStream bos;						//클라이언트가 보낸 파일을 파일 장치로 출력(저장)하기 위한 보조 스트림
			
			f = File.createTempFile("d:/temp/~~t", ".tmp");   //네트워크 파일 전송시 임시파일을 사용함. 파일 전송 오류 생겼을 때 처리를 위함.
			String filename = dis.readUTF();			//클라이언트가 전송한 파일명 수신받아 저장하기
			
			//클라이언트가 보내는 드라이브와 폴더(경로)를 그대로 쓰고 있으므로 해당 드라이브에 폴더가 없으면 오류가 생깁니다.
			//			나중에 문자열 조작을 잘해서 경로명을 바꾸게도 해보세요.
			int idx = filename.lastIndexOf(".");		// 전송받을 파일명을 . 기호를 중심으로 확장자와 분리하기  
			String new1 = filename.substring(0, idx);	// 파일이름
			String new2 = filename.substring(idx);	//확장자
			File newf = new File(new1 + "_copy"+new2);		//파일이름에 _copy 를 추가하여 변경하기
			
			
			long fsize ;
			if (filename != null) {
				bos = new BufferedOutputStream(new FileOutputStream(f));			//파일로 저장하기 위한 출력 보조 스트림
				fsize = dis.readLong();					////클라이언트가 전송한 파일크기를 수신받아 저장하기
				System.out.println("받을 파일 : " + filename + ",파일크기 : " + fsize + " 바이트.");

				int bytes; int cnt=0;
				while ((bytes = bis.read()) != -1) {		//bis 로부터 데이터 읽어오기(입력)
					bos.write(bytes);						//bos 로 데이터 내보내기(출력)
					cnt++;									//읽은 바이트수 증가
					if(cnt == fsize) 				//fsize 파일크기 와 실제로 전송받은 cnt 가 같아야 읽기/쓰기 종료.(bis 가 네트웍에서 올때 -1 체크 안됨)
						dos.writeUTF("서버 파일 받기 완료.!");
				}
				
				bos.close();
				bis.close();
				dos.close();
				dis.close();
				f.renameTo(newf);				//임시파일 사용할 때 파일이름을 변경
			}
		} catch (Exception e) {
			if(f!=null) f.delete();
		}
	}

}
// if(oldFile.exists()) oldFile.delete();
