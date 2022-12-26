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
	
	public int getNumber()
	{
		return number;
	}
	
	@Override
	public String toString()
	{
		return String.valueOf(number);
	}
	
	@Override
	public int hashCode()
	{
		// 뒤에 있는 숫자가 커질수록 내부적으로 사용되는 바구니(메모리)가 많아짐.
		// 비교횟수는 줄겠지만 메모리사이와 루프의 개수는 증가한다 => 적정수로 설정하는게 best
		return number % 3;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		// 1. object가 Num Object이고, number값이 같으면 true
		if(obj instanceof Num)
		{
			if(this.number == ((Num)obj).getNumber())
			{
				return true;
			}
			
			// 데이터가 너무 크면 해시함수에 데이터를 집어넣는다. 
		}
		return false;
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
		
		System.out.println(setNum.size()); 	// 2
		
		for(Num n : setNum)
		{
			System.out.println(n);
		}

	}

}
