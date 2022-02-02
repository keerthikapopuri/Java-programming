import java.util.Scanner;
import java.lang.Math;
abstract class shape
{
int a,b;
abstract void printarea();
}
class rectangle extends shape
{
void printarea()
{
Scanner sc = new Scanner(System.in);
System.out.println("enter length & breadth; ");
a = sc.nextInt();
b = sc.nextInt();
System.out.println("the area of rectangle is:"+a*b);
}
}
class triangle extends shape
{
void printarea()
{
Scanner sc = new Scanner(System.in);
System.out.println("enter side; ");
a=sc.nextInt();
System.out.println("the area of triangle is:"+(0.433*Math.pow(a,2)));
}
}
class circle extends shape
{
void printarea()
{
Scanner sc = new Scanner(System.in);
System.out.println("enter radius; ");
a = sc.nextInt();
System.out.println("the area of circle is: "+(3.14*Math.pow(a,2)));
}
}
class week6i
{
public static void main(String[]args)
{
rectangle r = new rectangle();
r.printarea();
triangle t = new triangle();
t.printarea();
circle c = new circle();
c.printarea();
}
}
