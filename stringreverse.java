import java.io.*;
import java.util.*;
class abc
{
	public static void main(String agr[])
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			
		String str=br.readLine();
		char ch[]=str.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		System.out.println(rev);
		}
		catch(Exception e)
		{
		}
	}
}