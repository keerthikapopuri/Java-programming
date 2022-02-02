import java.util.Scanner;
class room
{
int l,b,a;
public int area_calc()
{
Scanner sc = new Scanner(System.in);
System.out.print("enter length: ");
l = sc.nextInt();
System.out.println("enter breadth:");
b = sc.nextInt();
a = l*b;
return a;
}
public int area_calc(int l)
{
System.out.println("its a square");
a = l*l;
return a;
}
public int area_calc(int l, int b)
{
a= l*b;
return a;
}
}
class week5i
{
public static void main(String[]args)
{
room r = new room();
System.out.println("first method");
System.out.println(r.area_calc());
System.out.println("second method");
System.out.println(r.area_calc(4));
System.out.println("third method");
System.out.println(r.area_calc(4,3));
}
}


