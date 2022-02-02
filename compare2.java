import java.util.Scanner;
class compare2
{
public static void main(String[] args)
{
 String s;
 int i;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter string");
 s=sc.nextLine();
 System.out.println("string length"+s.length());
 System.out.println("enter index");
 i=sc.nextInt();
 System.out.println("character at the given index"+s.charAt(i));
 System.out.println("character at prefix"+s.charAt(0));
 System.out.println("character at suffix"+s.charAt(s.length()-1));
}
}
