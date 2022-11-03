
public class Student1 {
	
	// 변수 선언 
	private String name;		// 이름 
	private int id; 			// 학번 
	
	private int kor;			// 국어성적 
	private int eng;			// 영어성적  
	private int math;			// 수학성적 
	
	private double sum;			// 총합 
	private double avg;			// 평균 
	
	///////////////////////////////////////////////////
	// Setter 
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setKor(int kor)
	{
		this.kor = kor;
	}
	
	public void setEng(int eng)
	{
		this.eng = eng;
	}
	
	public void setMath(int math)
	{
		this.math = math;
	}
	
	public void setSum()
	{
		sum = calSum();
	}
	
	public void setAvg()
	{
		avg = calAvg();
	}

	///////////////////////////////////////////////////
	// Getter
	
	public String getName()
	{
		return name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public int getKor()
	{
		return kor;
	}
	
	public int getEng()
	{
		return eng;
	}
	
	public int getMath()
	{
		return math;
	}
	
	public double getSum()
	{
		return sum;
	}
	
	public double getAvg()
	{
		return avg;
	}
	
	///////////////////////////////////////////////////
	// Calculate sum, avg
	
	public int calSum()
	{
		return getKor() + getEng() + getMath();
	}
	
	public double calAvg()
	{
		return getSum() / 3;
	}
}
