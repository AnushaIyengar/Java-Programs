class ScopeExample
{
private int i;
public void FirstMethod()
{
int i=4,j=5;
this.i=i+j;
System.out.println(i);
System.out.println(this.i);
System.out.println(j);
SecondMethod(7);
}
public void SecondMethod(int i)
{
int j=8; 
this.i=i+j;
System.out.println(i);
System.out.println(this.i);
System.out.println(j);
}
}
public class TestScoping
{
public static void main(String args[])
{
ScopeExample e=new ScopeExample();
e.FirstMethod();
}
}