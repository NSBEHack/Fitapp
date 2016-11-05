package LifestyleChange;

public class People {

	private String name;
	private	int age;
	private float height;
	private float weight;
	private String username;
	private String password;
	
	public People(String name, int age, float height, float weight, String username, String password)
	{
		this.name = name;
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
	
	public void setName(String name)
	{this.name= name;}
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
	
	public String getName()
	{return name;}
}
