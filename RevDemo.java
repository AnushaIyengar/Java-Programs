import java.util.*;
class Rev
{
int rem,rev,n,d;
void accept()
{
System.out.println("enter the num");
Scanner s1=new Scanner(System.in);
n=s1.nextInt();
}
void cal()
{
while(n>0)
{
rem=n%10;
rev=rev*10+rem;
n=n/10;
}
System.out.println("rev num is" +rev);
}
}
class RevDemo
{
public static void main(String args[])
{
Rev r=new Rev();
r.accept();
r.cal();
}
}