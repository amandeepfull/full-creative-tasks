import java.io.*;
import java.util.*;
class abc
{
	public static void main(String atg[])throws Exception
	{
		
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 
		 HashMap<String,HashMap<String,String>> directory =new HashMap<String,HashMap<String,String>>();
 		 
		FileOutputStream fos=new FileOutputStream("contacts.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		FileInputStream fis=new FileInputStream("contacts.ser");
		ObjectInputStream ois =new ObjectInputStream(fis);
		
		

while(true)
{
	System.out.println("1. Add a contact\n2. Add on existing contact\n3. Search \n4. Show full Directory\n5.Delete Full Directory\n6.Exit\n" );
System.out.println("Enter your choice:	");

	
	int n=Integer.parseInt(br.readLine());
	switch (n)
	{
		case 1:
					System.out.println("Enter the name U want to save:	");
					String name=br.readLine();
					
					HashMap<String,String> contacts= new HashMap<String,String>();
					System.out.println("Enter the place for u Want to save the Contact:	");
					String pla=br.readLine();
					System.out.println("Enter the Number for your Contact:	");
					String num=br.readLine();
					contacts.put(pla,num);
					directory.put(name,contacts);
					
					oos.writeObject(directory);
				
					
					System.out.println("########################Contact entered Successfully ######################3");
							break;
		
		
		case 2: 
					System.out.println("Enter the Name to Add new Number");
					String str=br.readLine();
					HashMap<String,HashMap<String,String>> directory1=(HashMap)ois.readObject();
					System.out.println(directory1);
					if(directory1.containsKey(str))
					{
						System.out.println("Enter the place for your Contact:	");
						String place=br.readLine();
						System.out.println("Enter the Number for your Place:	");
						String numb=br.readLine();
						directory1.get(str).put(place,numb);
						
						oos.writeObject(directory1);
						System.out.println("#####################Contact Updated Successfully####################");	
					}
					else
						{
						System.out.println("No such Contact Available");
						}
						break;
						
						
						
		case 3: {
					System.out.println("Enter the name U want to Search:	");
					String s=br.readLine();
					HashMap<String,HashMap<String,String>> directory2 =(HashMap)ois.readObject();	
		if(directory2.containsKey(s))
		{
			System.out.println(directory2.get(s));
		}
	else{
		System.out.println("No such Contact Available");
			}
		break;
		
		}
		
		
		
		case 4:		System.out.println("Your full Contact Directory\n");
		
		 HashMap<String,HashMap<String,String>> directory3 =(HashMap)ois.readObject();	
		
		System.out.println(directory3);
		 
				
						break;
		




		
		case 6: 
				System.exit(0);
		break;
		
		
		
						
		 default:	System.out.println("Enter the valid Choice:	");
	
	}
}
		
	}
}	
		
		
		 

