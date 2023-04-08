package chap22_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class _05_fileCopybyByteStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originFileNm = "C:/Java/test01.jpg";
		String copyFileNm = "C:/Java/test02.jpg";
		
		try {
			InputStream is = new FileInputStream(originFileNm);
			OutputStream os = new FileOutputStream(copyFileNm);

			is.transferTo(os);
			
			os.flush();
			
			is.close();
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}

}
