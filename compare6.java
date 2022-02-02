import java.util.Scanner;
class compare6
{
public static void main(String[] args)
{
 String s;
 Scanner sc=new Scanner(System.in);  
 System.out.println("enter string");
 s=sc.nextLine();
 StringBuffer p=new StringBuffer(s);    
 for(int i=0;i<s.length();i++)
{
 if(Character.isLowerCase(s.charAt(i)))
{
 p.setCharAt(i, Character.toUpperCase(s.charAt(i)));    
}
else if(Character.isUpperCase(s.charAt(i)))
{
 p.setCharAt(i,Character.toLowerCase(s.charAt(i)));
}
}
System.out.println(p);
}
}