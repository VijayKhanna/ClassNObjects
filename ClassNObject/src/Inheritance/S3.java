package Inheritance;
import java.util.Scanner;
public class S3 {
	void eat()
	{
		System.out.println("Animal is Eating");
	}
	void sleep()
	{
		System.out.println("Animal is Sleeping");
	}
	class Bird extends S3
	{
		void fly()
		{
			System.out.println("Bird is flying");
		}
	}
public static void main(String args[])
{
	S3 nx=new S3();
	nx.eat();
	nx.sleep();
	}
}
