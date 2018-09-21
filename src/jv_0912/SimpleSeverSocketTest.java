package jv_0912;

import java.net.ServerSocket;
import java.net.Socket;

public class SimpleSeverSocketTest {

	public static void main(String[] args) throws Exception{
		
		ServerSocket serverSocket = new ServerSocket(8888); // 생성자에 포트번호를 할당		
		System.out.println("클라이언트 연결 대기중");
		Socket socket = serverSocket.accept();
		
		System.out.println("클라이언트에서 연결됨"+socket);
		
		socket.close();
		serverSocket.close();
		
	}

}
