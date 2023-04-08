package chap22_IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class _01_byteStreamWrite {

	public static void main(String[] args) {
		
		try {
		OutputStream os = new FileOutputStream ("C:/Java/ex01.db");
		
		byte num1 = -128;
		byte num2 = 127;
		byte num3 = 0;
		
		os.write(num1);
		os.write(num2);
		os.write(num3);		
		
		//2. 버퍼 비워주기
		os.flush();
		
		//3. 스트림 메모리에서 해제
		os.close();
		
		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}

}
