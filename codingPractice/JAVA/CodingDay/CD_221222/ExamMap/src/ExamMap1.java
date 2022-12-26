import java.util.HashMap;

public class ExamMap1 {

	public static void main(String[] args) 
	{
		// key-value구조이기 때문에 다중 제네릭이 사용된다. 
		HashMap<Integer, String> map = new HashMap<>();
		
		// put : map에 데이터를 입력 
		map.put(23, "임ㅇㅇ");
		map.put(12, "손ㅇㅇ");
		map.put(8, "전ㅇㅇ");
		
		// get : map에서 데이터를 읽기
		System.out.println(map.get(8));
		System.out.println(map.get(12));
		System.out.println(map.get(23));
		
		// remove : map에서 데이터 삭제 
		map.remove(12);
		System.out.println(map.get(12));
		
		// 맵의 데이터를 이터레이터를 사용해서 순차적으로 조회가 불가능하다.

	}

}
