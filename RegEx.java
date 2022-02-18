package Practice;


import java.util.regex.*;
public class RegEx {


	public static void onlySpecialCharacters(String str)
	{



		String string= str;
		int count=0;

		Matcher m = Pattern.compile("[^a-zA-Z0-9\s]").matcher(string);
		while (m.find())
		{
			count++;
			System.out.println("Char= "+str.charAt(m.start()));
		}	
		System.out.println("Number of count= "+count);	

	}


	public static void main(String args[])
	{

		String str = "Bharath Amin @67 6$ %^ ^#^";


		onlySpecialCharacters(str);
	}
}