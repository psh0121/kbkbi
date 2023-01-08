import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Car implements Comparable<Car>
{
	private int disp;	// 배기량 
		
	public Car()
	{
		disp = 0;
	}
	
	public Car(int disp)
	{
		this.disp = disp;
	}
	
	public int getDisp()
	{
		return disp;
	}
	
	@Override
	public String toString()
	{
		return disp + "CC";
	}
	
	@Override
	public int compareTo (Car o)
	{
		return this.disp - o.getDisp();
	}
}

class HybridCar extends Car
{
	private int battery;
	
	public HybridCar()
	{
		battery = 0;
	}
	
	public HybridCar(int disp, int battery)
	{
		super(disp);
		this.battery = battery;
	}
	
	@Override
	public String toString()
	{
		return super.getDisp() + "CC, " + battery + "W";
	}
}

public class ExamCollectionSort {

	public static void main(String[] args) 
	{
		// 1. Car 리스트를 생성
		List<Car> carList = new ArrayList<>();
		
		// 2. Car에 데이터 추가
		carList.add(new Car(1000));
		carList.add(new Car(3000));
		carList.add(new Car(2000));
		carList.add(new Car(7000));
		carList.add(new Car(5000));
		
		// 3. 출력
		for(Car c : carList)
		{
			System.out.println(c);
		}
		
		// 4. collections.sort를 사용해 정렬 
		// static <T extends Comparable<? super T>> void sort(List<T> list)
		// comparable인터페이스를 구현하되, 만약 윗조상 누구든 comparable을 구현했다면 list를 정렬할 수 있다. 
		
		// T형 list를 주면 되는데
		// T는 Comparable인터페이스를 반드시 구현해야하며
		// 특별히 T로부터 파생된 클래스까지 받아들여줄게요.
		
		Collections.sort(carList);
		
		// 5. 정렬된 결과를 출력 (Iterator)
		Iterator<Car> iter = carList.iterator();
	
		System.out.println("=================================");
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
	}

}
