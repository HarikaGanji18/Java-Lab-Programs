interface shape
{
  void area();
}
class Rectangle implements shape
{
  public void area()
  {
    System.out.println("Area of rectangle is l*b");
  }
}
class Circle implements shape
{
  public void area()
  {
    System.out.println("Area of circle is PIr²");
  }
}
class Square implements shape
{
  public void area()
  {
    System.out.println("Area of square is side*side");
  }
}
class Exp20_2
{
  public static void main(String args[])
  {
    Rectangle r=new Rectangle();
    r.area();
   Circle c=new Circle();
    c.area();
    Square s=new Square();
    s.area();
    }
}
   
     