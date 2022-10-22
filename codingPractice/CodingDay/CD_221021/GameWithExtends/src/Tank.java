
public class Tank extends CombatUnit {
	
	public void Attack()
	{
		pung();
	}
	
	public void Damage()
	{
		System.out.println("탱크 : 데미지 입히기 성공!");
	}

	public void pung()
	{
		System.out.println("탱크 공격 : 펑~");
	}
}
