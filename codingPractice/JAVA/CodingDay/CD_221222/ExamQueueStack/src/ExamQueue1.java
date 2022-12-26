import java.util.LinkedList;
import java.util.Queue;

public class ExamQueue1 {

	public static void main(String[] args) 
	{
		// Queue인터페이스기반 LinkedList 
		Queue<String> queue = new LinkedList<>();
		
		queue.add("a1");
		queue.add("a2");
		queue.add("a3");
		
		System.out.println(queue.size());
		
		// element : 꺼내는거는 아니고 다음에 무엇이 나올지 확인해봄
		System.out.println(queue.element());
		
		// remove : 확인이 아니라 꺼내보자
		System.out.println(queue.remove());
		System.out.println(queue.size());
		
		// 예외발생시킴
//		System.out.println(queue.remove());
//		System.out.println(queue.remove());
//		System.out.println(queue.remove());

	}

}
