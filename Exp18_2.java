import java.lang.*;
class Exp18_2
{
   int x=100;
   void display(Exp18_2 e)
   {
     e.x=e.x+390;
    }
   public static void main(String args[])
   {
     Exp18_2 obj=new Exp18_2();
     System.out.println("Before passing x value: "+obj.x);
     obj.display(obj);
     System.out.println("After passsing x value: "+obj.x);
    }
  }