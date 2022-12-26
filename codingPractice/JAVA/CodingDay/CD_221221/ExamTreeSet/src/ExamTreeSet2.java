import java.util.Objects;
import java.util.TreeSet;

// Comparable<Person> : 비교루틴전용 제네릭 인터페이스 
// (제네릭으로 인해 실행시간에 인터페이스가 정의됨)
class Person implements Comparable<Person>
{
	private String name;
	private int age;
	
	// 기본생성자
	public Person()
	{
		name = null;
		age = 0;
	}
	
	// 오버로딩된 생성자
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	/////////////////////////////////////////////////
	// get
	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}
	
	/////////////////////////////////////////////////
	
	@Override
	public String toString()
	{
		return "이름 : " + name + ", 나이 : " + age;
	}
	
	@Override
	public int hashCode()
	{
		// (name.hashCode() + age) % 3;
		return Objects.hash(name, age) % 3;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Person)
		{
			if((this.age == ((Person)obj).getAge()) &&
				(this.name == ((Person)obj).getName()))
			{
				return true;
			}
		}
		
		return false;
	}
	
	// @Override : 인터페이스도 내부적으로 상속메커니즘을 따르기 때문에 @Override를 해줘도 문제 생기지 않음 
	@Override
	public int compareTo(Person p)
	{
		return this.age - p.getAge();
	}
}

public class ExamTreeSet2 {

	public static void main(String[] args) 
	{
		TreeSet<Person> pset = new TreeSet<>();
		
		pset.add(new Person("정ㅇㅇ", 48));
		pset.add(new Person("박ㅇㅇ", 26));
		pset.add(new Person("손ㅇㅇ", 31));
		
		for(Person p : pset)
		{
			System.out.println(p);
		}
	}

}
