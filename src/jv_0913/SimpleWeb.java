package jv_0913;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWeb {

	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket(8111);

		for (int i = 0; i < 10; i++) {
			Socket socket = serverSocket.accept();
			OutputStream out = socket.getOutputStream();

			String msg = "HELLO JAVA WORLD";

			out.write(new String("HTTP/1.1 200 ok\r\n").getBytes());
			out.write(new String("Content-Length:" + msg.getBytes().length + "\r\n").getBytes());
			out.write(new String("Content-type:text/html; charset=UTF-8\r\n\r\n").getBytes());
			out.write(msg.getBytes());
			out.flush();

			out.close();
			socket.close();
		}
		serverSocket.close();
	}
}
