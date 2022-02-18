package Practice;

import java.util.Scanner;

public class PatternM {

	public static void design()
	{
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {				
				if(j==(n-1)) System.out.print("*\n");	
				else if(j==0) System.out.print("*");
				else if(i==1 && j==1) System.out.print("*");
				else if(i==2 && j==2) System.out.print("*");
				else if(i==1 && j==3) System.out.print("*");
				else System.out.print(" ");
			}
		}sc.close();
	}
	public static void main(String[] args) {
		design();
	}
}
