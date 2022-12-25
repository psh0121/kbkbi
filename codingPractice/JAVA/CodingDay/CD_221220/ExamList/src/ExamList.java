import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExamList {

	public static void main(String[] args) 
	{
		// 잘 만들어진 컬렉션 프레임워크를 이용하면,
		//	1. 쉽고, 편하고, 안정적으로 도는 자료구조를 만들어 낼 수 있음.
		//	2. 높은품질과 리더빌리티가 상승함 
		
		List<String> list = Arrays.asList("홍길동", "이순신", "김구", "안중근");
		
		list = new ArrayList<>(list);
		
		for(Iterator<String> iter = list.iterator(); iter.hasNext();)
		{
			System.out.println(iter.next() + '\t');
		}
		
		System.out.println("");
		System.out.println("Sorting...");
		System.out.println("");
		
		Collections.sort(list);
		
		for(Iterator<String> iter = list.iterator(); iter.hasNext();)
		{
			System.out.println(iter.next() + '\t');
		}

	}

}
