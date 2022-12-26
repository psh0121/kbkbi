import java.util.LinkedList;
import java.util.Queue;

public class ExamQueue2 {

	public static void main(String[] args) 
	{
		Queue<String> queue = new LinkedList<>();
		
		// offer : 추가
		queue.offer("a1");
		queue.offer("a2");
		queue.offer("a3");
		queue.offer("a4");
		queue.offer("a5");
		
		System.out.println(queue.size()); 	// 5
		
		// peek : 확인
		System.out.println(queue.peek()); 	// a1
		
		System.out.println(queue.size()); 	// 5
		
		// poll : 삭제
		System.out.println(queue.poll()); 	// a1
		System.out.println(queue.size()); 	// 4
		
		System.out.println(queue.poll()); 	// a2
		System.out.println(queue.poll()); 	// a3
		System.out.println(queue.poll()); 	// a4
		System.out.println(queue.poll()); 	// a5
		System.out.println(queue.poll());	// null
		
		System.out.println(queue.size()); 	// 0
	}

}
