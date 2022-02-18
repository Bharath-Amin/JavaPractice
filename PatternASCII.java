package Practice;

public class PatternASCII {

	public static void main(String[] args) {
		
	
	int alpha = 65;
	for(int i=0; i<=5;i++) {
		for(int j=0; j<=i; j++) {
			System.out.print((char)(alpha)+" ");
		}
		alpha+=1;
		System.out.println();
	}
		
		
		
		//Typecasting
//		System.out.print((char)65);
//		int a=65;
//		char ag=(char) a;
//		System.out.println(ag);
}
}
