
public class MemberExample {

	public static void main(String[] args) {
		// 원본 객체 생성
		Member original = new Member("blue", "홍길동", "12345", 25, true);
		
		// 복제 객체를 얻은 후에 패스워드 변경 
		Member cloned = original.getMember();
		cloned.setPassword("67890");
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("id: " + cloned.getId());
		System.out.println("name: " + cloned.getName());
		System.out.println("password: " + cloned.getPassword());
		System.out.println("age: " + cloned.getPassword());
		System.out.println("adult: " + cloned.getAdult());
		
		System.out.println();
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("id: " + original.getId());
		System.out.println("name: " + original.getName());
		System.out.println("password: " + original.getPassword());
		System.out.println("age: " + original.getPassword());
		System.out.println("adult: " + original.getAdult());

	}

}
