import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringCompare implements Comparator<String>
{
	@Override
	public int compare(String s1, String s2)
	{
		// 정렬기준 설정 
		return s1.compareToIgnoreCase(s2);
	}
}

public class ExamBinarySearch2 {

	public static void main(String[] args) 
	{
		// list 생성 
		List<String> list = new ArrayList<>();
		list.add("ROBOT");
		list.add("TOY");
		list.add("FOOD");
		
		// 정렬기준 설정및 컬렉션 적용 
		StringCompare scmp = new StringCompare();
		
		Collections.sort(list, scmp);
		
		// Robot 데이터 찾기 
		int index = Collections.binarySearch(list, "Robot", scmp);
		
		System.out.println(index);
		System.out.println(list.get(index));

	}

}
