class baseClass
{
  void disp()
  {
    System.out.println("This is base class");
  }
}
class child1 extends baseClass
{
   int x=3256;
   int y=2638;
   int sum;
   void add()
   {
     System.out.println("x="+x);
     System.out.println("y="+y);
     sum=x+y;
     System.out.println("sum of x and y are:"+sum);
   }
}
class child2 extends child1
{
   int a=33;
   int b=21;
   int ans;
   void mul()
   {
     System.out.println("a="+a);
     System.out.println("b="+b);
     ans=a*b;
     System.out.println("product of a and b are:"+ans);
   }
}
 class Exp15
{
  public static void main(String args[])
  {
    child2 ob=new child2();
    ob.disp();
    ob.add();
    ob.mul();
  }
}