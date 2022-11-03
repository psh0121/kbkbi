
public class Main {
	
	public static void Attack(Fighter[] f, Footman[] fm, Tank[] t)
	{
		for(int i = 0; i < f.length; i++)
		{
			f[i].pang();
		}
		
		for(int i = 0; i < fm.length; i++)
		{
			fm[i].dudu();
		}
		
		for(int i = 0; i < t.length; i++)
		{
			t[i].pung();
		}
	}

	public static void main(String[] args) {
		
		Fighter[] f = new Fighter[5];
		Footman[] fm = new Footman[3];
		Tank[] t =  new Tank[2];
		
		for(int i = 0; i < f.length; i++)
		{
			f[i] = new Fighter();
		}
		
		for(int i = 0; i < fm.length; i++)
		{
			fm[i] = new Footman();
		}
		
		for(int i = 0; i < t.length; i++)
		{
			t[i] = new Tank();
		}
		
		Attack(f, fm, t);

	}

}
