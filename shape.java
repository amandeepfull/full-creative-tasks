import java.io.*;

interface shape
{
	public void area();
	public void volume();
	
}

abstract class rectangle implements shape
{
	int len,bre,are;
	rectangle(int a,int b)
	{
		len=a;
		bre=b;
		
	}
	
	public void area()
	{
		are=len*bre;
		System.out.println("area of rectangle is: "+are);
		
	
	}
	
}
class rectangle_1 extends rectangle{
	
	
	rectangle_1(int a,int b)
	{
		
		super(a,b);
	}
	
	public void volume()
	{
		
	}
	 
	
	
}
 abstract class cube implements shape
{
	
	int side,are;
	cube (int s)
	{
		side=s;
	}
	
	
	public void volume()
	{
		are=side*side*side;
		System.out.println("volume of cube is: "+are);
	}
}

class cube_1 extends cube{
	
cube_1(int s)

{
	
super(s);	
}	

public void area()
{
	
}
	
}


oublic class driver
{
	public static void main(String ar[])
	{
		rectangle_1 rec=new rectangle_1(7,8);
		rec.area();
		cube_1 cu=new cube_1(4);
		cu.volume();
	}
}