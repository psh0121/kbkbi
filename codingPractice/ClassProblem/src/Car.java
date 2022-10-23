
public class Car {
	
	// 필드 
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	
	// 생성자 
	public Car()
	{
		this.company = null;
		this.model = null;
		this.color = null;
		this.maxSpeed = 0;
	}
	
	public Car(String company, String model, String color, int maxSpeed)
	{
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = 250;
	}

	// Getter, Setter 
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
	

}
