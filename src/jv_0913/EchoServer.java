package jv_0913;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	private static final int SERVER_PORT = 8888;
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			String localhost = "localhost";
			serverSocket.bind(new InetSocketAddress(localhost,SERVER_PORT));
			System.out.println("[¼­¹ö] Binding" + localhost + ":" + SERVER_PORT);
			while(true) {
				Socket socket = serverSocket.accept();
				new EchoServerReciveThread(socket).start();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(serverSocket != null) serverSocket.close();
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}

	}

}
