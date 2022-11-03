
public class CarExample {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		System.out.println("c1.company : " + c1.getCompany());
		System.out.println("c1.model : " + c1.getModel());
		System.out.println("c1.color : " + c1.getColor());
		System.out.println("c1.maxSpeed : " + c1.getMaxSpeed());
		
		System.out.println("");
		
		Car c2 = new Car("현대자동차", "택시", "검정", 200);
		System.out.println("c2.company : " + c2.getCompany());
		System.out.println("c2.model : " + c2.getModel());
		System.out.println("c2.color : " + c2.getColor());
		System.out.println("c2.maxSpeed : " + c2.getMaxSpeed());
		
		

	}

}
