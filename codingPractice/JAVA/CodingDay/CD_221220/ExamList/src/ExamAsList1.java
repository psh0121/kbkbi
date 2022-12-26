import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ExamAsList1 {

	// 배열 대신에 ArrayList를 사용 
	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("일두", "이두", "삼두", "사두");

		// Collection<? extends E> c : c에 대해서 get만 하겠다.
		// 이때, 리스트가 들어올 수도 있고 set또는 queue가 들어올 수 있기 때문에 Collection이 들어오는 것이다. 
		// ArrayList는 들어온 파라미터인 list를 건드리지 않고 get만 한다. 
		list = new ArrayList<>(list);	// <> : 파라미터로 타입추론 
		
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}

}
