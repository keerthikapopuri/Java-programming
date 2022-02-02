import java.util.Scanner;
class Employee{
static int salary=0,hours=0;
public void getinfo()
{
Scanner sc=new Scanner(System.in);
System.out.print("enter the salary: ");
salary=sc.nextInt();
System.out.print("enter the hours: ");
hours=sc.nextInt();
}
public int Addsal(){
if (salary<500){
salary=salary+10;
}
return salary;
}
public int Addwork(){
if(hours>=6){
salary=salary+5;
}
return salary;
}

public static void main(String[]args)
{
int salary,hours;
int i;
Scanner s=new Scanner(System.in);
i=s.nextInt();
for(int n=0;n<i;n++)
{
Employee obj=new Employee();
obj.getinfo();
salary=obj.Addsal();
salary=obj.Addwork();
System.out.println("final: "+salary);
}
}



}