import java.util.*;
class Exp6
{
static String name;
static String sub="Java";
static int pin_num;
static void college()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name:");
name=sc.next();
System.out.println("Enter the pin number:");
pin_num=sc.nextInt();
System.out.println("This is static method");
System.out.println("My name is: "+name);
System.out.println("My pin number is:"+pin_num);
System.out.println("I'm practicing"+sub+"programming");
}
static
{
System.out.println("This is Static block");
}
public static void main(String[] args)
{
System.out.println("This is main() method");
Exp6.college();
Exp6.sub="C";
Exp6.college();
}
}

