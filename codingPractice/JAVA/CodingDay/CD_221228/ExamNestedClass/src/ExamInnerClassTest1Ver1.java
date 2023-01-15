/* 컴퓨터에 사운드카드가 있다.
 * 사운드카드에는 문자열을 읽는 기능
 * (문자열을 넣어주면 콘솔화면에 출력)
 * 
 * 컴퓨터, 사운드카드 이것을 클래스로 구현하는 코딩을 만들어 보세요.
 */

interface Soundable1
{
	public void readString(String str);
}

class Computer1
{	
	// ver1 : local inner class로 만들기
	public Soundable1 getSound()
	{
		class SBSoundCardX implements Soundable1
		{
			public void readString(String str)
			{
				System.out.println(str);
			}
		}
		
		return new SBSoundCardX();
	}
}

public class ExamInnerClassTest1Ver1 {

	public static void main(String[] args) 
	{
		Computer1 com = new Computer1();
		Soundable1 sound = com.getSound();
		sound.readString("사운드 테스트 버전1");
	}

}
