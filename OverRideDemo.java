class Employee
{
String name="john";
String getDetails()
{
return "name is="+name;
}
}
class Manager extends Employee
{
String dept="sales";
String getDetails()
{
return super.getDetails()+"department="+dept;
}
}
class OverRideDemo
{
public static void main(String args[])
{
Manager m=new Manager();
String result=m.getDetails();
System.out.println(result);
}
}