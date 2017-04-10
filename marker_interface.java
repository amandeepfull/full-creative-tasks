/*
marker interfaces :  marker interfaces are empty interfaces which do not contains any method in it

Why we use marker interfaces : We use marker interfaces  to indicate something to jvm.

e.g serializable is marker interface which tells the compiler to save the state of the object.


*/

import java.io.*;
import java.util.*;
interface Detail 
{

}

interface Directory
{
}


class access implements Detail{
	
	public void showDetail()
	{
		
		System.out.println("show details method of access class");
		
	}
}


class deaccess implements Directory{
	public void showDetail()
	{
		System.out.println("show detail method of deaccesss class");
	}
	
}
class Driver{
	public static void main(String agr[])
	{
		access a=new access();
		deaccess d=new deaccess ();
		if(a instanceof Directory )
		{
			a.showDetail();
		}
		else
		{
			System.out.println("Noo output");
		}		
	}
}
