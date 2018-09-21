package jv_0912;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			
			socket = new Socket();
			//소켓 생성
			System.out.println("[client] : 연결을 요청했습니다.");
			socket.connect(new InetSocketAddress("localhost",8888));
			System.out.println("[client] : 연결을 성공했습니다.");
			OutputStream outputStream = socket.getOutputStream();
			InputStream inputStream = socket.getInputStream();

			
			String data = "Hello, Client?";
			outputStream.write(data.getBytes());
			outputStream.flush();
			
			byte[] buffer = new byte[128];
			int readByteCount = inputStream.read( buffer );
			
			data = new String( buffer, 0, readByteCount, "UTF-8" );
			System.out.println( "[클라이언트] 데이터 수신 :" + data );

			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(socket != null && socket.isClosed() == false) {
				try {
					socket.close();
				}catch(IOException ex) {
					ex.printStackTrace();
				}
			}
		}
		
}

}
