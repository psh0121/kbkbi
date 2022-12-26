import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

// Comparable<Person> : 비교루틴전용 제네릭 인터페이스 
// (제네릭으로 인해 실행시간에 인터페이스가 정의됨)
//Comparable<Person> : 비교루틴전용 제네릭 인터페이스 (제네릭으로 인해 실행시간에 인터페이스가 정의됨)
class Person2 implements Comparable<Person2>
{
	private String name;
	private int age;
	
	// 기본생성자
	public Person2()
	{
		name = null;
		age = 0;
	}
	
	// 오버로딩된 생성자
	public Person2(String name, int age)
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
		if(obj instanceof Person2)
		{
			if((this.age == ((Person2)obj).getAge()) &&
				(this.name == ((Person2)obj).getName()))
			{
				return true;
			}
		}
		
		return false;
	}
	
	// @Override : 인터페이스도 내부적으로 상속메커니즘을 따르기 때문에 @Override를 해줘도 문제 생기지 않음 
	@Override
	public int compareTo(Person2 p)
	{
		return this.age - p.getAge();
	}
	
}

class Person2Comparator implements Comparator<Person2>
{
	public int compare(Person2 p1, Person2 p2)
	{
		return p2.getAge() - p1.getAge();
	}
}

public class ExamTreeSet3 {

	public static void main(String[] args) 
	{
		TreeSet<Person2> pset = new TreeSet<>(new Person2Comparator());
		
		pset.add(new Person2("정ㅇㅇ", 48));
		pset.add(new Person2("박ㅇㅇ", 26));
		pset.add(new Person2("손ㅇㅇ", 31));
		
		for(Person2 p : pset)
		{
			System.out.println(p);
		}
	}

}
