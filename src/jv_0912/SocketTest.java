package jv_0912;

import java.io.InputStream;
import java.net.Socket;
import java.util.Arrays;

public class SocketTest {

	public static void main(String[] args) throws Exception{
		//Ŭ���̾�Ʈ ���� ���α׷�
		Socket socket = new Socket("localhost",8888);
		System.out.println("���� ����");
		
		InputStream in = socket.getInputStream();
		//���� �޼ҵ忡�� �о�´�.
		byte[] buff = new byte[20];
		//���� ����
		in.read(buff);//�������� ���۷� �о���δ�.
		
		System.out.println(new String(buff));
		in.close();		
		socket.close();

	}

}
