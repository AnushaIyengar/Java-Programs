import java.util.*;
class Ifelse
{
int m1,m2;
void accept()
{
Scanner s1=new Scanner(System.in);
System.out.println("enter two numbers");
m1=s1.nextInt();
m2=s1.nextInt();
}
void calculate()
{
if(m1==m2)
System.out.println("equal");
else if(m1>m2)
System.out.println("m1 is large" +m1);
else
System.out.println("m2 is large" +m2);
}
}
class IfelseDemo
{
public static void main(String args[])
{
Ifelse i=new Ifelse();
i.accept();
i.calculate();
}
}