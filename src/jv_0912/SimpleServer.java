package jv_0912;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

	public static void main(String[] args) throws Exception{
		ServerSocket serverSocket = new ServerSocket(8888);
		System.out.println("���� �غ���");
		
		Socket socket = serverSocket.accept();
		System.out.println("Ŭ���̾�Ʈ �����");
		
		byte[] arr = "�ȳ��ϼ���!".getBytes();
		OutputStream out = socket.getOutputStream();
		out.write(arr);
		out.flush();
		System.out.println("Ŭ���̾�Ʈ�� ���� �Ϸ�");
		out.close();
		socket.close();
		serverSocket.close();
	}

}
