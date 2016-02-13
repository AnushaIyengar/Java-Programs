class Overload
{
float result;
void add()
{
int a=10, b=20;
result=a+b;
System.out.println("add function without parameter");
System.out.println(result);
}
void add(int a, int b)
{
result=a+b;
System.out.println("add using two parameters");
System.out.println(result);
}
void add(float m, int n)
{
result=m+n;
System.out.println("different parameters");
System.out.println(result);
}
public static void main(String args[])
{
Overload o=new Overload();
o.add();
o.add(10,20);
o.add(20.0f,10);
}
}