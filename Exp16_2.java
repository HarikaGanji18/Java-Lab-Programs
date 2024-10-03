class FavCricketer
{
  void display()
  {
    System.out.println("Jadeja was my fav cricketer");
  }
}
class Myfav extends FavCricketer
{
  void display()
  {
    System.out.println("M.s Dhoni was my fav one");
  }
}
class Exp16_2
{
  public static void main(String args[])
  {
    Myfav d=new Myfav();
    d.display();
  }
}