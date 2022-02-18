package Practice;
import java.util.*;

public class StringPractice {

	public static void separateString(String str) {
		String cap ="", small = "", digit = "", spcl ="";
		for(int i=0;i<str.length();i++)
		{

			char temp=str.charAt(i);
			
			if(Character.isAlphabetic(temp)){
				if(Character.isLowerCase(temp))
				{
					small=small+ Character.toString(temp);
				}else
				{
					cap=cap+ Character.toString(temp);
				}
			}else if(Character.isDigit(temp)) {
				digit=digit+Character.toString(temp);
			}else if(!Character.isAlphabetic(temp) && !Character.isDigit(temp) && !Character.isWhitespace(temp))
			{
				spcl=spcl+ Character.toString(temp);
			}
		}
		System.out.println("UpperCase="+cap+"\nLowerCase="+small+"\nDigit="+digit+"\nSpecialChar="+spcl);
	}
	public static void main(String args[])
	{
		String string="BharathAmin $ @3456677";
		separateString(string);
	}
}