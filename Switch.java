import java.util.*;
class Switch
{
public static void main(String args[])
{
int l,b,r,ch;
float area;
System.out.println("menu\n 1.circle\n 2.rectangle\n enter the choice");
Scanner s1=new Scanner(System.in);
ch=s1.nextInt();
switch(ch)
{
default: 
System.out.println("invalid");
case 1: 
System.out.println("enter the radius");
r=s1.nextInt();
area=(22/7.0f)*r*r;
System.out.println(area);
//break;
case 2: 
System.out.println("enter the length and breadth");
l=s1.nextInt();
b=s1.nextInt();
area=l*b;
System.out.println(area);
//break;
}
}
}