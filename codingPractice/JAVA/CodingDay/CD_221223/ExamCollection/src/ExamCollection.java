import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExamCollection {

	public static void main(String[] args) 
	{
		// 컬렉션에서 제공하는 알고리즘 사용해보기 
		// sort : 정렬기능이 없는 ArrayList를 정렬해보기 
		
		// 1. ArrayList 생성
		List<String> list = new ArrayList<>();
		list.add("abc1");
		list.add("bed2");
		list.add("cba3");
		list.add("civ4");
		list.add("b1s5");
		
		// 2. 화면에 출력 (sort되지 않은 상태) 
		for(String s : list)
		{
			System.out.println(s);
		}
		
		// 3. ArrayList를 정렬한다. 
		// static <T extends Comparable<? super T>> void sort(List<T> list)
		
		Collections.sort(list);
		
		// 4. ArrayList를 출력한다. (sort된 상태) 
		System.out.println("========================");
		
		for(String s : list)
		{
			System.out.println(s);
		}
	}

}
