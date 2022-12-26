import java.util.LinkedList;
import java.util.List;

/*
* 동물병원에서 동물친구들이 입원을 합니다.
* 입원된 동물 친구들의 리스트를 만들려고 합니다.
* 동물은 "번호", "이름", "병명"이 있습니다.
* 
* 동물 5마리를 입력하고 출력하는 코드를 작성하세요.
*/

class Animal
{
	private int number;		// 번호 
	private String name;	// 이름 	
	private String dName;	// 병명
	
	// 기본생성자
	public Animal()
	{
		number = 0;
		name = null;
		dName = null;
	}
		
	// 오버로딩된 생성자
	public Animal(int number, String name, String dName)
	{
		this.number = number;
		this.name = name;
		this.dName = dName;
	}
		
	@Override
	public String toString()
	{
		return "번호 : " + number + ", 이름 : " + name + ", 병명 : " + dName;
	}
}

public class Example01 {

	public static void main(String[] args) 
	{
		List<Animal> animalList = new LinkedList<>();
		
		// 동물객체 생성
		Animal a1 = new Animal(1, "땡칠이", "감기");
		Animal a2 = new Animal(2, "나비", "중성화");
		Animal a3 = new Animal(3, "깜냥이", "중이염");
		Animal a4 = new Animal(4, "복실이", "비만");
		Animal a5 = new Animal(5, "누렁이", "관절염");
				
		// 리스트에 동물객체 넣기
		animalList.add(a1);
		animalList.add(a2);
		animalList.add(a3);
		animalList.add(a4);
		animalList.add(a5);
		
		// animalList에있는 동물정보 출력
		for(Animal a : animalList)
		{
			System.out.println(a);
		}
				
		// 복실이만 나와줘
		System.out.println("==================================");
		System.out.println(animalList.get(3));
	}
}
