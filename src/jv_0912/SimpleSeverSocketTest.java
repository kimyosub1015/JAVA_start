package jv_0912;

import java.net.ServerSocket;
import java.net.Socket;

public class SimpleSeverSocketTest {

	public static void main(String[] args) throws Exception{
		
		ServerSocket serverSocket = new ServerSocket(8888); // �����ڿ� ��Ʈ��ȣ�� �Ҵ�		
		System.out.println("Ŭ���̾�Ʈ ���� �����");
		Socket socket = serverSocket.accept();
		
		System.out.println("Ŭ���̾�Ʈ���� �����"+socket);
		
		socket.close();
		serverSocket.close();
		
	}

}
