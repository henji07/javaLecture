package chap98_homework.nc230406.clazz;

public class HistoricPerson {
	private String name;
	private String achivement;
	private String country;
	
	public HistoricPerson(String name, 
			String achivement, String country) {
		this.name = name;
		this.achivement = achivement;
		this.country = country;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAchivement() {
		return achivement;
	}
	
	public void setAchivement(String achivement) {
		this.achivement = achivement;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "HIstoricPerson [name=" + name + ", achivement=" + achivement + ", country=" + country + "]";
	}
	
	//매개변수로 받은 achievement(사용자 입력)가 this.achievement와 같으면 this 리턴 
	public HistoricPerson getPerInfo(String achievement) {
		if(this.achivement.equals(achievement)) {
			return this;
		}
		return null;
	}
	
	//true면 반환하고 false면 반환 안 하는 메소드 
	public boolean getSameCountryPerson(String country) {
		if(this.getCountry().equals(country)) {
			return true;
		}
		
		return false;
	}
}
