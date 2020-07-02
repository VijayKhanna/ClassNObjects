package Strings;
import java.util.Scanner;
public class S8 {
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	StringBuffer sb=new StringBuffer(s1);
	String s1;
	s1=sc.nextLine();
	int i,l;
	i=s1.indexOf('*');
	l=s1.lastIndexOf('*');
	String s2;
	s2=s1.delete(i-1,l+2);
	System.out.println(s2);
}
}
