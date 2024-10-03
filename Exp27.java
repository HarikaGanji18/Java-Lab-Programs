class Exp27_1
{
  public void display()
  {
    try
    {
      int a=0,b=25;
      System.out.println("Division of a and b :"+(b/a));
     }
    catch(ArithmeticException e)
    {
      System.out.println("Exception will be raised :"+e);
    }
  }
}
  class Exp27 extends Exp27_1
  {
    int x[]={10,20,30};
    public void display()
    {
       try
       {   
         x[4]=2;
       }
       catch(ArrayIndexOutOfBoundsException ai)
       {
         System.out.println("array size between 0-2 :"+ai);
       }
     }
  public static void main(String args[])
  {
    Exp27 obj=new Exp27();
    obj.display();
   }
}