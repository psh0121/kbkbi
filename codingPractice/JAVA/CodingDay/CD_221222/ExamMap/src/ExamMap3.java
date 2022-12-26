import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

class KeyComparator implements Comparator<Integer>
{
	// 오름차순으로 정렬, 단 90이상 맨앞으로 위치
	public int compare(Integer n1, Integer n2)
	{
		if((n1 >= 90) && (n2 >= 90))
		{
			return n1.intValue() - n2.intValue();
		}
		else if(n1 >= 90)
		{
			return -1;
		}
		else if(n2 >= 90)
		{
			return 1;
		}
		else
		{
			return n1.intValue() - n2.intValue();
		}
	}
}

public class ExamMap3 {

	public static void main(String[] args) 
	{
		// key-value구조이기때문에 다중 제네릭이 사용된다.
		TreeMap<Integer, String> map = new TreeMap<>(new KeyComparator());
						
		// put : map에 데이터를 입력
		// 번호-이름 10개. 그중에 3개는 번호가 90이상
		map.put(11, "철수");
		map.put(33, "맹구");
		map.put(22, "훈이");
		map.put(55, "유리");
		map.put(44, "짱구");
		map.put(66, "이슬이");
		map.put(77, "신형만");
		map.put(100, "나미리");
		map.put(105, "채성화");
		map.put(103, "봉미선");
				
		// key를 set에 넣어서 가지고 있겠다.
		Set<Integer> kset = map.keySet();
				
		// keySet을 이용해서 map을 순회하는 방식 1번
		Iterator<Integer> iter = kset.iterator();
				
		int key = 0;
				
		while(iter.hasNext())
		{
			key = iter.next();
			System.out.println(key + " : " + map.get(key));
		}
	}

}
