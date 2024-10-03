class Exp17_2
{
  String language;
  Exp17_2()
  {
    System.out	.println("This is default constructor");
    this.language="JAVA";
  }
    Exp17_2(String language)
    {
      System.out.println("This is parameterized constructor");
      this.language=language;
    }
   void getName()
   {
     System.out.println(this.language+ " programming language");
   }
    public static void main(String args[])
    {
      Exp17_2 obj1=new Exp17_2();
      Exp17_2 obj2=new Exp17_2("Extension of C++");
      obj1.getName();
      obj2.getName();
     }
   }
 
