import java.util.*;
class thisusage{
int length,breadth;
public void get(int length,int breadth){
this.length=length;
this.breadth=breadth;
}
public int getarea(){
int area=length*breadth;
return area;
}
public int getperi(){
int peri=2*(length+breadth);
return peri;
}
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int length,breadth;
System.out.print("enter the length of rectangle: ");
length=s.nextInt();
System.out.print("enter the breadth of rectangle: ");
breadth=s.nextInt();
thisusage obj=new thisusage();
obj.get(length,breadth);
int area=obj.getarea();
System.out.println("The area of given rectangle is: "+area);
int peri=obj.getperi();
System.out.println("The perimeter of given rectangle is: "+peri);
}

}
