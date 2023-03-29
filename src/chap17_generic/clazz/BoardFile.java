package chap17_generic.clazz;

import java.util.List;

public class BoardFile<T> {
	//T에는 어떤 클래스가 와도 됨 
	
	/* 원래는 이렇게 하는데
	int nBoardNo;
	int fBoardNo;*/
	
	//T == FreeBoard는 boardNo == fBoardNo
	//T == NoticeBoard는 boardNo == nBoardNo
	
	private int boardNo;
	private int type; //1. 자유게시판 2.공지
	private String boardFilNm;

	//T타입의 변수로 만들어서 사용 가능
	private T t; // = FreeBoard fBoard 
	
	//객체 여러 개 넣어서 쓸 수도 있음
	private List<T> tList;
	
	//서버에서 이벤트 발생해서 
	//요청에 대한 응답을 돌려준다는 거야 받아온다는 거야 
	//ResponseEntity<T>

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getBoardFilNm() {
		return boardFilNm;
	}

	public void setBoardFilNm(String boardFilNm) {
		this.boardFilNm = boardFilNm;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	
	@Override
	public String toString() {
		return "BoardFile [boardNo=" + boardNo + ", type=" + type + ", "
						+ "boardFilNm=" + boardFilNm + ", t=" + t + "]";
	}	
}
