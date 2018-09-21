package jv_0910;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("d:\\phone.txt"));
			String phoneList;
			while((phoneList = br.readLine())!=null) {
				StringTokenizer st = new StringTokenizer(phoneList, " -.\t");
				while(st.hasMoreTokens()) {
					System.out.println(st.nextToken());
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
}