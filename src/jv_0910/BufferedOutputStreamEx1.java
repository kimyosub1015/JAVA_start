package jv_0910;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx1 {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("d:\\123.txt");
			//fos 변수로 지정된 파일아웃풋스트림을 통해 123.test로 저장하도록 한다.
			BufferedOutputStream bos = new BufferedOutputStream(fos,5);
			//파일 123.txt에 1부터 9까지 출력한다.
			for(int i = '1';i<'9';i++) {
				bos.write(i);
				System.out.println(i);
			}
			System.out.println("출력 완료");
			fos.close();					
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
