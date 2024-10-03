import java.lang.*;
class Exp18_1
{
  void display(int x)
   {
     System.out.println("Display method");
     x=x+100;
    }
   public static void main(String args[])
   {
     Exp18_1 obj=new Exp18_1();
      int a=200;
     System.out.println("Before passing value to a "+a);
     obj.display(a);
     System.out.println("After passing value to a "+a);
    }
  }