// 문제점1 > 인터페이스의 오용 - 인터페이스의 원래용도와 동떨어진 사용. 
// 문제점2 > 변수값의 범위에 대해 제한을 걸 수 없다. (day에 7개의 값 이외에 다른 값이 들어갈 수 있다.)
// 문제점3 > 실제값은 정수이기 때문에 다른 값과 겹치는 경우 이를 오류로 판단할 수 없다. 

interface IDAYS
{
	// interface안에 있는 것은 무조건 public이고
	// interface안에 들어오는 변수는 무조건 static이다. 
	int SUNDAY = 0;	
	int MONDAY = 1;	
	int TUESDAY = 2;
	int WEDNESDAY = 3;
	int THURSDAY = 4;
	int FRIDAY = 5;	
	int SATURDAY = 6;
}

interface SCALE
{
	int DO = 0;
	int RE = 1;
	int MI = 2;
	int FA = 3;
	int SO = 4;
	int LA = 5;
	int SI = 6;
	
}

public class ExamEnum {
	
	public static void printDay(int days)
	{
		switch(days)
		{
		case IDAYS.SUNDAY:
			System.out.println("오늘은 일요일");
			break;
		
		case IDAYS.MONDAY:
			System.out.println("오늘은 월요일");
			break;
			
		case IDAYS.TUESDAY:
			System.out.println("오늘은 화요일");
			break;
			
		case IDAYS.WEDNESDAY:
			System.out.println("오늘은 수요일");
			break;
			
		case IDAYS.THURSDAY:
			System.out.println("오늘은 목요일");
			break;
			
		case IDAYS.FRIDAY:
			System.out.println("오늘은 금요일");
			break;
			
		case IDAYS.SATURDAY:
			System.out.println("오늘은 토요일");
			break;
			
		default:
			System.out.println("잘못된 요일입니다.");
			break;
		}
	}

	public static void main(String[] args) 
	{
		printDay(IDAYS.TUESDAY);	// 화요일(o)
		printDay(SCALE.MI);			// 화요일(x)

	}

}
