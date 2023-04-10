package chap22_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class _12_printStream {

	public static void main(String[] args) {
		
		try {
			PrintStream ps = new PrintStream(new FileOutputStream("C:/Dev224/printStream.txt"));
			
			byte[] byteArr = {1, 2, 3, 4, 5, 127};		
			
			for(int i = 0; i < byteArr.length; i++) {
				ps.println(byteArr[i]);
			}
			//출력스트림에는 값을 찍어볼 수 있는 기능이 없는데
			//PrintStream/PrintWriter를 이용하면 
			//값을 콘솔에 출력하는 것이 아니고 출력 형식으로 같이 내보내준다. 
			//OutputStream os = new FileOutputStream("파일")
			//os.print/println() => 이런 기능은 존재하지 않는다. 
			//오직 프린트 스트림만 가지고 있다. 
			//값들을 내보낼 때 print메소드를 호출한 부분도 함께 내보낸다. 
			ps.write(byteArr);
			
			//System.out.println();의 out도 PrintStream으로 만들어진다. 
			//PrintStream에 있는 메소드들을 이용해서 콘솔에 값을 출력해줄 수 있는 것
			System.out.println();
			
			ps.flush();
			ps.close();
			
		} catch (FileNotFoundException fnfe) {
			// TODO Auto-generated catch block
			System.out.println(fnfe.getMessage());
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
