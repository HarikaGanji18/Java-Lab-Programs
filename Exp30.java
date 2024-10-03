class My implements Runnable
{
  public void run()
  {
    for(int i=0;i<5;i++)
    {
      try
      {
        Thread.sleep(500);
         System.out.println("This is run method in My class");
      }
      catch(Exception e)
      {
      
      }
   }
 }
}
class Mine implements Runnable
{
   public void run()
  {
    for(int j=6;j<=10;j++)
    {
      try
      {
        Thread.sleep(500);
         System.out.println("This is run method in Mine class");
      }
      catch(Exception e)
      {
      
      }
   }
 }
}
class Exp30
{
  public static void main(String ar[])
  {
    My obj1=new My();
    Thread t1=new Thread(obj1);
     t1.start();
    Mine obj2=new Mine();
    Thread t2=new Thread(obj2);
     t2.start();  
}
}