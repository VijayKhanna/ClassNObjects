package Strings;
public class S3 {
	static String Copy(String s1,int n)
	{
		String copy=" ";
		if(n<2)
			return s1;
		else
			s1=s1.substring(0,2);
		while(n!=0)
		{
			copy=copy.concat(s1);
			n--;
		}
		return copy;
	}
public static void main(String args[])
{
	String s1="Wipro";
	int n;
	n=s1.length( );
	System.out.println(Copy(s1,n));
}
}
