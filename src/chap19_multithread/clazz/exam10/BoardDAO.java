package chap19_multithread.clazz.exam10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardDAO {
	
	//메소드
	public List<Map<String, String>> selectBoardList() {
		List<Map<String, String>> boardList = new ArrayList<Map<String, String>>();
		
		for(int i = 1; i < 100; i++) {
			Map<String, String> map = new HashMap<String, String>();
			
			map.put("boardNo", String.valueOf(i));
			map.put("boardTitle", "test");
			map.put("boardContent", "test입니다.");
			map.put("boardWriter", "김구만");
			
			/* 이런 식으로 나옴 
			 * [
			 *   {
			 *   boardNO : i,
			 *   boardTitle : test,
			 *   boardContent : test입니다.
			 *   boardWriter : 김구만
			 *   }, * 1000
			 * ] 
			 */
			boardList.add(map);
		}
		
		return boardList;
	}

}
