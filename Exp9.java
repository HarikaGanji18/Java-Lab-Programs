import java.util.Scanner;
class Exp9
{
  public static void main(String[] args)
{
  Scanner s=new Scanner(System.in);
  System.out.println("Insertion sort");
  System.out.println("Enter the size of elements:");
  int size=s.nextInt();
  int a[]=new int[size];
  System.out.println("Enter" +size+ "elements:");
  int i=0;
  while(i<size)
  {
    a[i]=s.nextInt();
    i=i+1;
     }
    for(i=1;i<size;i++)
   {
     int key=a[i];
     int j=i-1;
while(j>0&&a[j]>key)
{
  a[j+1]=a[j];
  j--;
}
a[j+1]=key;
}
   System.out.println("After sorting");
    for(i=0;i<size;i++)
    {
      System.out.println(a[i]);
    }
  }
}
    
    
  