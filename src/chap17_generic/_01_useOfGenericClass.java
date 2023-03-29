package chap17_generic;

import chap17_generic.clazz.BoardFile;
import chap17_generic.clazz.FreeBoard;
import chap17_generic.clazz.NoticeBoard;

public class _01_useOfGenericClass {

	public static void main(String[] args) {
		// T가 freeboard인 객체가 탄생
		
		//자유게시판 게시글에 대한 첨부파일 
		//생성자 호출할 때도 타입 명시 
		BoardFile<FreeBoard> fBoardFile = new BoardFile<FreeBoard>();
		
		//아래 방식으로도 선언할 수 있음 
		//fBoardFile.setT(new FreeBoard());		
		
		FreeBoard fBoard = new FreeBoard();
		fBoard.setfBoardNo(1);
		fBoard.setfBoardTitle("test");
		fBoard.setfBoardContent("test입니다.");
		
		//게시글 정보가 있어서 넘버를 넣어주니까 
		//게시글 올리면서 첨부파일 올린다는 상황
		
		//첨부파일은 보드파일이 처리를 해줘야 하는데 보드 넘버가 없으니까 세팅을 해줘야 함
		//보드 넘버 가지고 있는 애가 프리보드, 노티스보드 그래서 게시판 번호를 꺼내와야 하는데 
		//T라는 매개변수를 프리보드로 세팅을 했기 때문에 
		//T는 타입을 넣을 수 있는 공간, 어떤 타입이든 집어넣을 수 있는 공간 
		//								-> 런타임 에러가 나게 하지 않기 위해 
		
		
		//클래스 자체를 넣어도, 어떤 클래스를 상관 없다.
		// t = FreeBoard fBoardFile;
		fBoardFile.setT(fBoard);

		//freeboard에 있는 getter/setter 사용 가능
		//T에 담겨있는 게시판 넘버 꺼내오기 
		fBoardFile.setBoardNo(fBoardFile.getT().getfBoardNo());
		
		fBoardFile.setType(fBoardFile.getT().getClass()
									.getSimpleName()
									.equals("FreeBoard")
									? 1 : 2 );
		
		fBoardFile.setBoardFilNm("첨부파일");
		
		//toString없어도 객체는 바로 String
		System.out.println(fBoardFile);
		
		
		//공지사항 게시글에 대한 첨부파일 
		BoardFile<NoticeBoard> nBoardFile = new BoardFile<NoticeBoard>();
		
		NoticeBoard nBoard = new NoticeBoard();
		nBoard.setnBoardNo(2);
		nBoard.setnBoardTitle("test");
		nBoard.setnBoardContent("test입니다.");
		
		nBoardFile.setT(nBoard);
		
		nBoardFile.setBoardNo(nBoardFile.getT().getnBoardNo());
		
		fBoardFile.setType(nBoardFile.getT().getClass()
				.getSimpleName()
				.equals("FeeBoard")
				? 1 : 2 );
		
		nBoardFile.setBoardFilNm("첨부파일");
		
		System.out.println(nBoardFile);
		
	}

}
