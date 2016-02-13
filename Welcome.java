class Welcome
{
int a;
}
class WelcomeDemo
{
public static void main(String args[])
{
Welcome w1=new Welcome();
 w1.a=40;
Welcome w2=new Welcome();
w2.a=80;
System.out.println(w1.a);

System.out.println(w2.a);
}
}