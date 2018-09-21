package jv_0913;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient2 {

	public static void main(String[] args) {
		Socket socket = null;
		Scanner scanner = null;

		BufferedReader br = null;
		PrintWriter pw = null;

		try {
			socket = new Socket();
			scanner = new Scanner(System.in);
			socket.connect(new InetSocketAddress("localhost", 8888));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"),true);

			while (true) {
				System.out.print(">>");
				String message = scanner.nextLine();
				if ("exit".equals(message)) {
					break;
				}
				pw.println(message);

				String echoMessage = br.readLine();
				if (echoMessage == null) {
					System.out.println("[Client] 서버 연결 종료");
					break;
				}
				System.out.println("<<" + echoMessage);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		} finally {
			try {
				if (socket != null)
					socket.close();
				if (scanner != null)
					scanner.close();
				if (br != null)
					br.close();
				if (pw != null)
					pw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
