package mypack;
import java.util.Scanner;
public class calculate
{
  Scanner sc=new Scanner(System.in);
  public void area()
  {
  double r,a;
  System.out.println("Enter the radius of the circle");
  r=sc.nextDouble();
  a=Math.PI*r*r;
  System.out.println("calculate the radius of the circle: "+a);
  }
}