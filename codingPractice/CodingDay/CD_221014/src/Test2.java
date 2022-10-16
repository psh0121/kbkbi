import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 사용자에게 배열의 사이즈를 입력받는다. 
		System.out.print("원하는 배열의 사이즈를 입력해 주세요 : ");
		int size = scan.nextInt();
		
		Queue2 q = new Queue2(size);
		
		boolean bResult;
		int data;
		
		bResult = q.enqueue(11);
		bResult = q.enqueue(22);
		bResult = q.enqueue(33);
		bResult = q.enqueue(44);
		bResult = q.enqueue(55);
		
		bResult = q.enqueue(66);	// error
		
		data = q.dequeue();	
		data = q.dequeue();
		data = q.dequeue();
		data = q.dequeue();
		data = q.dequeue();
		
		data = q.dequeue();	// error
		
		bResult = q.enqueue(77);
		bResult = q.enqueue(88);
		bResult = q.enqueue(99);
		
		data = q.dequeue();
		data = q.dequeue();
		
		q.print();

	}

}
