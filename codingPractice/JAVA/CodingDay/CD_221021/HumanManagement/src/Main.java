
public class Main {

	public static void main(String[] args) {
		
		UniFriend[] ufrns = new UniFriend[3];
		CompFriend[] cfrns = new CompFriend[3];
		
		// 객체할당 
		ufrns[0] = new UniFriend("철수", "수학과", "1111-2222");
		ufrns[1] = new UniFriend("짱구", "레크레이션학과", "2222-3333");
		ufrns[2] = new UniFriend("유리", "체육학과", "3333-4444");
		
		cfrns[0] = new CompFriend("맹구", "총무과", "4444-5555");
		cfrns[1] = new CompFriend("짱아", "비서과", "5555-6666");
		cfrns[2] = new CompFriend("오수", "행정과", "6666-7777");
		
		for(int i = 0; i < ufrns.length; i++)
		{
			ufrns[i].showInfo();
			System.out.println("");
		}
		
		for(int i = 0; i < cfrns.length; i++)
		{
			cfrns[i].showInfo();
			System.out.println("");
		}
	
	}

}
