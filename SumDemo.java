import java.util.*;
class Sum
{
int osum,esum,n;
void accept()
{
System.out.println("enter the numbers");
Scanner s1=new Scanner(System.in);
for(int i=0;i<10;i++)
{
n=s1.nextInt();
if((n%2)==0)
esum=esum+n;
else
osum=osum+n;
}
System.out.println("sum of even numbers=" +esum);
System.out.println("sum of odd numbers=" +osum);
}
}
class SumDemo
{
public static void main(String args[])
{
Sum s=new Sum();
s.accept();
}
}