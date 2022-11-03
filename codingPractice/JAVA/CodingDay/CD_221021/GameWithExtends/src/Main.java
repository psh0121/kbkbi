
public class Main {
	
	public static void Attack(CombatUnit[] cbu)
	{
		for(int i = 0; i < cbu.length; i++)
		{
			cbu[i].Attack();
			cbu[i].Damage();
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		
		CombatUnit[] cbu = new CombatUnit[10];
		
		int index = 0;
		
		for(int i = 0; i < 5; i++)
		{
			cbu[index] = new Fighter();
			index++;
		}
		
		for(int i = 0; i < 3; i++)
		{
			cbu[index] = new Footman();
			index++;
		}
		
		for(int i = 0; i < 2; i++)
		{
			cbu[index] = new Tank();
			index++;
		}
		
		Attack(cbu);

	}

}
