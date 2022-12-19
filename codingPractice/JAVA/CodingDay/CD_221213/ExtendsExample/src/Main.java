// 대학동창 클래스 : UnivFriend
// 직장동료 클래스 : CompFriend

public class Main {

	public static void main(String[] args) {
		
		// 인맥관리 SW를 구현하고자 한다.
		// 	- 대학동창 : 이름, 전공, 전화번호
		// 	- 직장동료 : 이름 , 부서, 전화번호
		// 인맥 즉, 대학동창과 직장동료를 추가하고 출력하는 프로그램을 작성하시오
		// 요구사항을 만족하는 코드를 작성. (단, 확장성 있게 작성)

		// 1. UnivFriend 또는 CompFriend 객체를 생성한다.
		// 	- UnivFriend 또는 CompFriend 객체는 여러개 생성될 수 있다.
		//	- 대학동창 : 이름, 전공, 전화번호 ==> Systme.out.println 등으로 출력
		//	- 직장동료 : 이름, 부서, 전화번호 ==> Systme.out.println 등으로 출력
		
		Friend[] friends = new Friend[5]; 
		
		friends[0] = new UnivFriend("짱구", "체육학과", "010-0000-0000");
		friends[1] = new UnivFriend("맹구", "천문학과", "010-0000-1111");
		friends[2] = new UnivFriend("채성화", "유아교육과", "010-0000-2222");
		friends[3] = new CompFriend("철수", "행정과", "010-1111-0000");
		friends[4] = new CompFriend("신형만", "회계과", "010-1111-1111");
		
		for(int i = 0; i < friends.length; i++)
		{
			// Friend의 toString() 이 각 객체의 toString()이 발생됨
			// ==> 재정의(오버라이딩)
			// ==> Friend에 내부적으로 테이블을 만들어 각각의 toString()을 저장해
			// ==> 그리고 우선순위를 설정해, 근데 각객체의 toString()의 우선순위가 높다.
			// ==> 그래서 각 객체의 toString() 이 나오는 것이다.
			// ==> 규약이라고도 표현된다.
			System.out.println(friends[i].toString());
		}

	}

}
