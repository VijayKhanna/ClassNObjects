package Strings;
import java.util.Scanner;
public class S7 {
	public static void main(String args[])
	{
		String s1;
		Scanner sc = new Scanner(System.in);
		int len;
		s1=sc.nextLine();
		len=s1.length();
		if(len==1)
		{
			if(s1.charAt(0)=='x')
				System.out.println(" ");
			else
				System.out.println(s1);
		}
		if(s1.charAt(0)=='x' && s1.charAt(len-1)=='x')
		{
			System.out.println(s1.substring(1,len-1));
		}
		else
			System.out.println("Not a type");
	}

}
