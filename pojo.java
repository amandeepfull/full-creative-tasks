import java.io.*;
import java.util.*;

interface Getter_Setter
{
	public void putValue(String,String,String,String);
	public String getBusiness();
	public String getWork();
	public String getHome();
	public String getAddress();
}

class Directory implements Getter_Setter{
	
	String bussiness;
	String work;
	String home;
	String Address;
	public void putValue(String buss,String wo,String ho,String Add)
	{
		bussiness=buss;
		work=wo;
		home=ho;
		Address=Add;
	}
	
	public String getBusiness()
	{
		return bussiness;
	}
	public String getWork()
	{
		return work;
	}
	public String getHome()
	{
		return home;
	}
	public String getAddress()
	{
		return Address;
	}
	
	public String toString()
	{
		System.out.println("######################Your Contact Details#####################");
		
		return "business="+bussiness+"\n"+"work="+work+"\n"+"home="+home+"\n"+"Address="+Address;
	}
}

class Driver{
public static void main(String agr[]) throws Exception
{
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	HashMap<String,Directory> contacts=new HashMap<String,Directory>();
while(true)
{
	System.out.println("1. Add a contact\n2. Search \n3. Show full Directory\n4.Delete a Contact \n5.Exit\n" );
System.out.println("Enter your choice:	");
	
	int n=Integer.parseInt(br.readLine());
	switch (n)
	{
		case 1:
					
					System.out.println("Enter the name U want to save:	");
					String name=br.readLine();
					System.out.println("Enter the contact number for your bussiness place:	");
					String bus=br.readLine();
					System.out.println("Enter the contact number for your work place:	");
					String wo=br.readLine();
					System.out.println("Enter the contact number for your Home place:	");
					String hom=br.readLine();
					System.out.println("Enter Your Address	");
					String ad=br.readLine();
					Directory d=new Directory();
					d.putValue(bus,wo,hom,ad);
					contacts.put(name,d);
System.out.println();					
						break;
		case 2: 
					System.out.println("Enter the name U want to Search:	");
					String s=br.readLine();
					if(contacts.containsKey(s))
					{
						System.out.println(contacts.get(s));
						
						System.out.println("###############################");
					}
					else
					{
						System.out.println("Sorry no any contact Available!!!!!!!!!!!!!!!!!11");
					}
					System.out.println();
					
					break;
		case 3: 
					System.out.println("###################Your full directory is as follows: #######################");
					int i=1;
					for(Map.Entry m:contacts.entrySet())
					{
						System.out.println(i+"."+m.getKey());
						i++;
					}
					
					System.out.println("#########################");
					System.out.println();
						break;
			
		case 4: 
					System.out.println("Enter the Contact name U want to Delete:	");
					String na=br.readLine();
					System.out.println();
					if(contacts.containsKey(na))
					{
						contacts.remove(na);
						System.out.println("###########Contact removed Successfully############3");
					}
					else{
						System.out.println("###########No such element Found#########");
					}
					System.out.println();
					
		break;
		
		
		case 5: 
				System.exit(0);
		break;
						
		 default:	System.out.println("Enter the valid Choice:	");
						System.out.println();
	
	}

	
}
}
}