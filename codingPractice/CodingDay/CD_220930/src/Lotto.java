
public class Lotto {
	
	public static void genLotto(int[] lotto)
	{
		int index = 0; // 집어넣을 위치정
		int random;
		boolean overlapFlag = false;
		
		while(index < 6) 
		{
			// 랜덤넘버 구하
			random = (int)(Math.random() * 45) + 1;
			overlapFlag = false;
			
			// 겹치는게 있는지 확인한다. 
			for(int i = 0; i < 6; i ++) 
			{
				if(random == lotto[i])
				{
					// 겹치는 값이 존재한다. 
					overlapFlag = true;
					break;
				}
			}
			
			// 겹치는게 없다. 
			if(overlapFlag == false)
			{
				lotto[index] = random;
				index++;
			}
		}
	}

	public static void main(String[] args) 
	{
		// Q) 로또번호를 출력하는 함수를 만들어 보시오. 
		// 로또번호를 저장할 배열을 선언. 
		int[] lotto = new int[6];
		
		genLotto(lotto); // 빈배열 6개 저장상태 
		
		for(int i = 0; i < 6; i++)
		{
			System.out.println(lotto[i]);
		}
	}

}
