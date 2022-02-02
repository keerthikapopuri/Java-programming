import java.util.*;
import java.lang.String;
public class Ex3{
  public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        char[] a=new char[s1.length()];
        for(int i=0;i<s1.length();i++)
            { 
                a[i]=s1.charAt(i);
            }
         System.out.println("array is");
         for(int i=0;i<s1.length();i++)
            { 
                System.out.println(a[i]);
            }
         //locate character in string
         char c=sc.next().charAt(0);
          for(int i=0;i<s1.length();i++)
            { 
                if(a[i]==c)
                    {
                       System.out.println("chracter is loacated at "+(i+1)+" position");
                    }
                 else{
                         System.out.println("not present");


            }
}
      //to locate substring in string
System.out.println("enter substring"); 
String s2=sc.next();
int k=s1.indexOf(s2);
System.out.println(k+1);

//to extract part of string
System.out.println("enter start of substring");
int n=sc.nextInt();
System.out.println("enter no of characters"); 
int z=sc.nextInt(); 
String s=s1.substring(n,z+1);
System.out.println("substring is "+s); 
     
}
}
