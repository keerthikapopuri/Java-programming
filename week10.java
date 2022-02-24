import java.util.Random;
class Thread2 extends week10
{
public void run()
{
if(n%2==0)
{
System.out.println("number is even so printing square.. the number is: "+this.n);
System.out.println(n*n);
}
}
}
class Thread3 extends week10
{
public void run()
{
if(n%2!=0)
{
System.out.println("number is odd so printing cube.. the number is"+this.n);
System.out.println("the cube is: "+n*n*n);
}
}
}
class week10 extends Thread{
static int n;
public void run()
{
Random rand = new Random();
n = rand.nextInt(10+1);
System.out.println("the number is: "+n);
}
public static void main(String[]args)
{
try{
week10 t1 = new week10();
t1.start();
Thread.sleep(1000);
t1.join();
Thread t2 = new Thread2();
t2.start();
t2.join();
Thread t3 = new Thread3();
t3.start();
t3.join();
}
catch (Exception e)
{
System.out.println("exception");
}
}
}
