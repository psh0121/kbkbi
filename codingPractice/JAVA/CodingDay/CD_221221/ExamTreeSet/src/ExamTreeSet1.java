import java.util.TreeSet;

public class ExamTreeSet1 {

	public static void main(String[] args) 
	{
		TreeSet<Integer> tset = new TreeSet<>();
		
		tset.add(3);
		tset.add(1);
		tset.add(2);
		tset.add(4);
		
		System.out.println("size : " + tset.size());
		
		for(Integer n : tset)
		{
			System.out.println(n);
		}

	}

}
