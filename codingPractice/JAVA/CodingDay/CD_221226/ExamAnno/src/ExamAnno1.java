// @Override Annotation

interface Viewable
{
	public void show();
}

class Viewer implements Viewable
{
	@Override	// 명확하게 컴파일러가 재정의된 메소드라는 것을 알려줄 수 있다.
	public void show()
	{
		System.out.println("show!");
	}
}

public class ExamAnno1 {

	public static void main(String[] args) 
	{
		Viewer vw = new Viewer();
		vw.show();

	}

}
