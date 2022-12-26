import java.util.ArrayDeque;
import java.util.Deque;

interface IStack<E>
{
	public boolean push(E item);
	public E pop();
}

class MyStack<E> implements IStack<E>
{
	private Deque<E> deq;
	
	public MyStack()
	{
		
	}
	
	public MyStack(Deque<E> deq)
	{
		this.deq = deq;
	}
	
	public boolean push(E item)
	{
		return deq.offerFirst(item);
	}
	
	public E pop()
	{
		return deq.pollFirst();
	}
}

public class ExamStack2 {

	public static void main(String[] args) 
	{
		// 0. Deque을 만든다.
		Deque<String> deque = new ArrayDeque<>();
		
		// 1. MyStack객체를 만든다.
		IStack<String> stack = new MyStack<>(deque);
		
		// 2. push()를 이용해서 5개정도 데이터를 넣는다.
		boolean pushResult = false;
		
		pushResult = stack.push("A");
		pushResult = stack.push("B");
		pushResult = stack.push("C");
		pushResult = stack.push("D");
		pushResult = stack.push("E");
		
		// 3. pop()을 이용해서 데이터를 출력한다.
		System.out.println(stack.pop());	// E
		System.out.println(stack.pop());	// D
		System.out.println(stack.pop());	// C
		System.out.println(stack.pop());	// B
		System.out.println(stack.pop());	// A
		System.out.println(stack.pop());	// null
	}

}
