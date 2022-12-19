import java.util.Arrays;

public class Main {

	public static void main(String[] args) 
	{
		// 깊은복사
		int[] iArr = {11, 22, 33, 44, 55};
				
		// [11, 22, 33, 44, 55]
		int[] iCoppyArr = Arrays.copyOf(iArr, iArr.length);
			
		// [22, 33, 44]
		int[] iCopyRangeArr = Arrays.copyOfRange(iArr, 1, 4);
				
		//////////////////////////////////////////////////////
		// 얕은복사
		double[] dArr = {1.1, 1.2, 1.3, 1.4, 1.5};
				
		double[] dCopyArr = new double[dArr.length];
				
		// [1.2, 1.3, 1.4, 0.0, 0.0] 얕은복사 대상에 부어줘
		System.arraycopy(dArr, 1, dCopyArr, 0, 3);
				
		//////////////////////////////////////////////////////
		// 배열비교
		if(Arrays.equals(iArr, iCoppyArr) == true)
		{
			System.out.println("두 배열은 같습니다.");
		}
		else
		{
			System.out.println("두 배열은 다릅니다.");
		}
				
		//////////////////////////////////////////////////////
		// 배열의 정렬
		int[] ar1 = {5, 6, 0, 4, 1};
		Arrays.sort(ar1);
				
		for(int n : ar1)
		{
			System.out.println(n);
		}

	}

}
