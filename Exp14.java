class base
{
  void display()
  {
    System.out.println("Object oriented programming through JAVA");
   }
}
class child extends base
 {
   int x=360;
   int y=340;
   int sum;
   void add()
   {
     System.out.println("x="+x);
     System.out.println("y="+y);
     sum=x+y;
     System.out.println("sum of x and y are:"+sum);
   }
}
class Exp14
{
  public static void main(String args[])
   {
     child obj=new child();
     obj.display();
     obj.add();
   }
}