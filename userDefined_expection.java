import java.io.*;
import java.util.*;
class MyException extends Exception
{

int age;MyException(int age)
{
	this.age=age;
}

public String toString()
{
	return "MyExeption found: You cannot enter your age below 1";
}


}


class Directory
{
	String name;
	String id;
	int age;
	String address;
	
	Directory(String name, String id, int age, String address)
	{
		this.name=name;
		this.id=id;
		this.age=age;
		this.address=address;
	}
	
	
}

class Driver
{
	
	public static int operation(int a)throws MyException
	{
		if(a>0)
		{
			return a;
		}
		else
		{
		
		throw new MyException(a);
		
		}
	}
	public static void main(String agr[]) throws Exception
	{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in)); 
		System.out.println("Enter your name:	");
		String name=br.readLine();
		System.out.println("Enter your id:	");
		String id=br.readLine();
		System.out.println("Enter your age");
		int age=Integer.parseInt(br.readLine());
		System.out.println("Enter your Address:	");
		String address=br.readLine();
		
		try
		{
		age=operation(age);
		}
		
		catch(NumberFormatException e)
		{
			System.out.println("you cannot enter your age in Alphabets");
			System.out.println("enter your details again...........");
			main(agr);
		}
	
		catch(MyException e)
		{
			System.out.println(e);
			System.out.println("Fill again................");
			main(agr);
			
		}
	
		Directory d=new Directory(name,id,age,address);
		System.out.println("##################Data entered Successfully############	");
		
		
	}
}