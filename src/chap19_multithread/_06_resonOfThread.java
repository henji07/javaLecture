package chap19_multithread;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class _06_resonOfThread {

	public static void main(String[] args) {
		
		//사용자들이 접속해서 게시판 정보 목록 조회
		//2만명 넘는 사용자가 동시에 1억건 데이터 조회하면
		//DB가 데드락에 걸려서 시스템 DB 전체 사용 못함
		//사용자가 몰렸을 때 스레드를 생성해서 한 명씩 순차처리해주는 역할 스레드가 함
		//사용자 2만명에 대한 스레드 모두 생성 
		
		Thread t = new Thread() {
			@Override
			public void run() {
				selectBoardList();
			}
		};
		
		t.start();
		
		//스레드의 순서를 제어 

	}
	
	static List<Map<String, String>> selectBoardList() {
		List<Map<String, String>> boardList = new ArrayList<Map<String, String>>();
		
		//boardList에 게시판 데이터를 담는다.
		//DB에서 게시판 정보 목록을 조회(게시판 정보 1억건)
		return boardList;
	}
}
