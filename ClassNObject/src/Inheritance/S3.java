package Inheritance;
class Animal
{
	void eat()
	{
		System.out.println("Animal is Eating");
	}
	void sleep()
	{
		System.out.println("Animal is Sleeping");
	}
}
class Bird extends Animal
{
	void fly()
	{
			System.out.println("Bird is flying");
	}
}
public class S3 
{
public static void main(String args[])
{
	Animal nx=new Animal();
	nx.eat();
	nx.sleep();
	Bird b=new Bird();
	b.fly();
}
}
