class Over
{
Over()
{
System.out.println("constructor");
}
Over(int p)
{
System.out.println("parameterized constructor");
System.out.println(p);
}
Over(float a,int b)
{
System.out.println("different parameters");
System.out.println(a +b);
}
public static void main(String args[])
{
Over o1=new Over();
Over o2=new Over(4);
Over o3=new Over(2.2f,3);
}
}