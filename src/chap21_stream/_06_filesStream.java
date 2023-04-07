package chap21_stream;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class _06_filesStream {

	public static void main(String[] args){
		//hyundaicar.txt의 파일 경로(Path) 객체 얻기
		try {
			Path path = Paths.get(_06_filesStream.class
								  .getResource("hyundaicar.txt").toURI());
			/*Files.lines() => 텍스트 파일을 행으로 분리해서 
			 *                 행들의 스트림을 만들어준다. */
			Stream<String> fileStream = Files.lines(path, Charset.defaultCharset());
			
			fileStream.forEach(l -> System.out.println(l));//한줄씩 찍어보는 거
			
		} catch (URISyntaxException ue) {
			// URI문법 오류 나면 여기로 
			ue.printStackTrace(); 
		} catch(IOException ie) {
			//File ~~ 면 여기로?
			ie.printStackTrace();
		} catch(Exception e) {
			//위에 두 개 안 걸리면 여기로
			e.printStackTrace();
		}
	}
}
