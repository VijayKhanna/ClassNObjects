package Strings;
import java.util.Scanner;
public class S9 {
public static void main(String args[])
{
	String s1,s2;
	String fin=" ";
	Scanner sc= new Scanner(System.in);
	int a,b;
	s1=sc.nextLine();
	s2=sc.nextLine();
	a=s1.length();
	b=s2.length();
	int len;
	len=Math.min(a, b);
	int i=0;
	while(i<len)
	{
		fin+=s1.substring(i,i+1)+s2.substring(i,i+1);
		i++;
	}
	if(a!=b)
	{
		fin+=s2.substring(len);
	}
	if(b!=a)
	{
		fin+=s1.substring(len);
	}
	System.out.println(fin);
}
}
