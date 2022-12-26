import java.util.HashSet;
import java.util.Iterator;

class Car
{
	private String model;		// 모델명
	private String color;		// 색상
	
	// 기본생성자
	public Car()
	{
		model = null;
		color = null;
	}
	
	// 오버로딩된 생성자
	public Car(String model, String color)
	{
		this.model = model;
		this.color = color;
	}
	
	/////////////////////////////////////////////////
	// get
	public String getModel()
	{
		return model;
	}
	
	public String getColor()
	{
		return color;
	}
	
	/////////////////////////////////////////////////
	
	@Override
	public String toString()
	{
		return "모델명 : " + model + ", 색상 : " + color;
	}
	
	// hashCode() 함수에서 리턴하는 값의 범위에 따라 성능이 차이날 수 있다. 
	// hashCode : 분류를 위해서 사용 
	// 만약 hashCode를 재정의 하지 않는다면 Object의 hashCode를 사용하게 되는데 
	// Object는 Car의 정보를 알지 못해 이상한 값을 내보내게 된다.
	// 그러면 내부적으로 Hash가 없다고 생각해서 분류를 안하게 되는 것이다.
	@Override
	public int hashCode()
	{
		// Object에 hashCode가 있다면 결국 String도 내부적으로 hashCode가 있을 것
		return (model.hashCode() + color.hashCode()) % 3;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		String mo = null;
		String cl = null;
		
		if(obj instanceof Car)
		{
			mo = ((Car)obj).getModel();
			cl = ((Car)obj).getColor();
			
			if(this.model.equals(mo) && this.color.equals(cl))
			{
				return true;
			}
		}
		
		return false;
	}
}

public class ExamHashTest2 {

	public static void main(String[] args) 
	{
		HashSet<Car> cset = new HashSet<>();
		
		cset.add(new Car("SONATA", "RED"));
		cset.add(new Car("SONATA", "BLACK"));
		cset.add(new Car("SONATA", "WHITE"));
		
		cset.add(new Car("AVANTE", "RED"));
		cset.add(new Car("AVANTE", "BLACK"));
		cset.add(new Car("AVANTE", "WHITE"));
		
		// 아래의 두 행은 들어가면 안됨!!
		cset.add(new Car("SONATA", "WHITE"));
		cset.add(new Car("AVANTE", "BLACK"));
		
		// cset.size()를 구하고
		System.out.println(cset.size());
		
		// 반복자를 이용 cset을 출력하는 (println) 코드를 작성하세요
		Iterator<Car> iter = cset.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next().toString());
		}
	}

}
