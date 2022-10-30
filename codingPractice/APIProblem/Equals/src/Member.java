
public class Member {
	private String id;
	
	public Member()
	{
		this.id = null;
	}
	
	public Member(String id)
	{
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Member)
		{
			Member member = (Member) obj;
			
			if(id.equals(member.id))
			{
				return true;
			}
		}
		return false;
	}
}
