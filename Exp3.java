import java.util.*;
class Exp3
{
  public static void main(String[] args)
{
 int a1=0,b2=1,c3;
Scanner s1=new Scanner(System.in);
System.out.println("Enter 'x' value to find Fibonacci number:");
int x=s1.nextInt();
if(x<0)
{
System.out.println("cannot found");
}
else if(x==0)
{
System.out.println("fibonacci of '0' is 0");
}
else if(x>0)
{
System.out.println("fibonacci series of "+x+" are:");
System.out.println(a1+" "+b2);
for(int i=2;i<x;i++)
{
 c3=a1+b2;
 System.out.println(" "+c3);
 a1=b2;
 b2=c3;
}
}
}
}