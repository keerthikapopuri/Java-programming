import java.util.Scanner;
class compare1
{
public static void main(String[] args)
{
 String s;
 char c;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter string");
 s=sc.nextLine();
 System.out.println("enter character");
 c = sc.next().charAt(0);
 if(s.charAt(0)==c)
 {
  System.out.println("given string starts with given character");
 }
 else
 {
  System.out.println("given string doesnot starts with given character");
 }
}
}