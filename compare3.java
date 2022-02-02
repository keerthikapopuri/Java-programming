import java.util.Scanner;
class compare3
{
public static void main(String[] args)
{
 String s,p="";
 int i,j;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter string");
 s=sc.nextLine();
 System.out.println("enter starting index");
 i=sc.nextInt();
 System.out.println("enter ending index");
 j=sc.nextInt();
 for(int k=i;k<=j;k++)
{
 p=p+s.charAt(k);
}
 System.out.println(p);
}
}