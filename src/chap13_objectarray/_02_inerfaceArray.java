package chap13_objectarray;

import chap13_objectarray.lecture.English;
import chap13_objectarray.lecture.ILecture;
import chap13_objectarray.lecture.Mathmatics;
import chap13_objectarray.lecture.Programming;

public class _02_inerfaceArray {

	public static void main(String[] args) {
		
		//객체배열의 선언
		ILecture[] lecArr = new ILecture[3];
		
		//객체배열의 초기화 
		//인스턴스는 객체화 못하니까 
		//ILecture로 객체 생성 못함!!
		lecArr[0] = new English();
		lecArr[1] = new Mathmatics();
		lecArr[2] = new Programming();
		
		//객체배열의 사용
		for(int i = 0; i < lecArr.length; i++) {
			lecArr[i].proceedLecture();
		}

	}

}
