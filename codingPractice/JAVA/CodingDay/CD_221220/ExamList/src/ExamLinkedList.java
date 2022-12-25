import java.util.LinkedList;
import java.util.List;

public class ExamLinkedList {

	public static void main(String[] args) 
	{
		// ArrayList를 List인터페이스로 접근 
		List<String> list = new LinkedList<>();
		
		// 데이터를 입력
		list.add("이순신");
		list.add("세종대왕");
		list.add("안중근");
		
		// 데이터를 읽기
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
		// 데이터를 삭제
		System.out.println("~~ Remove ~~");
		list.remove(0);
		
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}

	}

}
