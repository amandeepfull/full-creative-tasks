	import java.io.*;
import java.util.*;
class abc
{
	BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
	HashMap<String,HashMap<String,String>> hss =new HashMap<String,HashMap<String,String>>(); 
	public void add(String name)
	{
		try{
		
			HashMap<String,String> hm= new HashMap<String,String>();
		System.out.println("Enter the place for u Want to save the Contact:	");
		String pla=br1.readLine();
		System.out.println("Enter the Number for your Contact:	");
		String num=br1.readLine();
		hm.put(pla,num);
		hss.put(name,hm);
		FileOutputStream fos=new FileOutputStream("contacts.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(hss);
			System.out.println("########################Contact entered Successfully ######################3");
		}
				
	
		
		catch(Exception e)
		{
			
		}
	}
	public void add_on_existing(String name)
	{
		try{	
		FileInputStream fis=new FileInputStream("contacts.ser");
		ObjectInputStream ois =new ObjectInputStream(fis);
		HashMap<String,HashMap<String,String>> hss1=(HashMap)ois.readObject();
		if(hss1.containsKey(name))
		{
			System.out.println("Enter the place for your Contact:	");
			String pla=br1.readLine();
			System.out.println("Enter the Number for your Place:	");
			String num=br1.readLine();
			hss1.get(name).put(pla,num);
		FileOutputStream fos=new FileOutputStream("contacts.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(hss1);
			System.out.println("#####################Contact Updated Successfully####################");	
		}
		else
		{
			System.out.println("No such Contact Available");
		}
		}
		catch(Exception e)
		{
		}
	}
	public void search(String name)
	{
	try{
		FileInputStream fis=new FileInputStream("contacts.ser");
		ObjectInputStream ois =new ObjectInputStream(fis);
		HashMap<String,HashMap<String,String>> hss1=(HashMap)ois.readObject();	
		if(hss1.containsKey(name))
		{
			System.out.println(hss1.get(name));
		}
	else{
		System.out.println("No such Contact Available");
	}
	}
		catch(Exception e)
		{
		}
	}
	public void fullContact()
	{	
		try{
		System.out.println("Your full Contact Directory\n");
		FileInputStream fis=new FileInputStream("contacts.ser");
		ObjectInputStream ois =new ObjectInputStream(fis);
		HashMap<String,HashMap<String,String>> hss1=(HashMap)ois.readObject();	
		for(Map.Entry m: hss1.entrySet())
		{
			System.out.println(m.getKey());
		}
		System.out.println();
		}
		catch(Exception e)
		{
		}
	}
	
public static void main(String agr[])
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
abc a=new abc();
while(true)
{
	System.out.println("1. Add a contact\n2. Add on existing contact\n3. Search \n4. Show full Directory\n5.Delete Full Directory\n6.Exit\n" );
System.out.println("Enter your choice:	");
try{
	
	int n=Integer.parseInt(br.readLine());
	switch (n)
	{
		case 1:
					System.out.println("Enter the name U want to save:	");
					String name=br.readLine();
					a.add(name);
		break;
		
		
		case 2: 
					System.out.println("Enter the Name to Add new Number");
					String str=br.readLine();
					a.add_on_existing(str);
		break;
		case 3: 
					System.out.println("Enter the name U want to Search:	");
					String s=br.readLine();
					a.search(s);
		break;
		case 4: 
					a.fullContact();
		break;
		
		
		case 6: 
				System.exit(0);
		break;
						
		 default:	System.out.println("Enter the valid Choice:	");
	
	}
}
catch(Exception e)
{
}
}
}
}