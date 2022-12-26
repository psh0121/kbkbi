import java.util.HashSet;
import java.util.Set;

class Num
{
	private int number;
	
	public Num() 
	{
		number = 0;
	}
	
	public Num(int number)
	{
		this.number = number;
	}
	
	@Override
	public String toString()
	{
		return String.valueOf(number);
	}
}

public class ExamHashTest {

	public static void main(String[] args) 
	{
		boolean bResult = false;
		
		Set<Num> setNum = new HashSet<>();
		bResult = setNum.add(new Num(1234));
		bResult = setNum.add(new Num(1235));
		
		System.out.println(setNum.size()); 	// 2

		bResult = setNum.add(new Num(1235));
		
		System.out.println(setNum.size()); 	// 3
		
		// 중복값으로 처리하지 않고 set안에 값을 넣어서 사이즈가 3이 되어버린 이유는 
		// 우리는 처음들어온 1235와 나중에 들어온 1235가 같다고 생각하는건 우리기준일 뿐 (다른인스턴스로 파악) 
		// HashSet이 같다고 할 수 있는 근거가 없어 equals와 hashcode를 가지고 판단한다.
		
		for(Num n : setNum)
		{
			System.out.println(n);
		}
	}

}
