 class Exp16_1
{
  int div(int a,int b)
  {
    return(a/b);
  }
  int div(int x,int y,int z)
  {
    return((x+y)/z);
  }
public static void main(String args[])
{
  Exp16_1 obj=new Exp16_1();
  System.out.println("1st div method:"+obj.div(378,256));
  System.out.println("2nd div method:"+obj.div(20,14,3));
}
}