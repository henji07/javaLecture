package chap22_IO.clazz.exam01;

public class Car {
	
	private String company;
	private String model;
	private double maxSpeed;
	private int price;
	
	//생성자 Alt shift s -> Constructor using field
	
	public String getCompany() {
		return company;
	}
	
	public Car(String company, String model, double maxSpeed, int price) {
		//super();
		this.company = company;
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}
	
	//getter setter
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", maxSpeed=" + maxSpeed + ", price=" + price + "]";
	}
}
