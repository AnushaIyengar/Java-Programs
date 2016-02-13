class Demo
{
final int a;
Demo()
{
a=40;
//a=50;
}
}
class FinalDemo
{
public static void main(String args[])
{
Demo d=new Demo();
System.out.println(d.a);
}
}
