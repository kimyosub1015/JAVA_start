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
			// 서버 소켓 생성
			serverSocket = new ServerSocket();
			String localhost = "localhost";
			// 서버 소켓 바인딩
			serverSocket.bind(new InetSocketAddress(localhost, SERVER_PORT));
			consoleLog("bind : " + localhost + ":" + SERVER_PORT);
			// 반복하며 클라이언트 접속을 기다리고 접속시 새로운 소켓과 이를 처리하기 위한 쓰레드를 수행한다.
			while (true) {
				Socket socket = serverSocket.accept();
				// HTTP 요청을 처리할 쓰레드를 생성한 후 실행한다.
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
		// getID는 쓰레드에서 나온다.
	}
}