class week9{
public static void def(int index) throws Exception{
if(index<0)
{
 throw new Exception("NegativeArraySizeException");
}
else
{
System.out.println(index);
}
}
public static void main(String[] args)
{
int[] a = new int[5];
try{
 def(-3);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
/*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
java.lang.Exception: NegativeArraySizeException
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
