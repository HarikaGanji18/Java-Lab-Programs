import java.util.Scanner;
class Exp7
{
 public static void main(String args[])
  {
    int n,size,found=0;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the size of the list:");
    size=s.nextInt();
    int a[]=new int[size];
    System.out.println("Enter the " +size+ " elements:");
    for(int i=0;i<size;i++)
     {
       a[i]=s.nextInt();
     }
      System.out.println("Enter the search element:");
      n=s.nextInt();
      for(int i=0;i<size;i++)
       {
          if(a[i]==n)
          {
            System.out.println("Required element was found at  " +i+ " position");
            found=1;
            break;
          }
      }
         if(found==0)
         {
           System.out.println("Element was not found");
         }
    }
}