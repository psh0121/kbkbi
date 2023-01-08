import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CustomerComparator implements Comparator<Customer>
{
	// 고객 번호를 기준으로 오름차순으로 정렬하세요.
	@Override
	public int compare(Customer c1, Customer c2)
	{
		if((c1.getVipFlag() == 1) && (c2.getVipFlag() == 1))
		{
			return c1.getNumber() - c2.getNumber();
		}
		else if((c1.getVipFlag() == 1) && (c2.getVipFlag() != 1))
		{
			return -1;
		}
		else if((c1.getVipFlag() != 1) && (c2.getVipFlag() == 1))
		{
			return 1;
		}
		else
		{
			return c1.getNumber() - c2.getNumber();
		}
	}
}

// 고객클래스
//	- 이름 : name
//	- 고객번호 : number
//	- 아이디 : id
//	- 고객구분 : vipFlag
class Customer
{
	private String name;
	private int number;
	private String id;
	private int vipFlag;
	
	// 기본생성자
	public Customer()
	{
		name = null;
		number = 0; 
		id = null;
		vipFlag = 0;
	}
	
	// 오버로딩된 생성자
	public Customer(String name, int number, String id, int vipFlag)
	{
		this.name = name;
		this.number = number;
		this.id = id;
		this.vipFlag = vipFlag;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public int getVipFlag()
	{
		return vipFlag;
	}
	
	@Override
	public String toString()
	{
		return number + " : " + name + " | 아이디 :" + id + " | VIP :" + vipFlag;
	}
}

public class Exam02 
{
	public static Customer searchCustomer(List<Customer> list, int number)
	{
		Customer customerInfo = null;
		
		for(Customer c : list)
		{
			if(c.getNumber() == number)
			{
				customerInfo = c;
			}
		}
		return customerInfo;
	}
	
	public static void main(String[] args) 
	{
		// 리스트 생성하기
		List<Customer> customerList = new ArrayList<>();
		
		// 데이터 추가
		customerList.add(new Customer("박고객", 1, "parkcustom1", 0));
		customerList.add(new Customer("김고객", 2, "kimcustom2", 0));
		customerList.add(new Customer("최고객", 3, "chcustom3", 0));
		customerList.add(new Customer("이고객", 4, "leecustom4", 0));
		customerList.add(new Customer("박부자", 5, "parkrich5", 1));
		customerList.add(new Customer("류고객", 6, "rucustom6", 0));
		customerList.add(new Customer("곽고객", 9, "garkcustom9", 0));
		customerList.add(new Customer("안부자", 10, "anrich10", 1));
		customerList.add(new Customer("최부자", 7, "chrich7", 1));
		customerList.add(new Customer("김부자", 8, "kimrich8", 1));
		
		// 출력
		for(Customer c : customerList)
		{
			System.out.println(c);
		}
		
		// 정렬하기
		CustomerComparator ccmp = new CustomerComparator();
		
		Collections.sort(customerList, ccmp);
		
		// 정렬된 데이터 출력
		System.out.println("==================================================");
		for(Customer c : customerList)
		{
			System.out.println(c);
		}
		
		// 고객번호로 검색
		System.out.println("================== 고객찾기 ==================");
		System.out.println(searchCustomer(customerList, 5));
		
	}

}
