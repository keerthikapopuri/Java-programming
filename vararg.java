class vararg{
static void varargs(String... a){
System.out.println("The length of arguments are: "+a.length);
for(String i:a){
System.out.println(i);
}
}
public static void main(String[]args){
varargs(args);
}
}

