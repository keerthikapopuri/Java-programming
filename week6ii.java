import java.util.Scanner;

interface Student
{
	
	void getValue();
}

interface Department
{
	void getattendence();
}

class Exam implements Student,Department
{
int sno;
String sname,classi;
int attendence;
Scanner sc = new Scanner(System.in);
public void getValue()
{
System.out.println("enter student name:");
sname=sc.nextLine();
System.out.println("enter class:");
classi=sc.nextLine();
System.out.println("enter student number");
sno=sc.nextInt();
}
public void getattendence()
{
System.out.println("enter student attendence: ");
attendence=sc.nextInt();
}
public void calAttendence()
{
System.out.println("student number: "+sno);
System.out.println("student name: "+sname);
System.out.println("class is: "+classi);
System.out.println("student attendence: "+attendence);
}
void eligible()
{
if(attendence>75)
{
System.out.println("the student is eligible");
}
else
{
System.out.println("the student is not eligible");
}
}
}
public class week6ii
{
	public static void main(String[] args)
	{
		Exam e = new Exam();
		e.getValue();
		e.getattendence();
		e.calAttendence();
		e.eligible();

		
	}
}	