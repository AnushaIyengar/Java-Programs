class Base
{
Base()
{
System.out.println("base class constructor");
}
}
class Derived extends Base
{
Derived()
{
System.out.println("derived class constructor");
}
}
class Inherit
{
public static void main(String args[])
{
Derived d=new Derived();
Base b=new Base();
}
}