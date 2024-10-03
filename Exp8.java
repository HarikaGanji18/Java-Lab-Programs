import java.util.Scanner;
class Exp8
{
  public static void main(String[] args)
  {
    int size,key,first=0,last=6,found=0;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the size of the List");
    size=s.nextInt();
    int a[]=new int[size];
    System.out.println("Enter the sorted elements:");
    for(int i=0;i<size;i++)
     {
        a[i]=s.nextInt();
     }
      System.out.println("Enter KEY element:");
      key=s.nextInt();
      while(first<=last)
      {
        int mid=(last+first)/2;
        if (a[mid]==key)
         {
           System.out.println("The element is found at "+mid+" index");
           found=1;
           break;
         }
         else if(a[mid]>key)
         {
          last=mid-1;
          System.out.println("Element found");
         }
         else if(a[mid]<key)
         {
           first=mid+1;
           System.out.println("Element was found");
          }
          else
          {
           System.out.println("Element was not found in the list");
           }
       }
   } 
}
