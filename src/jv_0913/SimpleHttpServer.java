package jv_0913;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleHttpServer {
	private static final int SERVER_PORT = 8888;
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			// ���� ���� ����
			serverSocket = new ServerSocket();
			String localhost = "localhost";
			// ���� ���� ���ε�
			serverSocket.bind(new InetSocketAddress(localhost, SERVER_PORT));
			consoleLog("bind : " + localhost + ":" + SERVER_PORT);
			// �ݺ��ϸ� Ŭ���̾�Ʈ ������ ��ٸ��� ���ӽ� ���ο� ���ϰ� �̸� ó���ϱ� ���� �����带 �����Ѵ�.
			while (true) {
				Socket socket = serverSocket.accept();
				// HTTP ��û�� ó���� �����带 ������ �� �����Ѵ�.
				new RequestHandler(socket).start();
			}
		} catch (IOException e) {
			consoleLog("error : " + e.toString());
		} finally {
			try {
				if (serverSocket != null)
					serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	private static void consoleLog(String message) {
		System.out.println("[Server :" + Thread.currentThread() + "]" + message);
		// getID�� �����忡�� ���´�.
	}
}