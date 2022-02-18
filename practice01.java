package Practice;


import java.util.*;
import java.io.*;



class practice01{
	public static void main(String []argh)
	{



		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		long a[] =new long[t];

		try 
		{
			for(int i=0;i<t;i++)
			{
				a[i]=sc.nextLong();
			}
			Arrays.sort(a);
			for(int j=0;j<t;j++)
			{
				long x=a[j];
				System.out.println(x+" can be fitted in:");
				if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)System.out.println("* byte");
				//Complete the code
				if(x>=-32768 && x<=32767)
				{

					System.out.println("* short");
				}
				if(x>=-2147483648 && x<=2147483647)
				{

					System.out.println("* int");
				}
				if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)
				{

					System.out.println("* long");
				}
			}
		}
		catch(Exception e)
		{
			sc.next();
			System.out.println(sc.next()+" can't be fitted anywhere.");
		}

	}
}



