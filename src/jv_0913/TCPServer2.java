package jv_0913;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class TCPServer2 {
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
			serverSocket.bind(new InetSocketAddress("localhost", SEVER_PORT));
			System.out.println("[서버] 연결 기다림");
			socket = serverSocket.accept();
			System.out.println("[서버] 연결됨");

			InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
			System.out.println("[Server] 연결됨 from " + inetSocketAddress.getHostName() + " : "
					+ inetSocketAddress.getPort() + " / " + inetSocketAddress.getHostString());
			inputStream = socket.getInputStream();
			while (true) {
				byte[] buffer = new byte[256];

				int readByteCount = inputStream.read(buffer);
				if (readByteCount < 0) {
					System.out.println("[Server] 클라이언트와 연결 종료");
					break;
				}

				String data = new String(buffer, 0, readByteCount);
				System.out.println("[Client : ]" + data);

				outputStream = socket.getOutputStream();
				outputStream.write(("[" + data + "]").getBytes());
				outputStream.flush();
			}
		} catch (SocketException e) {
			System.out.println("서버가 클라이언트에 의해 닫혔습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (serverSocket != null && serverSocket.isClosed() == false) {
				try {
					serverSocket.close();
				} catch (IOException ex) {
					ex.printStackTrace();

					try {
						if (socket != null)
							socket.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
