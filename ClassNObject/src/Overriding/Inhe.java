package Overriding;
class Shape{
void draw()
{
System.out.println("Drwaing Shape");
}
void erase()
{
System.out.println("Erasing Shape");
}
}
class Circle extends Shape{
void draw()
{
System.out.println("Drwaing Circle");
}
void erase()
{
System.out.println("Erasing Circle");
}
}
class Triangle extends Shape{
void draw()
{
System.out.println("Drwaing Triangle");
}
void erase()
{
System.out.println("Erasing Triangle");
}
}
class Square extends Shape{
void draw()
{
System.out.println("Drwaing Square");
}
void erase()
{
System.out.println("Erasing Square");
}
}
public class Inhe
{
public static void main(String args[])
{
Shape c= new Circle();
Shape s= new Triangle();
Shape t= new Square();
c.draw();
c.erase();
s.draw();
s.erase();
t.draw();
t.erase();
}
}
