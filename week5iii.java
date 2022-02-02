final class Bike{  
 final int speedlimit=90;//final variable  
 public final void run(){  
  //throws a error speedlimit=400;
 System.out.println("speedlimit is final variable:"+speedlimit);  
 }  
}
class enfield extends Bike
{
/*
public void run()
{
   int limit = 400;
\\ final method 
}
*/
void printl()
{
System.out.println("its a final class demonstration");
}
}
class week5iii
{
 public static void main(String args[])
{  
 Bike obj=new  Bike();  
 obj.run();  
 enfield b = new enfield();
 System.out.println("it contained a error with final method");
 b.printl();
 }  
}