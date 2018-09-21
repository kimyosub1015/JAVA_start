package jv_0912;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			int i = 0;
			socket = new Socket();
			//���� ����
			System.out.println("[client] : ������ ��û�߽��ϴ�.");
			socket.connect(new InetSocketAddress("localhost",8888));
			System.out.println("[client] : ������ �����߽��ϴ�.");
			
			OutputStream outputStream = socket.getOutputStream();
			InputStream inputStream = socket.getInputStream();

			while(i<1) {
			Scanner scan = new Scanner(System.in);
			System.out.print(">>>");
			String data = scan.next();
			if(data.equals("exit")) {
				System.out.println("[client] : ������ �����߽��ϴ�.");
				break;
			}
			outputStream.write(data.getBytes());
			outputStream.flush();
			
			byte[] buffer = new byte[128];
			int readByteCount = inputStream.read( buffer );
			
			data = new String( buffer, 0, readByteCount, "UTF-8" );
			System.out.println( "<<<" + data );
			}
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
