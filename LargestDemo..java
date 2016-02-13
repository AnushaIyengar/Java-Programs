import java.util.*;
class Largest
{
int a,b,c;
void accept()
{
Scanner s=new Scanner(System.in);
System.out.println("enter three numbers");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
}
void cal()
{
if(a>b)
{
if(b>c)
System.out.println("a is largest" +a);
else if(c>a)
System.out.println("c is largest" +c);
}
else
{
if(b<c)
System.out.println("c is large" +c);
else
System.out.println("b is large" +b);
}
}
}
class Largestdemo
{
public static void main(String args[])
{
Largest l=new Largest();
l.accept();
l.cal();
}
}