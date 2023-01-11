// enum : enumeration 열거형 데이터 타입 
// 열거형 데이터타입은 데이터의 범위를 열거시킨 데이터로 한정시키는 데이터 타입이다. 

enum DAYS
{
	SUNDAY,	
	MONDAY,	
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,	
	SATURDAY
}

enum CTYPE
{
	NORMAL,
	VIP
}

public class ExamEnum2 {
	
	public static void printDay(DAYS days)
	{
		switch(days)
		{
		case SUNDAY:
			System.out.println("오늘은 일요일");
			break;
		
		case MONDAY:
			System.out.println("오늘은 월요일");
			break;
			
		case TUESDAY:
			System.out.println("오늘은 화요일");
			break;
			
		case WEDNESDAY:
			System.out.println("오늘은 수요일");
			break;
			
		case THURSDAY:
			System.out.println("오늘은 목요일");
			break;
			
		case FRIDAY:
			System.out.println("오늘은 금요일");
			break;
			
		case SATURDAY:
			System.out.println("오늘은 토요일");
			break;
			
		default:
			System.out.println("잘못된 요일입니다.");
			break;
		}
	}

	public static void main(String[] args) 
	{
		DAYS day = DAYS.SUNDAY;
		printDay(day);
		
		// 데이터 타입의 불일치로 에러 발생 
		// printDay(CTYPE.VIP);

	}

}
