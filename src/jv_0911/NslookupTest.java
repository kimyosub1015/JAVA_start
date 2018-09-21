package jv_0911;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class NslookupTest {
	public static void main(String[] args) {
		BufferedReader br = null;
		InputStreamReader isr = null;
		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			while (true) {
				System.out.print(">");
				String line = br.readLine();
				if (line == null)
					break;
				if ("exit".equals(line) == true) {
					System.out.println("종료합니다.");
					break;
				}
				InetAddress inetAddress[] = InetAddress.getAllByName(line);
				for (InetAddress inetAddress1 : inetAddress) {
					System.out.println(line + " : " + inetAddress1.getHostAddress());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		} finally {

			try {
				if (isr != null)
					isr.close();
				if (br != null)
					br.close();
			}
			catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}