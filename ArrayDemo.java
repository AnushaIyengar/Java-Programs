import java.util.*;
class Array
{
void print()
{
System.out.println("output is");
for(int i:b)
{
System.out.println(i);
}
}
}
class ArrayDemo
{
public static void main(String args[])
{
int a[]=new int[5];
Scanner s1=new Scanner(System.in);
System.out.println("enter the numbers");
for(int i=0;i<5;i++)
{
a[i]=s1.nextInt();
}
Array a1=new Array();
a1.print();
}
}
