package chap18_enum.enums;

public enum Season {
	SPRING("봄") {
		//봄은 3, 4, 5월입니다.
		public void printSeasonMonth() {
			System.out.println(
					this.getKoreaSeason() 
					+ "은 3, 4, 5월 입니다.");
		}
	}, 
	SUMMER("여름") {
		//여름은 6, 7, 8월입니다.
		public void printSeasonMonth() {
			System.out.println(
					this.getKoreaSeason() 
					+ "은 6, 7, 8월 입니다.");
		}
	}, 
	FALL("가을") {
		//가을은 9, 10, 11월입니다.
		public void printSeasonMonth() {
			System.out.println(
					this.getKoreaSeason() 
					+ "은 9, 10, 11월 입니다.");
		}
	}, 
	WINTER("겨울") {
		//겨울은 12, 1, 2월입니다.
		public void printSeasonMonth() {
			System.out.println(
					this.getKoreaSeason() 
					+ "은 12, 1, 2월 입니다.");
		}
	};
	
	//String값을 매개변수로 갖는 생성자
	//안 만들어주면 에러 
	private String koreaSeason;
	
	Season(String koreaSeason) {
		this.koreaSeason = koreaSeason;
	}

	public String getKoreaSeason() {
		return koreaSeason;
	}
	
	public abstract void printSeasonMonth();
}
