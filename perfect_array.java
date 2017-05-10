import java.io.*;
import java.util.*;

class PerfectArray
{
public static void main(String agr[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
HashSet<Integer> values=new HashSet<Integer>();
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
	values.add(arr[i]);
}
int count=0;
for(int i=0;i<n;i++)
{
	for(int j=i+1;j<n;j++)
	{
		int add=arr[i]+arr[j];
		if(values.contains(add))
		{
			count++;
			
		}
	}
	

}
if(count>2)
{
	System.out.println("Array is perfect");
}
else
{
	System.out.println("Array is not perfect");
}

}
}