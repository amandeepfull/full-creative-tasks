import java.io.*;
import java.util.*;

class PerfectArray
{
public static void main(String agr[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Size of Array :");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter the Elements in Array:	");
HashSet<Integer> values=new HashSet<Integer>();
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
	values.add(arr[i]);
}

if(values.contains(0))
	System.out.println("Array is perfect");

else
	System.out.println("Array is not perfect");
}

}
/*
..........................................................................................
#0 TestCase 

Input:

Enter the Size of Array :
5
Enter the Elements in Array:	
0
2
4
0
7

Output:

Array is perfect

.......................................................................................

#1 TestCase

Input:

Enter the Size of Array :
5
Enter the Elements in Array:	
1
2
3
4
5

Output:

Array is not perfect
.........................................................................................
*/