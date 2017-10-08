import java.util.*;
public class Palindrome
{
	public static String palindrome(String str)
	{
	char[] ch=str.toCharArray();
	String revstr ="";
	for(int i=ch.length-1;i>=0;i--)
	{
		revstr =revstr + ch[i];	
	}
	return revstr;
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String ");
	String str= sc.nextLine();
	
	if(str.equals(palindrome(str))
		System.out.println("Entered String is Palindrome");
	else
		System.out.println("Entered String is not Palindrome");
}

}
