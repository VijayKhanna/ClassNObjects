import java.util.Scanner;
public class S1 {
	int a,b,c;
	Scanner sc = new Scanner(System.in);
	void read(int a,int b,int c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	void vol(int a,int b,int c)
	{
		int v;
		v=a*b*c;
		System.out.println(v);
	}
public static void main(String args[])
{
	S1 nx = new S1();
	nx.read(10,20,30);
	nx.vol(10,20,30);
}
}
