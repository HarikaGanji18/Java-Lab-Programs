//program to demonstrate constructor using super keyword
import java.lang.*;
class superOne
{ 
  int x;
  superOne(int a)
  {
    System.out.println("This is super class");
    x=a;
  }
 }
class sub extends superOne
{
  int y;
  sub(int a,int b)
  {
    super(a);
    y=b;
  }
  void display()
  {
    System.out.println("sum of x and y: "+(x+y));
  }
 }
 class Exp19_1
 {
    public static void main(String args[])
    {
      sub s1=new sub(20,75);
      s1.display();
    }
  }
