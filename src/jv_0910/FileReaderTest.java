package jv_0910;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
	FileReader fr = null;
	FileInputStream fis = null;
	try {
		fr = new FileReader("d:\\hellottext.txt");
		fis = new FileInputStream("d:\\hellottext2.txt");
		int count = 0;
		int data = -1;
		while((data=fr.read()) != -1) {
			count++;
			System.out.print((char) data);
		}
		System.out.println("ÀÐÀº È½¼ö : "+count);
		System.out.println("******************");
		count = 0;
		data = -1;
		while((data=fis.read())!=-1) {
			count++;
			System.out.println((char)data);
		}
		System.out.println("ÀÐÀº È½¼ö : "+count);
	}catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
				if(fr != null) fr.close();
				if(fis!=null) fis.close();
			}catch(IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
