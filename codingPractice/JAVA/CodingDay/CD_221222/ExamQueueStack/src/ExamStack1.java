import java.util.Deque;
import java.util.LinkedList;

public class ExamStack1 {

	public static void main(String[] args) 
	{
		// ArrayDeque : Deque을 사용하기 위한 Array 구조 (덱 전용 리스트)
		// 내부적으로 ArrayList하고는 다름
		// Deque<String> deq = new ArrayDeque<>();
		Deque<String> deq = new LinkedList<>();
		
		// 메소드명이 리더빌리티가 떨어지는 경향이 있음.
		deq.offerFirst("A");
		deq.offerFirst("B");
		deq.offerFirst("C");
		
		System.out.println(deq.pollFirst()); 	// C
		System.out.println(deq.pollFirst()); 	// B
		System.out.println(deq.pollFirst()); 	// A
		
		System.out.println(deq.pollFirst()); 	// null
	}

}
