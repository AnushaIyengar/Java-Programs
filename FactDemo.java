import java.util.*;
class Fact
{
int n,fact=1;
void accept()
{
System.out.println("enter the num");
Scanner s1=new Scanner(System.in);
n=s1.nextInt();
}
void cal()
{
do
{
fact=fact*n;
//n=n-1;
}while(n>=1);
System.out.println("fact of" +n+ "is" +fact);
}
}
class FactDemo
{
public static void main(String args[])
{
Fact f=new Fact();
f.accept();
f.cal();
}
}