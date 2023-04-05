package chap98_homework.nc230404.enums;

public enum COFFEE {
	AMERICANO(2000) {
		public int totalPrice(int optionOrder, int normalOrder) {
			return optionOrder * (this.getPrice() + 300) +
					normalOrder * this.getPrice();
		}
	}, LATTE(3000) {
		public int totalPrice(int optionOrder, int normalOrder) {
			return optionOrder * (this.getPrice() + 500) +
					normalOrder * this.getPrice();
		}
	}, MOCHA(4000) {
		public int totalPrice(int optionOrder, int normalOrder) {
			return optionOrder * (this.getPrice() + 1000) +
					normalOrder * this.getPrice();
		}
	}, COLDBREW(4500) {
		public int totalPrice(int optionOrder, int normalOrder) {
			return optionOrder * (this.getPrice() + 200) +
					normalOrder * this.getPrice();
		}
	};
	
	//매개변수
	private int price;
	
	//생성자 
	COFFEE(int price) {
		this.price = price;
	}

	//getter, setter
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	//추상메소드
	public abstract int totalPrice(int optionOrder, int normalOrder);
}
