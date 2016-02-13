import java.util.*;
class Example
{
String name;
int marks;
float per;
void accept()
{
Scanner s1=new Scanner(System.in);
System.out.println("enter name");
name=s1.nextLine();
System.out.println("enter marks");
marks=s1.nextInt();
System.out.println("enter percentage");
per=s1.nextFloat();
}
void cal()
{
if(per>70.0)
System.out.println("fcd");
else if(per>60.0 && per<70.0)
System.out.println("fc");
else if(per>35.0 && per<60.0)
System.out.println("sc");
else
System.out.println("fail");
}
}
class ExampleDemo
{
public static void main(String args[])
{
Example e1=new Example();
e1.accept();
System.out.println("passing class");
e1.cal();
}
}
