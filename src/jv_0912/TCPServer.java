package jv_0912;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class TCPServer {
	private static final int SEVER_PORT = 8888;
	@SuppressWarnings("null")
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		InputStream inputStream = null;
		OutputStream outputStream = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket();
			
			InetAddress inetAddress = InetAddress.getLocalHost();
			String localhostAddress = inetAddress.getHostAddress();
			//serverSocket.bind( new InetSocketAddress("192.168.1.20", SEVER_PORT ) );
			serverSocket.bind( new InetSocketAddress( "localhost", SEVER_PORT ) );
			System.out.println( "[����] ���� ��ٸ�");
			socket = serverSocket.accept();
			System.out.println( "[����] �����");
			
			InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
			System.out.println("[Server] ����� from "+inetSocketAddress.getHostName()+" : "+inetSocketAddress.getPort()+" / "+inetSocketAddress.getHostString() );
			inputStream = socket.getInputStream();
			//while���� �ɾ ���� �������ڸ��� ������ ���� ��� �����ϰ� ������. �׸��� ���ڸ� ������ �������� �ǽð����� �ް� ����.
			//�ѱ��� ������
			while(true) {
				byte [] buffer = new byte[256];
				
				int readByteCount = inputStream.read(buffer);
				if(readByteCount<0) {
					System.out.println("[Server] Ŭ���̾�Ʈ�� ���� ����" );
					break;
				}
				
				String data = new String(buffer,0,readByteCount);	
				System.out.println("[Client : ]"+data);
				
				outputStream = socket.getOutputStream();
				outputStream.write(("["+data+"]").getBytes());
				outputStream.flush();
			}
			//���� ���� ������ ������ ���� ���� Ŭ���̾�Ʈ�� ���� ����
			
			/*
			outputStream = socket.getOutputStream();
			String data = "Hello Server!";
			outputStream.write(data.getBytes());
			outputStream.flush();
			*/
		}catch(SocketException e) {
			System.out.println("������ Ŭ���̾�Ʈ�� ���� �������ϴ�.");
		}
		catch(IOException e){
			e.printStackTrace();
		}finally {
			if(serverSocket != null && serverSocket.isClosed() == false) {
				try {
					serverSocket.close();
				}catch(IOException ex) {
					ex.printStackTrace();

				try{
					if(socket != null) 			socket.close(); 
					}catch(Exception e) {
						e.printStackTrace();
					}
				
				}
			}
		}

	}

}
