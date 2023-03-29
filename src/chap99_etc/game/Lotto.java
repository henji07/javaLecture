// 로또 (1`45)
// 0.0 <= Math.random() < 1.0
// 0 <= Math.random() < 45
// 1 <= Math.random() < 46
// 중복 불가
// 컴퓨터 7개 난수 (7번은 보너스 번호) 
// 사용자 6개 숫자 선택

// 1등 : 6개 숫자 모두 동일 + 보너스 번호 제외
// 2등 : 5개 숫자 모두 동일 + 보너스 번호 "포함"
// 3등 : 5개 숫자 모두 동일 + 보너스 번호 제외
// 4등 : 4개 숫자 모두 동일 + 보너스 번호 제외
// 5등 : 3개 숫자 모두 동일 + 보너스 번호 제외
// 그외 : 꽝

// 출력 : 등수

package chap99_etc.game;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	
	int comp[] = new int[7]; // 랜덤 값
	int user[] = new int[6]; // 입력 값
	int sameNum = 0; // 동일한 값
	
	public void start() {
		System.out.println("-------- 로또 시작 --------");
				
		// 랜덤 값 출력
		compNum();
		
		// 사용자 입력
		userNum();
		
		compare();
	}
	
	
	// 중복 체크 메서드
	public boolean checkDuplicate(int arr[], int num) {
		for(int i = 0; i < num; i++) {
			if(arr[num] == arr[i]) {
				return true;
			}
		}
		return false;
	}
	
	// 사용자 6개 입력 및 출력 메서드
	public void userNum() {
		System.out.println("1`45 사이 정수를 입력하세요.");
		for(int i = 0; i < user.length; i++) {
			System.out.printf("%d번째 값 입력 > ", i+1);
			user[i] = sc.nextInt();
			if(i > 0) {
				if(checkDuplicate(user, i)) {
					System.out.println("중복이 불가합니다.");
					i--;
				}
			}
		}
		System.out.print("선택 번호 : ");
		for(int i = 0; i < user.length; i++) {
			System.out.printf("%d ", user[i]);
		}
		sc.close();
	}
	
	// 컴퓨터 7개 생성 및 출력 메서드
	public void compNum() {
		for(int i = 0; i < comp.length; i++) {
			comp[i] = r.nextInt(45) + 1;
			if(i > 0) {
				if(checkDuplicate(comp, i)) {
					i--;
				}
			}
		}
		
		System.out.print("로또 번호 : ");
		for(int i = 0; i < comp.length; i++) {
			if(i == 6) {
				System.out.printf("\n보너스 번호 : %d\n", comp[6]);
			} else {
				System.out.printf("%d ", comp[i]);
			}
		}
	}
		
	// 컴퓨터 - 사용자 값 비교 메서드
	public void compare() {
		// 보너스 번호 제외 비교
		for(int i = 0; i < user.length; i++) {
			for(int j = 0; j < user.length; j++) {
				if(user[i] == comp[j]) {
					sameNum++;
				}
			}
		}
		
		System.out.print("\n결과 : "); 
		if(sameNum == 6) {
			System.out.print("1등");
		} else if(sameNum == 5) { // 보너스 번호 비교
			for(int i = 0; i < user.length; i++) {
				if(user[i] == comp[6]) sameNum++;
			}
			if(sameNum == 6) {
				System.out.print("2등");
			} else {
				System.out.print("3등");
			}
		} else if(sameNum == 4) {
			System.out.print("4등");
		} else if(sameNum == 3) {
			System.out.print("5등");
		} else {
			System.out.print("꽝");
		}
	}
}
