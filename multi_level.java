import java.util.*;
class student
{
String name;
int rollno;
public void inpstu()
{
Scanner s = new Scanner(System.in);
System.out.print("enter name: ");
name = s.nextLine();
System.out.print("enter rollno: ");
rollno = s.nextInt();
}
}
class test extends student
{
int[] a = new int[6]; 
public void inptest()
{
Scanner s = new Scanner(System.in);
for(int i = 0 ; i < 6 ; i++)
{
System.out.print("enter marks: ");
a[i] = s.nextInt();
}
}
}
class result extends test
{
int result=0;
public int calc_result()
{
int i;
for(i=0;i<6;i++)
{
result=result+a[i];
}
return result;
}
}
class multi_level
{ 
public static void main(String[]args)
{
result r = new result();
r.inpstu();
r.inptest();
int res = r.calc_result();
System.out.println("The result is: "+res);
}
}






