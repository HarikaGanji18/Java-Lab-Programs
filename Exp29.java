class Exp29
{
 public static void main(String ar[])throws InterruptedException
  {
     doStuff();
  }
  public static void doStuff()throws InterruptedException
  {
    doMoreStuff();
  }
  public static void doMoreStuff()throws InterruptedException
  {
    Thread.sleep(2000);
     System.out.println("Throws is a checked Exception");
   }
} 
