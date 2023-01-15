import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * 컬렉션의 리스트 구조를 만들어보세요.
 * 리스트에 문자열 데이터 5개를 넣어보세요.
 * 
 * 리스트를 내림차순으로 정렬해보세요.
 * (단, 조건은 Comparator인터페이스를 이용하세요)
 * Collections.sort(list, 객체명)
 */

// Comparator 인터페이스가 구현된 StrComparator클래스 
class StrComparator implements Comparator<String>
{
	// compare(String s1, String s2)
	// 두개의 String 객체를 받아 내림차순으로 정렬한다. 
	public int compare(String s1, String s2)
	{
		return s2.toString().compareTo(s1.toString());
	}
}

public class ExamInnerClassTest2 {

	public static void main(String[] args) 
	{
		// 리스트구조 만들기
		List<String> list = new LinkedList<>();
		
		// 문자열데이터 5개 넣기 
		list.add("짱구");
		list.add("철수");
		list.add("훈이");
		list.add("맹구");
		list.add("유리");
		
		// 정렬 (내림차순 정렬)
		Collections.sort(list, new StrComparator());
		
		// Iterator를 사용해 출력하기 
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}

	}

}
