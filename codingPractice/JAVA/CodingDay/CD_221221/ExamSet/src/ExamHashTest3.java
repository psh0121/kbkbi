import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

class Person
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
}

public class ExamHashTest3 {

	public static void main(String[] args) 
	{
		// Person 객체를 HashSet에 저장하고자 한다.
		// 이름과 나이가 같다면 동일 인스턴스로 간주하고자 한다.
		// 이런 조건을 만족하도록 Person 클래스를 완성하세요.
				
		// 1. HashSet 생성
		HashSet<Person> hSet = new HashSet<>();
				
		// 2. 데이터 생성
		hSet.add(new Person("신짱구", 8));
		hSet.add(new Person("봉미선", 29));
		hSet.add(new Person("맹구", 6));
		hSet.add(new Person("유리", 13));
		hSet.add(new Person("철수", 7));
				
		// 중복 - 이것은 입력되어서는 안된다.
		hSet.add(new Person("신짱구", 8));
				
		// size 구하기
		System.out.println(hSet.size());
				
		// 반복자를 이용해 hSet 출력
//		Iterator<Person> iter = hSet.iterator();
//				
//		while(iter.hasNext())
//		{
//			System.out.println(iter.next().toString());
//		}
				
		for(Person p : hSet)
		{
			System.out.println(p);
		}
	}

}
