
public class Main {

	public static void main(String[] args) {
		
		Friend[] frns = new Friend[6];
		
		// 객체할당 
		frns[0] = new UniFriend("철수", "수학과", "1111-2222");
		frns[1] = new UniFriend("짱구", "레크레이션학과", "2222-3333");
		frns[2] = new UniFriend("유리", "체육학과", "3333-4444");
		
		frns[3] = new CompFriend("맹구", "총무과", "4444-5555");
		frns[4] = new CompFriend("짱아", "비서과", "5555-6666");
		frns[5] = new CompFriend("오수", "행정과", "6666-7777");
		
		for(int i = 0; i < frns.length; i++)
		{
			frns[i].showInfo();
			System.out.println("");
		}
	
	}

}
