import java.util.Scanner;
class week7
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s;
String s1="hello";
String s2="hi";
System.out.println("enter string");
s=sc.nextLine();
System.out.println("string methods");
System.out.println("==============");
System.out.println("string length:"+s.length());
System.out.println("char at pos 3:"+s.charAt(2));
System.out.println("string after 3rd postition:"+s.substring(2));
System.out.println("string to upper case:"+s.toUpperCase());
System.out.println("string to lower case:"+s.toLowerCase());
System.out.println("comparing s1 and s2:"+s1.compareTo(s2));
System.out.println("string concate:"+s.concat("good girl"));
System.out.println("is string empty?"+s.isEmpty());
System.out.println("without trim:"+(s+"good girl"));
System.out.println("with trim:"+s.trim()+"good girl");
System.out.println("replacing s with t:"+s.replace('s','t'));
StringBuffer a=new StringBuffer(s);
System.out.println("stringbuffer methods");
System.out.println("==============");
System.out.println("stringbuffer append:"+a.append("good girl"));
System.out.println("inserting a string at 2nd position:"+a.insert(1,"java"));
System.out.println("stringbuffer append:"+a.replace(1,3,"java"));
System.out.println("stringbuffer deletion:"+a.delete(1,3));
System.out.println("stringbuffer reverse:"+a.reverse());
}
}
/*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
enter string
keerthika
string methods
==============
string length:9
char at pos 3:e
string after 3rd postition:erthika
string to upper case:KEERTHIKA
string to lower case:keerthika
comparing s1 and s2:-4
string concate:keerthikagood girl
is string empty?false
without trim:keerthikagood girl
with trim:keerthikagood girl
replacing s with t:keerthika
stringbuffer methods
==============
stringbuffer append:keerthikagood girl
inserting a string at 2nd position:kjavaeerthikagood girl
stringbuffer append:kjavavaeerthikagood girl
stringbuffer deletion:kvavaeerthikagood girl
stringbuffer reverse:lrig doogakihtreeavavk
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
