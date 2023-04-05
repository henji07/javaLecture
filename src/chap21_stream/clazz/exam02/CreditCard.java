package chap21_stream.clazz.exam02;

public class CreditCard {
	//필드
	private String company;
	private String cardName;
	private int limitMoney;
	
	//생성자 
	public CreditCard(String company, String cardName, int limitMoney) {
		this.company = company;
		this.cardName = cardName;
		this.limitMoney = limitMoney;
	}
	
	//getter setter
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public int getLimitMoney() {
		return limitMoney;
	}
	public void setLimitMoney(int limitMoney) {
		this.limitMoney = limitMoney;
	}

	@Override
	public String toString() {
		return "CreditCard [company=" + company + ", cardName=" + cardName + ", limitMoney=" + limitMoney + "]";
	}
	
	

	
}
