//program to demonstrate super keyword
import java.lang.*;
class One
{
  void disp()
  {
    System.out.println("This is parent class");
  }
}
class Two extends One
{
  void disp()
  {
    super.disp();
    System.out.println("This is child class");
  }
}
  class Exp19_2
  {
    public static void main(String[] args)
    {
      Two obj=new Two();
       obj.disp();
    }
}
