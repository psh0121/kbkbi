import java.util.ArrayList;
import java.util.List;

public class ExamArrayList {

	public static void main(String[] args) 
	{
		// ArrayList를 List인터페이스로 접근할 것이다.
		List<String> list = new ArrayList<>();
		
		// 데이터를 입력
		list.add("이순신");
		list.add("세종대왕");
		list.add("안중근");
		list.add("김구");
		list.add("을지문덕");
		list.add("연개소문");
		
		// 방법1 ) for
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
		// 방법2 ) 순회
		for(String s : list)
		{
			System.out.println(s);
		}
		
		// 데이터 삭제 
		System.out.println("~~ Remove ~~");
		list.remove(2);
		
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}

	}

}
