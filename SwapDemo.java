import java.util.*;
class Swap
{
int a,b,temp;
void accept()
{
Scanner s1=new Scanner(System.in);
System.out.println("first number");
a=s1.nextInt();
System.out.println("second number");
b=s1.nextInt();
System.out.println("before swapping");
System.out.println("first number" +a+ "second number" +b);
}
void swap1()
{
temp=a;
a=b;
b=temp;
}
}
class SwapDemo
{
public static void main(String args[])
{
Swap s2=new Swap();
s2.accept();
s2.swap1();
System.out.println("after swapping");
System.out.println(s2.a);
System.out.println(s2.b);
}
}