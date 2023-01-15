/*
 * 컴퓨터에 사운드카드가 있다.
 * 사운드카드에서는 문자열을 읽는 기능이 존재한다.
 * (문자열을 넣어주면 콘솔화면에 출력)
 * 
 * 컴퓨터, 사운드카드 이것을 클래스로 구현하는 코딩을 만들어 보세요.
 */

 interface Soundable
 {
	 public void readString(String str);
 }
 
 class Computer
 {
	 // Soundable 인터페이스를 통해 SoundCard의 메소드를 사용할 수 있게끔 한다.
	 public Soundable getSound()
	 {
		 return new SBSoundCardX();
	 }
	 
	 // SoundCard -> SBSoundCardX
	 // 사운드카드를 바꿔서 클래스명을 바꿔도 문제가 발생되지 않는다.
	 
	 // SoundCard 클래스를 감추겠다 => inner 클래스 
	 private class SBSoundCardX implements Soundable
	 {
		 public void readString(String str)
		 {
			 System.out.println(str);
		 }
	 }
 }
 
public class ExamInnerClassTest1 {

	public static void main(String[] args) 
	{
		Computer com = new Computer();
		Soundable sound = com.getSound();
		sound.readString("사운드 테스트");

	}

}
