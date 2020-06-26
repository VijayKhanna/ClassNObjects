package Strings;
import java.util.Scanner;
public class S10 {
	static String Copy(String s1,int n)
	{
		String s2=" ";
		int len;
		len=s1.length();
		s1=s1.substring(s1.charAt(n-1),len-1);
		while(n!=0)
		{
			s2=s2.concat(s1);
			n--;
		}
		return s2;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1;
		s1=sc.nextLine();
		int n;
		n=sc.nextInt();
		System.out.println(Copy(s1,n));
	}
}
