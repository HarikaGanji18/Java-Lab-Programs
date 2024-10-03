class Exp17_1
{
  void multiply(int l,int b)
  {
    System.out.println("Result of l and b is:"+(l*b));
  }
  void multiply(int l,int b,int h)
  {
    System.out.println("Result of l,b and h is:"+(l*b*h));
  }
public static void main(String args[])
{
  Exp17_1 obj=new Exp17_1();
  obj.multiply(9,14);
  obj.multiply(10,4,3);
}
}