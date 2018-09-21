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
			// 연결스트림 생성
			// 서버 소켓에 접속한 정보를 알아오는 부분
			InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
			consoleLog("[Server] 연결됨 from " + inetSocketAddress.getHostName() + " : " + inetSocketAddress.getPort()
					+ " / " + inetSocketAddress.getHostString());
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
			os = socket.getOutputStream();

			// 반복해서 스트림에 읽게 함
			String line = "";
			String request = null;
			while (true) {
				line = br.readLine();
				if (line == null || "".equals(line)) {
					break;
				}
				// 첫줄만 읽어온다.
				if (request == null) {
					request = line;
				}
			}
			consoleLog(request);
			// 헤더값을 분석한다.
			// tokens[0] = "GET"; (메소드)
			// tokens[1] = "/" (URL)
			// tokens[2] = HTTP/1.1(버전)
			String[] tokens = request.split(" ");

			if ("GET".equals(tokens[0])) {
				// GET메소드 호출시 정상 처리
				responseStaticResource(os, tokens[1], tokens[2]);
				// 쓸 방법,쓸 데이타,버전
			} else {
				// POST,PUT 등의 http 메소드 호출시 오류 처리
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
			// 웹페이지를 처리하게끔 서버에서 알아서 파싱
		}
		// 서버의 파일 시스템에서 해당 파일을 읽음
		File file = new File("./webapp" + url);
		if (file.exists() == false) {
			// 파일이 만약 없으면 404 오류 발생(페이지를 찾을 수가 없습니다.)
			response404Error(os,protocol);
			return;
		}
		// 파일을 바이너리 배열로 읽어온다
		byte[] body = Files.readAllBytes(file.toPath());
		String mimeType = Files.probeContentType(file.toPath());
		consoleLog("해당 페이지의 mimetype는 : " + mimeType);

		// 클라우드 브라우저로 데이터 전송
		// 1. 헤더 작성
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
		// getID는 쓰레드에서 나온다.
	}
}