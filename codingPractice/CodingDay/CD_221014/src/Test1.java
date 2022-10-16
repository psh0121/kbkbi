
public class Test1 {

	public static void main(String[] args) {
		ScoreSort1 score = new ScoreSort1();
		
		int[] arr = new int[] {56, 44, 87, 90, 68, 98, 77, 90, 97, 98};
		
		score.setScoreArr(arr);
		score.bubbleSort();
		score.printArr();

	}

}
