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
		// ���� ���Ͽ� ������ Ŭ���̾�Ʈ�� ������ �˾ƿ��� �κ�
		InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
		consoleLog("[Server] ����� from " + inetSocketAddress.getHostName() + " : " + inetSocketAddress.getPort() + " / "
				+ inetSocketAddress.getHostString());
		BufferedReader br = null;
		PrintWriter pr = null;
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
			pr = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"), true);

			while (true) {
				String message = br.readLine();
				if (message == null) {
					consoleLog("Ŭ���̾�Ʈ�� ������ ������ϴ�.");
					break;
				}
				if (message.toUpperCase().equals("QUIT")) {
					consoleLog("Ŭ���̾�Ʈ�� ������ ������ϴ�.");
					break;
				}
				// ���� �ֿܼ� ���Ź��� �޼����� ������
				consoleLog("received : " + message);
				// �����͸� Ŭ���̾�Ʈ�� ������
				pr.println(message);
			}
		} catch (SocketException e) {
			consoleLog("Ŭ���̾�Ʈ�� ������ ������ϴ�.");
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

	// ���ڿ��� �޾Ƽ� ������ִ� �Լ�(��� �ְ� ���� ������ �������� ����Ѵ�. - �ڵ尡 �ſ� ª������!)
	private void consoleLog(String message) {
		System.out.println("[Server :" + getId() + "]" + message);
		// getID�� �����忡�� ���´�.

	}

}