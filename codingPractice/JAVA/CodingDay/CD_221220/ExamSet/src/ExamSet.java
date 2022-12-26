import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExamSet {

	public static void main(String[] args) 
	{
		// HashSet : 해쉬를 기반으로 하는 Set
		// Hash : 임의의 길이의 비트열을 입력받아서 고정된 크기의 유니크한 비트열을 만들어내는 알고리즘, 유일성을 보장 
		Set<String> set = new HashSet<>();
		
		set.add("ABC1");
		set.add("ABC3");
		set.add("ABC2");
		
		System.out.println(set.size()); 	// 3
		
		// set의 특징중 중복되는 값이 있으면 안된다. 
		set.add("ABC2");
		
		System.out.println(set.size()); 	// 3
		
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		System.out.println("================================");
		
		for(String s : set)
		{
			System.out.println(s);
		}
	}

}
