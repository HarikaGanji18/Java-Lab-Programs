import java.lang.*;
class FinalMethod
{
   final void display()
   {
     System.out.println("this is final method");
   }
}
class Method extends FinalMethod
{
  void display()
  {
    System.out.println("This is sub class method");
  }
}
 class Exp21_2
 {
   public static void main(String ar[])
   {
     Method m1=new Method();
     m1.display();
   }
}