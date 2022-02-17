package p1;
public class exp{
public int pvar=10;
private int privar=20;
int dvar=30;
protected int provar=40;
private void private_print()
{
System.out.println("this is a private class");
System.out.println("all variables are accesable");
System.out.println(pvar+privar+dvar+provar);
}
public void public_print()
{
System.out.println("this is a public class");
System.out.println("all variables are accesable");
}
protected void protected_print()
{
System.out.println("this is a protected class");
System.out.println(pvar+privar+dvar+provar);
}
void default_print()
{
System.out.println("this is a default class");
System.out.println(pvar+privar+dvar+provar);
}
public static void main(String[]args)
{
exp h = new exp();
h.private_print();
}
}
/*
javac -d . week8ii.java
java p2.week8ii
javac -d . exp.java
java p1.exp
*/
