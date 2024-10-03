import java.util.*;
class Exp12
{
  public static void main(String args[])
  {
    int row,col;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no. of rows:");
    row=sc.nextInt();
    System.out.println("Enter the no.of columns:");
    col=sc.nextInt();
    int a[][]=new int[row][col];
    int b[][]=new int[row][col];
    int c[][]=new int[row][col];
   
    System.out.println("Enter the elements for matrix A");
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        a[i][j]=sc.nextInt();
      }
    }
    System.out.println("Enter the elements for matrix B");
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        b[i][j]=sc.nextInt();
      }
    }
       System.out.println("Sum of matrix A and matrix B");
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
       c[i][j]=a[i][j]+b[i][j];
      }
    }
    System.out.println("Addition of two matrices:");
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        System.out.println(c[i][j]+ " \t \t");
      }
        System.out.println("\n");
    }
  }
}
  
      