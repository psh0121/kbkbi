
public class ScoreSort1 {
	
	// 변수 선언 
	private int[] scoreArr;			// 성적배열 
	
	/////////////////////////////////////////////////////////
	// Setter
	
	public void setScoreArr(int[] scores)
	{
		scoreArr = new int[scores.length];
		
		for(int i = 0; i < scores.length; i++)
		{
			scoreArr[i] = scores[i];
		}
	}
	
	/////////////////////////////////////////////////////////
	// Getter
	
	public int[] getScoreArr()
	{
		return scoreArr;
	}
	
	/////////////////////////////////////////////////////////
	// 오름차순 버블정렬 메소드 
	
	public boolean bubbleSort()
	{
		int temp;
		boolean swapFlag = false;
		
		for(int i = 0; i < scoreArr.length - 1; i++)
		{
			for(int j = 0; j < scoreArr.length - 1 - i; j++)
			{
				if(scoreArr[j] > scoreArr[j + 1])
				{
					temp = scoreArr[j];
					scoreArr[j] = scoreArr[j + 1];
					scoreArr[j + 1] = temp;
					
					swapFlag = true;
				}
			}
			
			// 버블정렬 최적화 
			if(swapFlag == true)	// swap된 적 없다면 --> 정렬완료상태 
			{
				return true;
			}
			
			else 					// swap된 적 있다면 --> 정렬진행상태 
			{
				swapFlag = false;
			}
		}
		
		return true;
	}
	
	/////////////////////////////////////////////////////////
	// 정렬된 배열을 등수로 출력하는 메소드 
	
	public void printArr()
	{
		int rank = 0;						// 등수
		int index = scoreArr.length - 1;	// 뒤에 있는 배열의 값부터 불러오기 위한 index 변수 
		
		int sameScoreCnt = 1;				// 같은 점수를 가진 데이터의 개수
		int beforeScore = -1;				// 이전 데이터의 점수 
		
		for(int i = 0; i < scoreArr.length; i++)
		{
			if(beforeScore != scoreArr[index])
			{
				rank = rank + sameScoreCnt;
				beforeScore = scoreArr[index];
				sameScoreCnt = 1;
			}
			
			else
			{
				sameScoreCnt++;
			}
			
			System.out.println(rank + "등 : " + scoreArr[index]);
			
			index--;
		}
	}
	

}
