package jv_0912;

import java.io.InputStream;
import java.net.Socket;
import java.util.Arrays;

public class SocketTest {

	public static void main(String[] args) throws Exception{
		//클라이언트 소켓 프로그램
		Socket socket = new Socket("localhost",8888);
		System.out.println("연결 성공");
		
		InputStream in = socket.getInputStream();
		//소켓 메소드에서 읽어온다.
		byte[] buff = new byte[20];
		//버퍼 선언
		in.read(buff);//서버에서 버퍼로 읽어들인다.
		
		System.out.println(new String(buff));
		in.close();		
		socket.close();

	}

}
