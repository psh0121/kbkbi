/* 컴퓨터에 사운드카드가 있다.
 * 사운드카드에는 문자열을 읽는 기능
 * (문자열을 넣어주면 콘솔화면에 출력)
 * 
 * 컴퓨터, 사운드카드 이것을 클래스로 구현하는 코딩을 만들어 보세요.
 */

interface Soundable2
{
	public void readString(String str);
}

class Computer2
{	
	// ver1 : anonymous inner class로 만들기
	public Soundable2 getSound()
	{
		return new Soundable2()
		{
			public void readString(String str)
			{
				System.out.println(str);
			}
		};
		
	}
}

public class ExamInnerClassTest1Ver2 {

	public static void main(String[] args) 
	{
		Computer2 com = new Computer2();
		
		// 인터페이스 참조형 = 클래스의 객체가 오는것이 정상인데
		// 겉으로 보기에 어떻게 만들어졌냐면
		// 인터페이스 참조형 = 인터페이스의 객체 로 보이게끔 코딩되었다.
		
		Soundable2 sound = com.getSound();
		sound.readString("사운드 테스트 버전2");
	}

}
