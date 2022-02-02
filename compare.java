import java.util.Scanner;
class compare
{
public static void main(String[] args)
{
 String s1,s2;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter string 1");
 s1=sc.nextLine();
 System.out.println("enter string 2");
 s2=sc.nextLine();
 if(s1.equals(s2))
 {
  System.out.println("two strings are equal");
 }
 else
 {
  System.out.println("two strings are not equal");
 }
 if(s1.equalsIgnoreCase(s2))
 {
  System.out.println("two strings are equal without considering case");
 }
 else
 {
  System.out.println("two strings are not equal without considering case");
 }
 
}
}