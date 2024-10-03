import java.util.*;
class Exp2
{
   public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter 'a' value:");
      double a=sc.nextDouble();
      System.out.println("Enter 'b' value:");
      double b=sc.nextDouble();
      System.out.println("Enter 'c' value:");
      double c=sc.nextDouble();
      double d=b*b-4*a*c;
      if(d>0.0)
      {
        double r1=(-b+Math.pow(d,0.5))/(2.0*a);
        double r2=(-b-Math.pow(d,0.5))/(2.0*a);

         System.out.println("The roots are distnict");
       }
      else if(d==0.0)
      {
        double r1=-b/(2.0*a);
        System.out.println("The roots are equal");
      }
      else
      {
        System.out.println("The roots are imaginary");
      }
   }
}
      