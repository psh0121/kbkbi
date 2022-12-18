class URLParameter	// 기능을 들고있는게 아니라 값만 넣을 클래스 (= value object) 	
{
	// 보안성을 요구하지 않기 때문에 private나 getter,setter 할 필요가 없음.
	public String key;
	public String value;
	
}

public class Main {

	public static void main(String[] args) {
		
		URLAnalyzer urla = new URLAnalyzer("https://www.naver.com/index.html?id=admin&pw=1234&type=manager");
		urla.init();
		
		// 1. 도메인을 가지고 온다.
		String domain = urla.getDomain();
		System.out.println(domain);
		
		// 2. 파라미터 개수를 가지고 온다.
		int paramCount = urla.getParamCount();
		System.out.println(paramCount);
		
		// 3. 파라미터 정보를 가지고 온다.
		
		// 	3-1> 모든 파라미터의 정보를 가지고 온다.
		for(int i = 0; i < paramCount; i++)
		{
			URLParameter param = urla.getParam(i);
			System.out.println(param.key + " : " + param.value);
		}

		//	3-2> 특정 인덱스의 파라미터 정보를 가지고 온다.
		URLParameter param = urla.getParam(5);
		if(param == null)
		{
			System.out.println(param);
		}
		else 
		{
			System.out.println(param.key + " : " +  param.value);
		}
	}

}
