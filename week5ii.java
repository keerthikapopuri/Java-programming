import java.util.Scanner;
class Figure
{
  int l,w;
 Figure(int a,int b)
{
  l=a;
  w=b;
}
void area()
{
  System.out.println("Area of the Figure");
}
}
class Triangle extends Figure
{
  Triangle(int g,int h)
{
  super(g,h);
}
void area()
{
  System.out.println("Area of triangle "+(l*w)/2);
}
}
class Rectangle extends Figure
{
 Rectangle(int k,int l)
{
 super(k,l);
}
 void area()
{
 System.out.println("Area of rectangle is "+l*w);
}
}
class week5ii
{
public static void main(String args[])
{
 int m,n;
 Scanner sc=new Scanner(System.in);
 System.out.print("enter the dimensions: ");
 m=sc.nextInt();
 n=sc.nextInt();
 Rectangle obj1=new Rectangle(m,n);
 Triangle obj2=new Triangle(m,n);
 obj1.area();
 obj2.area();
}
}