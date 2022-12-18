
public class Example01 {
	
	public static int[][] sumArr(int[][] A, int[][] B)
	{
		int[][] result = new int[2][2];
		
		result[0][0] = A[0][0] + B[0][0];
		result[0][1] = A[0][1] + B[0][1];
		result[1][0] = A[1][0] + B[1][0];
		result[1][1] = A[1][1] + B[1][1];
		
		return result;
	}
	
	public static int[][] minusArr(int[][] A, int[][] B)
	{
		int[][] result = new int[2][2];
		
		result[0][0] = A[0][0] - B[0][0];
		result[0][1] = A[0][1] - B[0][1];
		result[1][0] = A[1][0] - B[1][0];
		result[1][1] = A[1][1] - B[1][1];
		
		return result;
	}

	public static void main(String[] args) {
		
		int[][] A = {{10, 9}, 
					 {8, 7}};
		
		int[][] B = {{6, 5}, 
					 {4, 3}};
		
		int[][] sum = sumArr(A, B);
		System.out.println(sum[0][0] + " " + sum[0][1]);
		System.out.println(sum[1][0] + " " + sum[1][1]);
		
		System.out.println("============================");
		
		int[][] minus = minusArr(A, B);
		System.out.println(minus[0][0] + " " + minus[0][1]);
		System.out.println(minus[1][0] + " " + minus[1][1]);
		

	}

}
