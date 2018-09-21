package jv_0910;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx2 {

		public static void main(String[] args) throws Exception{
			byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
			byte[] outSrc = null;
			//읽을 버퍼 설정
			byte[] arr = new byte[2];
			
			ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
			ByteArrayOutputStream output = new ByteArrayOutputStream();
			
			int data = 0;
			
			
			while(true) {
				//버퍼만큼 데이터 읽기, 읽을 데이터가 없으면 -1로 리턴
				int count =input.read(arr); 
						
				if(count == -1) {
					break;
				}
				System.out.println(Arrays.toString(arr));
				//ByteArrayOutputStream에 읽어온 데이터 수정
				output.write(arr);
			}
			/*
			while((data = input.read())!= -1);{
				output.write(data);
				
				}*/
			
			outSrc = output.toByteArray();
			System.out.println("Input Source : "+Arrays.toString(inSrc));
			System.out.println("Onput Source : "+Arrays.toString(outSrc));
			
			input.close();
			output.close();
	}

}
