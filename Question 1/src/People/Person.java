package People;

public class Person
{
	private String name;
	private String address;
	private double phoneNumber;
	private String email;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public double getPhoneNumber()
	{
		return phoneNumber;
	}
	public void setPhoneNumber(double phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	@Override
	public String toString()
	{
		return "Person  [name = " + getName() +"]";
	}
	
	
}
