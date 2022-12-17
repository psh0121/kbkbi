
public class Example01 {

	public static void main(String[] args) {
		int a = 0;		// a값
		int b = 0;		// b값
		
		int aValue = 0;	// +1씩해서 a에 넣을 값
		int bValue = 0;	// +1씩해서 b에 넣을 값
		
		// a값을 넣어보는 반복문
		for(int i = 0; i < 10; i++)
		{
			a = aValue;
			
			bValue = 0;	// b에대한 반복문을 돌기전 bValue 초기화
			
			// b값을 넣어보는 반복문
			for(int j = 0; j < 10; j++)
			{
				b = bValue;
				
				// 99가 아닐 경우
				// ==> 다음값 확인을 위해 bValue++후 다음 반복문을 돌려버리기 위해 continue사용
				if(((a * 10 + b) + (b * 10 + a)) != 99)
				{
					bValue++;
					continue;
				}
				
				// 99가 맞을 경우
				// ==> 콘솔창에 a와 b의 값을 찍어준다.
				else if(((a * 10 + b) + (b * 10 + a)) == 99)
				{
					System.out.println("A: " + a + ", B: " + b);
					
					// 다음 값들을 위한 bValue++
					bValue++;
				}
			}
			
			// 다음 값들을 위한 aValue++
			aValue++;
		}

	}

}
