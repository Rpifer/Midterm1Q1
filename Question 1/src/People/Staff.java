package People;

public class Staff extends Employee
{
	private String title;

	@Override
	public String toString()
	{
		return "Staff [name = " + getName() +"]";
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	
}
