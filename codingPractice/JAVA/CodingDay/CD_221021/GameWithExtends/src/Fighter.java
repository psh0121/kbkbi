
public class Fighter extends CombatUnit {
	
	public void Attack()
	{
		pang();
	}
	
	public void Damage()
	{
		System.out.println("전투기 : 데미지 입히기 성공!");
	}
	
	public void pang()
	{
		System.out.println("전투기 공격 : 팡팡팡~");
	}

}
