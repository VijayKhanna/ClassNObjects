import java.util.Scanner;
public class S2 {
double powerInt(int a,int b)
{
	double val1;
	val1=Math.pow(a,b);
	System.out.println(val1);
	return val1;
}
double powerDou(double a,double b)
{
	double val2;
	val2=Math.pow(a, b);
	System.out.println(val2);
	return val2;	
}
public static void main(String args[])
{
	S2 nx =new S2();
	nx.powerInt(2,5);
	nx.powerDou(3, 5);
}
}
