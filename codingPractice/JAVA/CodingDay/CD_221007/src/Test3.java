import java.util.Scanner;

/*
 * 1. 사용자에게 숫자를 입력받으시오
 * 그 숫자만큼 int 배열을 할당하시오 (예 10을 입력하면 int[10])
 * 2. 사용자에게 정렬기준 (오름차순/내림차순)을 입력받으시오 
 * 3. int 배열을 1 ~ 100 사이의 임의의 값으로 설정하시오 
 * 4. 이 배열을 사용자에게 받은 정렬기준에 따라 버블소트를 수행하시오 
 */

public class Test3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BubbleSort3 bs = new BubbleSort3();
		
		// 1> 사용자에게 사이즈 크기 및 정렬기준 입력받기 
		
		System.out.print("원하는 배열의 크기를 입력해 주세요 : ");
		int size = scan.nextInt();		// 배열의 사이즈 
		
		System.out.print("원하시는 정렬기준을 참고하여 입력해 주세요 (1: 오름차순, 2: 내림차순) : ");
		int sortBy = scan.nextInt();	// 정렬기준 (1: 오름차순, 2: 내림차순)
		
		// ++ 올바를 정렬기준을 입력했는지 확인하기
		
		while(bs.agreeSortBy(sortBy) == false)
		{
			System.out.println("정렬 기준을 다시 확인해주세요");
			System.out.println("");
			
			System.out.print("원하시는 정렬기준을 참고하여 입력해 주세요 (1: 오름차순, 2: 내림차순) : ");
			sortBy = scan.nextInt();
			
			if(bs.agreeSortBy(sortBy) == true)
				break;
		}

		
		///////////////////////////////////////////////////////////////////////////////////
		// 2> 배열에 1 ~ 100 사이의 임의의값 설정하기
		
		int arr[] = new int[size];
		
		for(int i = 0; i < size; i++)
		{
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		
		///////////////////////////////////////////////////////////////////////////////////
		// 3> 클래스를 new로 힙에 할당한 후 메소드 사용하기
		 
		bs.setSortBy(sortBy);
		bs.setArr(arr);
		bs.startSort();
		
		bs.printArr();
		 
	}

}
