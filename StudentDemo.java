import java.util.*;
class Student
{
String name;
int marks;
float per;
void accept()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the name");
name=s.nextLine();
System.out.println("enter the marks");
marks=s.nextInt();
System.out.println("enter the percentage");
per=s.nextFloat();
}
void display()
{
System.out.println("student details:");
System.out.println("name:"+name);
System.out.println("marks:"+marks);
System.out.println("percentage:"+per);
}
}
class StudentDemo
{
public static void main(String args[])
{
Student s1=new Student();
s1.accept();
s1.display();
}
}
