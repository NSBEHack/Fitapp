package LifestyleChange;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class DataManage {

	PList persondata;
	private String username;
	private String Password;
	
	private int height;
	private int age;
	private float weight;
	private String name;
	private String ID;
	private String address;
	
	public DataManage()
	{
		
	}
	
	public void loadData(int num)
	{
		
		//FileInputStream in = null;
		Scanner in = null;
		String filename = "RegisteredPeople";
		String[] patientvariables = new String[8];
		
		int cur = 0;
		
		try
		{
			in =  new Scanner(new File(filename));
			in.useDelimiter(",");
			
			while(in.hasNextLine())
			{
								
				
				String nextLine = in.nextLine();
			
				if(cur == num)
				{
					for(int i = 0; i <5 ; i++)
					{
						patientvariables = nextLine.split(",");
						//System.out.println(patientvariables[i]);
						
					}
				break;
				}
				cur++;
			}
			
			
			
			username = patientvariables[0].trim();
			Password =  patientvariables[1].trim();
			age = Integer.parseInt(patientvariables[2].trim());
			height= Integer.parseInt( patientvariables[3].trim());
			weight=  Float.parseFloat(patientvariables[4].trim());
			
			in.close();
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println("file not found");
			System.exit(0);
		}
		
		catch(NoSuchElementException e)
		{
			System.out.println("No new Line Exception");
			System.exit(0);
		}
	}

	public void clearFile()
	{
		FileWriter clear = null;
		String filename = "RegisteredPeople";
		
		String content;
		
		try
		{
			clear = new FileWriter(new File(filename),false);
			
			clear.write("");
			clear.close();

		}
		catch(IOException e)
		{
			System.out.println("IO Exception");
		}
		finally
		{
		}
		
	}
	
	public void saveData(PList target)
	{
		FileWriter save = null;
		String filename = "RegisteredPeople";
		
		String content = "";
		
		try
		{
			save = new FileWriter(new File(filename),true);
			target.previous.next = target.head;
			while(target.previous.next != null)
			{	
				content = target.previous.next.ppl.toStrings();
				save.write(content);
				save.write("\n");
				target.previous.next = target.previous.next.next;
			}
			
			save.close();
		}
		catch(IOException e)
		{
			System.out.println("IO Exception");
		}
		
	}
}


