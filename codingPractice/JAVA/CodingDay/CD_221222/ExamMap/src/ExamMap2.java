import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ExamMap2 {

	public static void main(String[] args) 
	{
		// key-value구조이기 때문에 다중 제네릭이 사용된다. 
		HashMap<Integer, String> map = new HashMap<>();
		
		// put : map에 데이터를 입력 
		map.put(23, "임ㅇㅇ");
		map.put(12, "손ㅇㅇ");
		map.put(8, "전ㅇㅇ");
		
		// key를 set에 넣어서 가지고 있기 
		Set<Integer> kset = map.keySet();
		
		// keySet을 이용해서 map을 순회하는 방식 1번 
		Iterator<Integer> iter = kset.iterator();
		
		int key = 0;
		
		while(iter.hasNext())
		{
			key = iter.next();
			System.out.println(key + " : " + map.get(key));
		}
		
		// keySet을 이용해서 map을 순회하는 방식 2번
		for(int n : kset)
		{
			System.out.println(n + " : " + map.get(n));
		}

	}

}
