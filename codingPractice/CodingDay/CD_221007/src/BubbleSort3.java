
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
		int box;
		boolean swapFlag = false;
		
		for(int i = 0; i < arr.length - 1; i++)
		{
			for(int j = 0; j < arr.length - 1 - i; j++)
			{
				if(getSortBy() == 1)
				{
					if(arr[j] > arr[j+1])
					{
						box = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = box;
						
						swapFlag = true;
					}
				}
				else {
					if(arr[j] < arr[j+1])
					{
						box = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = box;
						
						swapFlag = true;
					}
				}
			}
			if(swapFlag == false)
			{
				return;
			}
			else 
			{
				swapFlag = false;
			}
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
