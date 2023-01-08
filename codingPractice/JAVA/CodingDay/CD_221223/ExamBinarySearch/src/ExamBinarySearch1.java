import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExamBinarySearch1 {

	public static void main(String[] args) 
	{
		// 1. 리스트 생성 
		List<String> list = new ArrayList<>();
		list.add("donkasu");
		list.add("sundeakook");
		list.add("삼겹살");
		list.add("살치살");
		list.add("막걸리");
		
		// 2. Collections를 사용해 정렬 
		Collections.sort(list);
		
		for(String s : list)
		{
			System.out.println(s);
		}
		
		// 3. 정렬된 리스트에서 "막걸리"를 찾는다. 
		int index = Collections.binarySearch(list, "막걸리");
		
		if(0 <= index)
		{
			System.out.println("index : " + index + ", value : " + list.get(index));
		}
	}

}
