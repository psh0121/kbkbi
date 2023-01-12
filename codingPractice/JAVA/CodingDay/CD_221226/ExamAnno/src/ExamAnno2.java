// 문제발생 소기가 있거나 호환성문제로 인해 개선된 기능으로 대체되어 더이상 필요하지 않음 

interface Viewable2
{
	@Deprecated
	public void show(String str);
	
	public void show2(String str);
}

class Viewer2 implements Viewable2
{
	@Override
	public void show(String str)
	{
		System.out.println("ver1. show~ show~ show~");
	}
	
	@Override
	public void show2(String str)
	{
		System.out.println("ver2. show! show! show!");
	}
}

public class ExamAnno2 {

	public static void main(String[] args) 
	{
		Viewer2 vw = new Viewer2();
		vw.show("aaa");
		vw.show2("aaa");
	}

}
