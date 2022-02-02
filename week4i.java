import java.util.*;
class employee{
String name,id,des;
public void reademp(){
Scanner s = new Scanner(System.in);
System.out.print("Enter name:");
name = s.nextLine();
System.out.print("Enter id:");
id = s.nextLine();
System.out.print("Enter designation:");
des = s.nextLine();
}
}
class salary extends employee{
int bp,hra,da,pf;
public void readsal(){
Scanner s = new Scanner(System.in);
System.out.print("Enter bp:");
bp = s.nextInt();
System.out.print("Enter hra:");
hra = s.nextInt();
System.out.print("Enter da:");
da = s.nextInt();
System.out.print("Enter pf:");
pf = s.nextInt();
}
public int calculatesalary(){
int np = bp+hra+da-pf;
return np;
}
public void displayemp(){
System.out.println("name is : "+name);
System.out.println("Id is : "+id);
System.out.println("designation is :"+des);
}
}
class week4i{
public static void main(String[]args)
{
salary s = new salary();
s.reademp();
s.readsal();
int result = s.calculatesalary();
System.out.println("The salary is: "+result);
s.displayemp();
}
}




