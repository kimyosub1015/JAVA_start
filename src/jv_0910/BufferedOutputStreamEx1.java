package jv_0910;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx1 {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("d:\\123.txt");
			//fos ������ ������ ���Ͼƿ�ǲ��Ʈ���� ���� 123.test�� �����ϵ��� �Ѵ�.
			BufferedOutputStream bos = new BufferedOutputStream(fos,5);
			//���� 123.txt�� 1���� 9���� ����Ѵ�.
			for(int i = '1';i<'9';i++) {
				bos.write(i);
				System.out.println(i);
			}
			System.out.println("��� �Ϸ�");
			fos.close();					
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
