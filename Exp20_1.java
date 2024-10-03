interface A
{
 int a=30; 
  void show();
}
interface B
{
  int a=20;
  void show();
}
class C implements A,B
{
   int c;
   public void show()
{
   c=A.a+B.a;
   System.out.println("a in A interface: " +A.a);
   System.out.println("a in B interface: " +B.a);
   System.out.println("c= " +c);
 }
}
class Exp20_1
{
   public static void main(String args[])
   {
     C obj=new C();
     obj.show();
    }
  }