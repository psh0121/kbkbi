import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ExamQueue3 {
	
	public static <T> void printList (List<T> pollList)
	{
		// pollList에 아무것도 들어가지 않았을때에 대한 가드코드
		if(pollList == null)
		{
			System.out.println("null");
			return;
		}
		
		Iterator<T> iter = null;
		
		iter = pollList.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}

	public static void main(String[] args)
	{
		// ArrayList 3개 구현
		List<String> alist = new ArrayList<>();
		List<String> blist = new ArrayList<>();
		List<String> clist = new ArrayList<>();
		
		// ArrayList 데이터 넣기
		for(int i = 0; i < 5; i++)
		{
			alist.add("a" + (i + 1));
			blist.add("b" + (i + 1));
			clist.add("c" + (i + 1));
		}
		
		// Queu기반 LinkedList 생성
		Queue<List<String>> queue = new LinkedList<>();
		
		// Queue에 ArrayList 넣기
		queue.offer(alist);
		queue.offer(blist);
		queue.offer(clist);
		
		// Queue에 있는 ArrayList를 빼고 list안 내용 반복자로 확인
		int size = queue.size();
		
		for(int i = 0; i < size; i++)
		{
			printList(queue.poll());
			System.out.println("======================");
		}
		
		printList(queue.poll());	// null
	}

}
