package jv_0910;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
				fis = new FileInputStream("d:\\googlelogo.png");
				fos = new FileOutputStream("d:\\googlelogo2.png");
				
				int data = -1;
				System.out.println("Start the Copy!");
				while((data = fis.read()) != -1) {
					fos.write(data);
					
				}
				System.out.println("Copy Complete!");
		}catch(Exception e1) {
			e1.printStackTrace();
		}finally {
			try {
			if(fis != null) fis.close();
			if(fos != null) fos.close();
			}
			catch(IOException e2) {
				e2.printStackTrace();
			}
		}
	}
}