import java.util.*;
class Swapping
{
int a,b;
void swap(int a, int b)
{
this.a=a;
this.b=b;
int temp;
temp=this.a;
this.a=this.b;
this.b=temp;
}
void display()
{
System.out.println("a="+a);
System.out.println("b="+b);
}
}
class SwappingDemo
{
public static void main(String args[])
{
int p,q;
Scanner s1=new Scanner(System.in);
System.out.println("enter the two numbers");
p=s1.nextInt();
q=s1.nextInt();
System.out.println("Before swapping");
System.out.println("a="+p+ "b=" +q);
System.out.println("After swapping");
Swapping s2=new Swapping();
s2.swap(p,q);
s2.display();
}
}
