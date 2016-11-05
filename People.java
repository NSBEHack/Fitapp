package LifestyleChange;

public class People {

	private String firstname;
	private String lastname;
	private	int age;
	private float height;
	private float weight;
	private String username;
	private String password;
	
	private int points;
	
	public People(String firstname, String lastname, int age, float height, float weight, String username, String password)
	{
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.height=height;
		this.weight=weight;
		this.username=username;
		this.password=password;
	}
	public People()
	{}
	
	//setters
	public void setAge(int age)
	{this.age=age;}
	

	public void setHeight(float height)
	{this.height=height;}
	

	public void setWeight(float weight)
	{this.weight=weight;}
	

	public void setUsername(String username)
	{this.username=username;}


	public void setPassword(String password)
	{this.password=password;}
	
	public void setFirstName(String name)
	{this.firstname= name;}
	
	public void setLastName(String name)
	{this.lastname= name;}
	
	//getters
	public int getAge()
	{return age;}
	
	public float getWeight()
	{return weight;}
	
	public float getHeight()
	{return height;}
	
	public String getUsername()
	{return username;}
	
	public String getPassword()
	{return password;}
	
	public String getFirstName()
	{return firstname;}
	
	public String getLastName()
	{return lastname;}
	
	public void pointGain()
	{
		
	}
	
	public String toStrings()
	{
		String text = String.format("%s,%s, %s, %d, %.2f,%s",firstname,lastname,age,height,weight,points);
		return text;
	}
}
