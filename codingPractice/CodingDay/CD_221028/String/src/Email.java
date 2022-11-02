
/*
 * 1. email 문자열이 이메일 형식이 맞는지 맞지 않는지를 판단하는 함수를 만드세요.
 * 기준1) @는 1개 있어야 한다.
 * 기준2) @ 앞쪽에 문자열이 존재해야한다.
 * 기준3) @ 뒷쪽에 문자열이 존재해야한다.
 * 기준4) @ 뒤에 최소한 한개의 .이 존재해야 한다.
 * 
 * 2. 아이디를 추출하는 함수를 만드시오.
 * 
 * 3. 도메인을 추출하는 함수를 만드시오.
 * (단, 도메인은 www.으로 시작해야 한다)
 */

public class Email {

	public static void main(String[] args) {
		String email = "ppp.sss.2022@gmail.com";
		
		EmailFunction ef = new EmailFunction(email);
		
		System.out.println(ef.toString());
		
		ef.init("init.mail@ssssdddd");
		
		System.out.println(ef.toString());

	}

}
