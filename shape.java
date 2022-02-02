import java.util.Scanner;
abstract class side
{
int[] a = new int[6];
abstract void getside();
}
class triangle extends side
{
public void getside()
{
Scanner s = new Scanner(System.in);
System.out.println("triangle");
for(int i=0;i<3;i++)
{
System.out.print("enter side: ");
a[i] = s.nextInt();
}
}
public int peri()
{
int res=0;
for(int i=0;i<3;i++)
{
res=res+a[i];
}
return res;
}
}
class cube extends side
{ 
int res=0;
public void getside()
{
Scanner s = new Scanner(System.in);
System.out.print("enter side: ");
a[0] = s.nextInt();
}
public int peri()
{
res=6*(a[0]^2);
return res;
}
}
class shape
{
public static void main(String[]args)
{
triangle t = new triangle();
t.getside();
System.out.println("the perimeter of triangle is: "+t.peri());
cube c = new cube();
c.getside();
System.out.println("the perimeter of cube is: "+c.peri());
}
}







