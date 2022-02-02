import java.util.Scanner;
class employee{
String name;
int id;
double salary;
public void reademp()
{
Scanner sc = new Scanner(System.in);
System.out.print("enter the name:");
name = sc.nextLine();
System.out.println("enter the id:");
id = sc.nextInt();
System.out.println("enter the salary:");
salary = sc.nextDouble();
}
}
class permanent_employee extends employee{
public void printemp()
{
System.out.println("The name is: "+name);
System.out.println("The ID is: "+id);
salary = salary + ((salary*5)/100);
System.out.println("THe salary is: "+salary);
}
}
class temporary_employee extends employee{
public void printemp()
{
System.out.println("The name is: "+name);
System.out.println("The ID is: "+id);
salary = salary+((salary*3.5)/100);
System.out.println("THe salary is: "+salary);
}
}
class week4iii{
public static void main(String[]args){
permanent_employee p = new permanent_employee();
temporary_employee t = new temporary_employee();
p.reademp();
p.printemp();
t.reademp();
t.printemp();
}
}
