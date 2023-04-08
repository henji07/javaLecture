package chap22_IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class _02_byteStreamWrite {

	public static void main(String[] args) {
		
		try {
		OutputStream os = new FileOutputStream ("C:/Java/ex02.db");
	
		
		//1-1. 바이트 배열로 출력
		byte[] byteArr = new byte[5];
		
		for(int i = 0; i < 5; i++) {
			byteArr[i] = (byte)(i * 5);
		}
		
		//index == 1부터 3개를 출력
		os.write(byteArr, 1, 3);
		
		//2. 버퍼 비워주기
		os.flush();
		//3. 스트림 메모리에서 해제
		os.close();
		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}

}
