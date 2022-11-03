import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// 1차 함수를 만드는 방식은 3가지가 있습니다. 
		// 1> 한점의 좌표와 기울기를 알 경우 
		// 2> 두점의 좌표를 알 경우 
		
		// 입력 : 
		// 1> 한점의 좌표와 기울기를 입력 
		// 2> 두점의 좌표를 입력 
		
		// 출력 :
		// y = ax + b 형태로 출력  
		
		Scanner scan = new Scanner(System.in);
		Function2 fn = new Function2();
		
		System.out.println("한점의 좌표과 기울기를 알경우 1번을,");
		System.out.println("두점의 좌표를 알경우 2번을 눌러주세요.");
		int choice  = scan.nextInt();
		fn.setChoice(choice);
		
		double a; // 기울기
		double x1, y1, x2, y2; // 점의 좌표 	
		
		if(choice == 1)
		{
			System.out.print("x좌표를 입력해 주세요 :");
			x1 = scan.nextDouble();
			System.out.print("y좌표를 입력해 주세요 : ");
			y1 = scan.nextDouble();
			System.out.print("기울기를 입력해 주세요 : ");
			a = scan.nextDouble();
			
			fn.setA(a);
			fn.setX1(x1);
			fn.setY1(y1);
			fn.calB();
		}
		else if(choice == 2)
		{
			System.out.print("x1좌표를 입력해 주세요 :");
			x1 = scan.nextDouble();
			System.out.print("y1좌표를 입력해 주세요 : ");
			y1 = scan.nextDouble();
			System.out.print("x2좌표를 입력해 주세요 :");
			x2 = scan.nextDouble();
			System.out.print("y2좌표를 입력해 주세요 : ");
			y2 = scan.nextDouble();
			
			fn.setX1(x1);
			fn.setY1(y1);
			fn.setX2(x2);
			fn.setY2(y2);
			fn.calA();
			fn.calB();
		}
		
		fn.printFunction();

	}

}
