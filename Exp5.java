import java.util.*;
class Exp5
{
int a,b;
Exp5 dispValue()
{
  Scanner s=new Scanner(System.in);
  System.out.println("Enter 'a' value:");
  a=s.nextInt();
  System.out.println("Enter 'b' value");
  b=s.nextInt();
  this.a=a;
  this.b=b;
return this;
}
void display()
{
if(a>b)
{
System.out.println("a is larger than b");
}
else
{
System.out.println("b is larger number");
}
}
public static void main(String[] args)
{
Exp5 obj=new Exp5();
obj=obj.dispValue();
obj.display();
}
}
