import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// 학생(Student1) 클래스를 만드세요
		// 이름, 학번 
		// 국어성적, 영어성적, 수학성적 
		// 총점을 구하는 메소드 
		// 평균을 구하는 메소드 
		// 이름 및 학번을 리턴하는 메소드 
		// 기타 추가적으로 필요한 메소드가 있다면 추가 구현 
		
		Scanner scan = new Scanner(System.in);
		
		Student1 st = new Student1();
		
		System.out.print("이름 : ");
		String name = scan.next();
		
		System.out.print("학번 : ");
		int id = scan.nextInt();
		
		System.out.print("국어성적 : ");
		int kor = scan.nextInt();
		
		System.out.print("영어성적 : ");
		int eng = scan.nextInt();
		
		System.out.print("수학성적 : ");
		int math = scan.nextInt();
		
		
		st.setName(name);
		st.setId(id);
		st.setKor(kor);
		st.setEng(eng);
		st.setMath(math);
		
		st.calSum();
		st.setSum();
		
		st.calAvg();
		st.setAvg();
		
		
		System.out.println("=============================");
		
		System.out.println(st.getId() + "번 " +st.getName() + "님의 총점과 평균입니다. ");
		System.out.println("총점 : " + st.getSum());
		System.out.printf("평균 : %.1f", st.getAvg());
		System.out.println("");
		
		System.out.println("=============================");
		
	}

}
