
class Customer
{
	private int number;
	private String name;
	private TYPE type;		// 0: noraml, 1: VIP
	
	public Customer(int number, String name, TYPE type)
	{
		this.number = number;
		this.name = name;
		this.type = type;
	}
}

public class ExamEnum3 {

	public static void main(String[] args) 
	{
		Customer c1 = new Customer(1, "이순신", TYPE.VIP);
	}

}
