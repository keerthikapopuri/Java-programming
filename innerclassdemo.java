class outer_class{
int outer_x=5;
public void test()
{
inner_class i = new inner_class();
i.display();
}
class inner_class{
public void display(){
System.out.println("The outer_x is: "+outer_x);
}
}
}
class innerclassdemo{
public static void main(String[]args)
{
outer_class o = new outer_class();
o.test();
}
}
