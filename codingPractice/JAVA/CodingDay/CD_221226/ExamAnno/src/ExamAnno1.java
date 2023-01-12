// @Override Annotation

interface Viewable
{
	public void show();
}

class Viewer implements Viewable
{
	@Override
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
