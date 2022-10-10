
public class BubbleSort3 {

	// 변수 선언
	private int[] arr;
	private int sortBy;
	
	///////////////////////////////////////////////////////////////////////////////////
	// Setter
	
	public void setArr(int[] arr)
	{
		this.arr = arr;
	}
	
	public void setSortBy(int sortBy)
	{
		this.sortBy = sortBy;
	}
	
	///////////////////////////////////////////////////////////////////////////////////
	// Getter
	
	public int[] getArr()
	{
		return arr;
	}
	
	public int getSortBy()
	{
		return sortBy;
	}
	
	///////////////////////////////////////////////////////////////////////////////////
	// Check sortBy
	
	public boolean agreeSortBy(int num)
	{
		if((num == 1) || (num == 2))
			return true;
		
		else return false;
	}
	
	///////////////////////////////////////////////////////////////////////////////////
	// Sort
	
	public void startSort()
	{
		if(getSortBy() == 1) ascSort();
		else descSort();
	}
	
	public void ascSort()
	{
		int compareCnt = arr.length - 1;
		int box;
		
		for(int i = 0; i < arr.length - 1; i++)
		{
			for(int j = 0; j < compareCnt; j++)
			{
				if(arr[j] > arr[j+1])
				{
					box = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = box;
				}
			}
			
			compareCnt--;
		}
	}
	
	public void descSort()
	{
		int compareCnt = arr.length - 1;
		int box;
		
		for(int i = 0; i < arr.length - 1; i++)
		{
			for(int j = 0; j < compareCnt; j++)
			{
				if(arr[j] < arr[j+1])
				{
					box = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = box;
				}
			}
			
			compareCnt--;
		}
	}
	
	
	///////////////////////////////////////////////////////////////////////////////////
	// Print arr
	
	public void printArr()
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
}
