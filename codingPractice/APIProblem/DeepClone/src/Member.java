
public class Member implements Cloneable {
	private String name;
	private int age;
	private int[] scores;
	public Car car;
	
	public Member()
	{
		name = null;
		age = 0;
		scores = null;
		car = null;
	}
	
	public Member(String name, int age, int[] scores, Car car)
	{
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		// 먼저 얕은 복사를 해서 name, age를 복제한다.
		Member cloned = (Member) super.clone();
		
		// scores를 깊은 복제한다.
		cloned.scores = new int[this.scores.length];
		
		for(int i = 0; i < this.scores.length; i++)
		{
			cloned.scores[i] = this.scores[i];
		}
		
		// car를 깊은 복제한다. 
		cloned.car = new Car(this.car.getModel());
		
		// 깊은 복제된 Member 객체를 리턴
		return cloned;
	}
	
	public Member getMember() 
	{
		Member cloned = null;
		
		try
		{
			cloned = (Member) clone();
		}
		
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return cloned;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int[] getScores() {
		return scores;
	}

	public String getCar() {
		return car.getModel();
	}

	public void setScores(int index, int score) {
		this.scores[index] = score;
	}

	public void setCar(String model) {
		this.car.setModel(model);
	}
	
	
}
