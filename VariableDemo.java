class VariableDemo
{
int a,b;
void add(int p,int q)
{
int c;
a=p;
b=q;
c=a+b;
System.out.println("sum is:" +c);
}
public static void main(String args[])
{
VariableDemo v1=new VariableDemo();
v1.add(20,20);
}
}