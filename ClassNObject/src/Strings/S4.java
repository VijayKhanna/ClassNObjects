package Strings;
import java.util.Scanner;
public class S4 {
public static void main(String args[])
{
	String s1;
	Scanner sc= new Scanner(System.in);
	s1=sc.nextLine();
	int len,n;
	len=s1.length();
	if(len%2!=0)
	{
		System.out.println("null");
	}
	else
	{
		System.out.println(s1.substring(0,s1.length()/2));
	}
}
}
