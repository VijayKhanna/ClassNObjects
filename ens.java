package Encapsulation;

public class ens 
{
	public static String name,mailid;
	public static char gender;
	ens(String n,String m,char g)
	{
		name=n;
		mailid=m;
		gender=g;
	}
}
class Book{
	String name1,author;
	double price;
	int avail;
	Book(String n1)
	{
		name1=n1;
	}
	void setavail()
	{
		avail=10;
	}
	void setprice()
	{
		price=100;
	}
	double getprice()
	{
		return  price;
	}
	int getavail()
	{
		return avail;
	}
	String getname1()
	{
		return name1;
	}
	void getauthor()
	{
		System.out.println("Author name- "+ens.name);
		System.out.println("Author mailid- "+ens.mailid);
		System.out.println("Author gender- "+ens.gender);
	}
}
public class BookF{
	public static void main(String args[])
	{
		Book b=new Book("Wings of fire");
		ens a= new ens("A.P.J ","apj@yahoo.com",'m');
		b.setprice();
		b.setavail();
		System.out.println("Name- "+b.getauthor());
		System.out.println("Price - "+b.getprice());
		System.out.println("Avilable books - "+b.getavail());
		b.getauthor();
	}
}