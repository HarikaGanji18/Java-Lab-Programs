class Exp26
{
   public static void main(String args[])
   {
     try
     {
       int x[]=new int[-7];
       System.out.println("first element : "+x[0]);
      }
     catch(NegativeArraySizeException e)
     {
       System.out.println("it is generated an exception :"+e);
       System.out.println("You can't initiate the values into the negative array");
     }
      finally
      {
        System.out.println("After the execution of try block");
      }
    }
}
       