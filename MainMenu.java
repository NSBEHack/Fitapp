package LifestyleChange;

import java.util.Scanner;

public class MainMenu {
	
	public MainMenu()
	{
		Options();
	}
	
	public void Options()
	{
		System.out.println("1.Create New Account \n2.Login");
		Scanner kb = new Scanner(System.in);
		int choice = kb.nextInt();
		
		if(choice == 1)
		{
			CreateAcc();
		}
		else if (choice ==2)
		{
			Login();
		}
		
	}
	
	public void CreateAcc()
	{
		//all info would be replaced on android systems
		//basic out line of how it would operate
		Scanner kb = new Scanner(System.in);
		System.out.print("Username:");
		String username = kb.next();
		System.out.print("Password: ");
		String password = kb.next();
		
		
		
		System.out.println("First Name: ");
		String firstname = kb.next();
		System.out.println("Last Name: ");
		String lastname = kb.next();
		System.out.print("Age: ");
		int age = kb.nextInt();
		System.out.print("Weight: ");
		float weight = kb.nextFloat();
		System.out.print("Height: ");
		float height = kb.nextFloat();
		

		People people = new People(firstname,lastname,age,height,weight,username,password);
		//Store info on server
		
		DisplayProfile(people);
		
	}
	
	public void Login()
	{
		//Check server info for username and password 
		//Login and show info
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Username:");
		String username = kb.next();
		
		
		System.out.print("Password");
		String password = kb.next();
		
		PList personinfo = new PList();
		People person;
		person = personinfo.Search(username);
		
		if(person.equals(null))
		{
			System.out.println("An error has occur in either your username or password");
		}
		else if(password == person.getPassword())
		{DisplayProfile(person);}
		
		else
		{
			System.out.println("An error has occur in either your username or password");
		}
	
	}
	
	public void DisplayProfile(People person)
	{
		System.out.println("Name: " + person.getFirstName() + " " + person.getLastName());
		System.out.println("Age: " + person.getAge());
		System.out.println("weight: " + person.getWeight());
		System.out.println("Height: " + person.getHeight() );
		
		



	}
	
}
