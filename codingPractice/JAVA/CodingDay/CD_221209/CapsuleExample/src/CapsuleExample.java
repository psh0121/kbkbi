// 감기
//	- 콧물 ==> 콧물을 멈추게하는약
//	- 재채기 ==> 재채기를 완화하는 약
//	- 코막힘 ==> 코막힘을 완화하는 약

class SinivalCap
{
	// 콧물 처치용 알약
	void take()
	{
		System.out.println("콧물이 안나게 됩니다.");
	}
}

class SneezeCap
{
	// 재체기용 알약
	void take()
	{
		System.out.println("재체기를 멈추게 됩니다.");
	}
}

class SnuffleCap
{
	// 코막힘용 알약
	void take()
	{
		System.out.println("코가 뚫리게 됩니다.");
	}
}

class SinusCap 
{
	SinivalCap siCap;
	SneezeCap snCap;
	SnuffleCap suCap;
	
	SinusCap()
	{
		siCap = new SinivalCap();
		snCap = new SneezeCap();
		suCap = new SnuffleCap();
	}
	
	void take(int age)
	{
		if(age < 20)
		{
			siCap.take();
		}
		else
		{
			snCap.take();
		}
		
	}
}


// 환자
class ColdPatient 
{
	public int age;
	
	void takeSinusCap(SinusCap cap)
	{
		cap.take(age);
	}
}

public class CapsuleExample {

	public static void main(String[] args) {
		ColdPatient suf = new ColdPatient();
		suf.age =30;
		suf.takeSinusCap(new SinusCap());
	}

}
