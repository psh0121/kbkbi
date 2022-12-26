import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ExamAsList2 {

	// 정수 1, 2, 3, 4, 5를 asList를 사용해서 ArrayList를 만들고
	// 반복자 이용해 출력 
	public static void main(String[] args) 
	{
		// asList
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		// ArrayList 만들기 
		list = new ArrayList<>(list);
		
		// 추가 - auto boxing을 통해 객체에 감싸서 추가
		list.add(6);
		
		// 반복자를 이용해 출력 
		Iterator<Integer> iter = list.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}

	}

}
