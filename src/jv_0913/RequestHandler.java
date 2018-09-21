package jv_0913;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.file.Files;

public class RequestHandler extends Thread {
	private Socket socket = null;

	public RequestHandler(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		BufferedReader br = null;
		OutputStream os = null;

		try {
			// ���ὺƮ�� ����
			// ���� ���Ͽ� ������ ������ �˾ƿ��� �κ�
			InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
			consoleLog("[Server] ����� from " + inetSocketAddress.getHostName() + " : " + inetSocketAddress.getPort()
					+ " / " + inetSocketAddress.getHostString());
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
			os = socket.getOutputStream();

			// �ݺ��ؼ� ��Ʈ���� �а� ��
			String line = "";
			String request = null;
			while (true) {
				line = br.readLine();
				if (line == null || "".equals(line)) {
					break;
				}
				// ù�ٸ� �о�´�.
				if (request == null) {
					request = line;
				}
			}
			consoleLog(request);
			// ������� �м��Ѵ�.
			// tokens[0] = "GET"; (�޼ҵ�)
			// tokens[1] = "/" (URL)
			// tokens[2] = HTTP/1.1(����)
			String[] tokens = request.split(" ");

			if ("GET".equals(tokens[0])) {
				// GET�޼ҵ� ȣ��� ���� ó��
				responseStaticResource(os, tokens[1], tokens[2]);
				// �� ���,�� ����Ÿ,����
			} else {
				// POST,PUT ���� http �޼ҵ� ȣ��� ���� ó��
				response400Error(os,tokens[2]);
			}
		} catch (IOException e) {
			consoleLog("error :" + e);
		} finally {
			try {
				if (os != null)
					os.close();
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
	private void responseStaticResource(OutputStream os, String url, String protocol) throws IOException {
		// TODO Auto-generated method stub
		if ("/".equals(url)) {
			url = "/index.html";
			// ���������� ó���ϰԲ� �������� �˾Ƽ� �Ľ�
		}
		// ������ ���� �ý��ۿ��� �ش� ������ ����
		File file = new File("./webapp" + url);
		if (file.exists() == false) {
			// ������ ���� ������ 404 ���� �߻�(�������� ã�� ���� �����ϴ�.)
			response404Error(os,protocol);
			return;
		}
		// ������ ���̳ʸ� �迭�� �о�´�
		byte[] body = Files.readAllBytes(file.toPath());
		String mimeType = Files.probeContentType(file.toPath());
		consoleLog("�ش� �������� mimetype�� : " + mimeType);

		// Ŭ���� �������� ������ ����
		// 1. ��� �ۼ�
		os.write((protocol + "200 OK\r\n").getBytes("UTF-8"));
		os.write(("Content-Type" + mimeType + ";charset =utf-8\r\n").getBytes("UTF-8"));
		os.write("\r\n".getBytes("UTF-8"));
		os.write(body);
		os.flush();

	}
	public void response400Error(OutputStream os, String protocol) throws IOException {
		File file = new File("./webapp/error/400.html");
		byte[] body = Files.readAllBytes(file.toPath());

		os.write((protocol + "400 Bad Request\r\n").getBytes("UTF-8"));
		os.write("Content-Type:text.html;charset=utf-8\r\n".getBytes("UTF-8"));
		os.write("\r\n".getBytes("UTF-8"));
		os.write(body);
		os.flush();
	}
	public void response404Error(OutputStream os, String protocol) throws IOException {
		File file = new File("./webapp/error/404.html");
		byte[] body = Files.readAllBytes(file.toPath());

		os.write((protocol + "404 File Not Found \r\n").getBytes("UTF-8"));
		os.write("Content-Type:text.html;charset=utf-8\r\n".getBytes("UTF-8"));
		os.write("\r\n".getBytes("UTF-8"));
		os.write(body);
		os.flush();
	}
	private void consoleLog(String message) {
		System.out.println("[Server :" + Thread.currentThread() + "]" + message);
		// getID�� �����忡�� ���´�.
	}
}