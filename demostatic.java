import java.util.*;
class demostatic{
static int a;
static int b;
static void meth(int x){
System.out.println("x= "+x);
System.out.println("a= "+a);
System.out.println("b= "+b);
}
static{
Scanner s = new Scanner(System.in);
System.out.println("enter a value:");
a=s.nextInt();
b=a*10;
}
public static void main(String[]args){
Scanner s = new Scanner(System.in);
System.out.println("Enter x value: ");
int x=s.nextInt();
meth(x);
}
}


