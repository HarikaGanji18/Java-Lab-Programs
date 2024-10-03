import java.util.Scanner;
class Exp25
{
  public static void main(String args[])
  {
    int a=0,b=10,c;
    try
    {
      c=b/a;
      System.out.println("c : "+c);
     }
     catch(ArithmeticException e)
     {
       System.out.println(e);
       System.out.println("Rest of the code is executed");
     }
     finally
     {
       System.out.println("This block will be executed mandatorily");
     }
   }
}