package Strings;
import java.util.Scanner;
public class S1 {
public static void main(String args[])
{
	String s;
	Scanner sc=new Scanner(System.in);
	s=sc.nextLine();
	StringBuffer sb=new StringBuffer(s);
	sb.reverse();
	if(s.equalsIgnoreCase(sb.toString()))
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println(" Not a Palindrome");
	}
}
}
