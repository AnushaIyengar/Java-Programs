import java.util.*;
class Employee
{
String name;
int salary;
int annual_salary;
void accept()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the name");
name=s.nextLine();
System.out.println("enter the salary");
salary=s.nextInt();
annual_salary=salary*12;
}
void print()
{
System.out.println(name);
System.out.println(salary);
System.out.println(annual_salary);
}
}
class EmployeeDemo
{
public static void main(String args[])
{
Employee e=new Employee();
e.accept();
e.print();
}
}