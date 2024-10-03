import java.util.*;
class Exp13
{
  public static void main(String args[])
  {
    int a[][]=new int[3][3];
    int b[][]=new int[3][3];
    int c[][]=new int[3][3];
    Scanner s=new Scanner(System.in);
    System.out.println("Enter A matrix:");
    for(int i=0;i<3;i++)
    {
      for(int j=0;j<3;j++)
      {
        a[i][j]=s.nextInt();
       }
      }
     System.out.println("Enter B matrix:");
    for(int i=0;i<3;i++)
    {
      for(int j=0;j<3;j++)
      {
        b[i][j]=s.nextInt();
       }
      }
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {
          c[i][j]=0;
          for(int k=0;k<3;k++)
          {
             c[i][j]=c[i][j]+a[i][k]*b[k][j];
           }
        }
     }
     System.out.println("Result of multiplication matrix:");
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {
          System.out.println(c[i][j]+ " \t ");
         }
           System.out.println("\n");
       }
     }
   }
    