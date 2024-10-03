class InvalidAgeException extends Exception
{
  public InvalidAgeException(String str)
  {
     super(str);
  }
}
public class TestDemo
{
   static void validate(int age)throws  InvalidAgeException
   {
     if(age<18)
      {
         throw new  InvalidAgeException("you are not eligible to vote");
      }
       else
       {
         System.out.println("you can vote");
        }
     }
  public static void main(String ar[])
  {
    try
    {
      validate(13);
    }
     catch( InvalidAgeException e)
     {
       System.out.println("caught the Exception");
        System.out.println("Exception occured:" +e);
      }
       System.out.println("Rest of the code.....");
     }
}
 