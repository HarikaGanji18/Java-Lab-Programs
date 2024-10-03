import java.util.Scanner;
class NegativeNumberException extends Exception
{
   String amt;
   NegativeNumberException(String amt)
   {
     this.amt=amt;
   }
public String toString()
{
   return amt;
 }
}
public class Exp28 
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Amount :");
  int a=sc.nextInt();
  try
  {
    if(a<0)
    {
      throw new NegativeNumberException("Invalid amount");
    }
    System.out.println("Amount deposited");
  }
catch(NegativeNumberException e)
{
  System.out.println(e);
}
}
}