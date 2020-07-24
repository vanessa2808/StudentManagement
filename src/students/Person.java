package students;

import java.util.Scanner;
public class Person 
{
	protected String name;
	protected boolean sex;
	protected DateOfBirth dob;
	protected Address add;
	public Person() 
	{
		this.name=null;
		this.sex=false;
		this.dob=null;
		this.add=null;
	}
	public Person(String name,boolean sex,  DateOfBirth dob,Address add) 
	{
		this.name=name;
		this.sex=sex;
		this.dob=dob;
		this.add=add;
	}
	public void input() 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Name: ");
		this.name=sc.nextLine();
		System.out.print("Sex: ");
		this.sex=sc.nextBoolean();
		dob= new DateOfBirth();
		dob.input();
		add= new Address();
		add.input();
	}
	
	public void output() 
	{
		System.out.println("Name: "+name);
		if(sex==false)System.out.println("Sex: female");
		else System.out.println("Sex: male");
		dob.output();
		add.output();
	}
	
}
