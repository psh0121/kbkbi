import java.util.ArrayDeque;
import java.util.Deque;

// 인터페이스 생성
interface IQueue<E>
{
	public boolean enqueue(E item);
	public E dequeue();
	public int getCount();
}

// IQueue를 구현한 Queue 클래스 (래핑클래스 생성)
class MyQueue<E> implements IQueue<E>
{
	private Deque<E> deq;
	
	// 기본생성자
	public MyQueue()
	{
		deq = null;
	}
	
	// 오버로딩된 생성자
	public MyQueue(Deque<E> deq)
	{
		this.deq = deq;
	}
	
	//////////////////////////////////////
	// 함수 구현
	
	public boolean enqueue(E item)
	{
		return deq.offerFirst(item);
	}
	
	public E dequeue()
	{
		return deq.pollLast();
	}
	public int getCount()
	{
		return deq.size();
	}
}

public class Exam01 {

	public static void main(String[] args) 
	{
		// Deque생성
		Deque<String> deque = new ArrayDeque<>();
		
		// MyQueue 객체 생성
		MyQueue<String> queue = new MyQueue<>(deque);
		
		// 데이터 추가
		boolean result = false;
		
		result = queue.enqueue("A");
		result = queue.enqueue("B");
		result = queue.enqueue("C");
		result = queue.enqueue("D");
		result = queue.enqueue("E");
		
		// 사이즈
		System.out.println(queue.getCount()); 	// 5
		
		// 데이터 삭제 및 출력
		System.out.println(queue.dequeue());	// A
		System.out.println(queue.dequeue());	// B
		System.out.println(queue.dequeue());	// C
		System.out.println(queue.dequeue());	// D
		System.out.println(queue.dequeue());	// E
		System.out.println(queue.dequeue());	// null
		
	}

}
