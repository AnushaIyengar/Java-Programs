class Student
{
string name="John";
int marks=540;
float percentage=72.9f;
void display()
{
System.out.println("student details");
System.out.println("student name" +name);
System.out.println("student marks" +marks);
System.out.println("student percentage" +percentage);
}
}
class StudentDemo
{
public static void main(String args[])
{
Student s1=new Student();
s1.display();
}
}