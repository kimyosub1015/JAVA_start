package jv_0911;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class LocalHost {

	public static void main(String[] args) {
		try {
		InetAddress inetAddress = InetAddress.getLocalHost();
		System.out.println(inetAddress.getLocalHost());
		System.out.println(inetAddress.getHostName());
		System.out.println(inetAddress.getHostAddress());
		System.out.println(Arrays.toString(inetAddress.getAddress()));
		System.out.println(inetAddress.getAddress());
//		System.out.println(inetAddress.get("www.naver.com"));
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}

	}

}