import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ExamListIter {

	public static void main(String[] args) 
	{
		// 양방향 반복자의 예) 
		// => 양방향 반복자는 리스트 구조에서만 가능하며 잘 사용하지 않음 
		List<String> list = Arrays.asList("일두", "이두", "삼두", "사두", "오두");
		list = new ArrayList<>(list);
		
		// 양방향 반복자를 얻어온다. (ListIterator)
		ListIterator<String> iter = list.listIterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		System.out.println("================================");
		
		// 뒤로가기 
		while(iter.hasPrevious())
		{
			System.out.println(iter.previous());
		}
	}

}
