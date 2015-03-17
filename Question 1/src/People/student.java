package People;

public class student extends Person
{
	private eRank rank;

	public eRank getRank()
	{
		return rank;
	}

	public void setRank(eRank rank)
	{
		this.rank = rank;
	}

	@Override
	public String toString()
	{
		return "student  [name = " + getName() +"]";
	}
	
}
