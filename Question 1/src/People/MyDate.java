package People;

public class MyDate
{
	private int year;
	private String month;
	private int day;
	public int getYear()
	{
		return year;
	}
	public void setYear(int year)
	{
		this.year = year;
	}
	public String getMonth()
	{
		return month;
	}
	public void setMonth(String month)
	{
		this.month = month;
	}
	public int getDay()
	{
		return day;
	}
	public void setDay(int day)
	{
		this.day = day;
	}
	@Override
	public String toString()
	{
		return "MyDate [year=" + year + ", month=" + month + ", day=" + day
				+ "]";
	}
	
}
