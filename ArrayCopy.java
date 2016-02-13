class ArrayCopy
{
public static void main(String args[])
{
int []myArray={1,2,3,4,5};
int []hold={10,9,8,7,6,5,4,3,2,1};
System.out.println("hold array before copying");
for(int i:hold)
{
System.out.println(i);
}
System.arraycopy(myArray,0,hold,0,5);
System.out.println("hold array after copying");
for(int i:hold)
System.out.println(i);
}
}