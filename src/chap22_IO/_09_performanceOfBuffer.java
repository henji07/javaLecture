package chap22_IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class _09_performanceOfBuffer {

	public static void main(String[] args) {
		
		try {
		
			//Reader rd = new FileReader("C:/Dev224/per/name, phone.txt");
			
			//성능 향상 보조스트림 연결
			//BufferedReader brd = new BufferedReader(rd);
			
			//rd는 FileReader의 값이기 때문에 
			//객체 생성 안 하고 바로 사용해도 됨 
			BufferedReader brd = new BufferedReader(new FileReader("C:/Dev224/per/name, phone.txt"));
			
			String[] name = new String[10];
			String[] phoneNum = new String[100];
			
			int index = 0;
			
			while(true) {
				//성능 향상 보조스트림의 readLine() 사용해서
				//문자열 한 줄씩 읽어오기 
				String line = brd.readLine();
				
				//line이 null이면 다음 값이 없다. 
				//while문 종료
				if(line == null) {
					break;
				}
				
				//space로 잘라서 배열로 만드는 거 
				name[index] = line.split(" ") [0]; //이름 담기는 배열
				phoneNum[index++] = line.split(" ") [1]; //전화번호 담기는 배열
				//다음 요소에 담길 수 있게 ++
				
				for(int i = 0; i < index; i++) {
					System.out.println(name[i] + " : " + phoneNum[i]);
				}
			}
			
			brd.close();
			
			
		} catch (FileNotFoundException fnfe) {
			System.out.println(fnfe.getMessage());
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
