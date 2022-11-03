
public class Stack {
	
	public static boolean push(int[] stack, int[] si, int value)
	{
		// 1. 스택오버플로우 상태라면 return false;
		if(si[1] == 10) 
		{
			System.out.println("Stack-overflow");
			return false;
		}
		// 2. 스택포인터 위치에 데이터 집어넣는다.
		stack[si[0]] = value;
		
		//3. 스택포인터, 스택카운트 증가 
		si[0]++;
		si[1]++;
		
		return true;
	}
	
	public static boolean pop(int[] stack, int[] si)
	{
		// 1. 스택언더플로우 상태라면 return false;
		if(si[1] == 0) {
			System.out.println("Stack-underflow");
			return false;
		}
		
		// 2. si[2] 데이터 저장후 (스택포인터 - 1) 위치에 데이터를 뺸다.
		si[2] = stack[si[0] - 1];
		stack[si[0] - 1] = 0;
		
		//3. 스택포인터, 스택카운트 감
		si[0]--;
		si[1]--;
		
		return true;
		
	}
	
	public static void printStack(int[] stack, int[] si) 
	{
		if(si[1] == 0) {
			System.out.println("출력할 수 있는 데이터가 없습니다.");
		}
		
		int index = si[0] - 1;
		
		for(int i = 0; i < si[1]; i++) 
		{
			System.out.println(stack[index]);
			System.out.println("-----");
			
			index--;
		}
	}

	public static void main(String[] args) {
		// Q) 스택을 표현하시오. 
		// 10개짜리 배열 선언
		int[] stack = new int[10];
		
		// [0] : stack potiner
		// [1] : stack counter
		// [2] : poped data
		int[] stackInfo = new int[3];
		
		push(stack, stackInfo, 1);
		push(stack, stackInfo, 3);
		printStack(stack, stackInfo);
	}

}
