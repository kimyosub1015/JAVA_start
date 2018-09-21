package jv_0913;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;

public class EchoServerReciveThread extends Thread {
	private Socket socket = null;

	public EchoServerReciveThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		// 서버 소켓에 접속한 클라이언트의 정보를 알아오는 부분
		InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
		consoleLog("[Server] 연결됨 from " + inetSocketAddress.getHostName() + " : " + inetSocketAddress.getPort() + " / "
				+ inetSocketAddress.getHostString());
		BufferedReader br = null;
		PrintWriter pr = null;
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
			pr = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"), true);

			while (true) {
				String message = br.readLine();
				if (message == null) {
					consoleLog("클라이언트와 연결이 끊겼습니다.");
					break;
				}
				if (message.toUpperCase().equals("QUIT")) {
					consoleLog("클라이언트와 연결이 끊겼습니다.");
					break;
				}
				// 서버 콘솔에 수신받은 메세지를 보여줌
				consoleLog("received : " + message);
				// 데이터를 클라이언트에 보내기
				pr.println(message);
			}
		} catch (SocketException e) {
			consoleLog("클라이언트와 연결이 끊겼습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pr != null)
					pr.close();
				if (br != null)
					br.close();
				if (socket != null)
					socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// 문자열을 받아서 출력해주는 함수(어떻게 주건 간에 지정된 형식으로 출력한다. - 코드가 매우 짧아진다!)
	private void consoleLog(String message) {
		System.out.println("[Server :" + getId() + "]" + message);
		// getID는 쓰레드에서 나온다.

	}

}