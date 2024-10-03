import java.util.Scanner;
class Exp10
{
  public static void main(String args[])
  {
  int num;
  String temp;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the no. of strings: ");
  num=sc.nextInt();
  String names[]=new String[num];
   Scanner sc1=new Scanner(System.in);
  System.out.println("Enter all the strings:");
  for(int i=0;i<num;i++)
  {
    names[i]=sc.next();
  }
   for(int i=0;i<num;i++)
   {
     for(int j=i+1;j<num;j++)
     {
       if(names[i].compareTo(names[j])>0)
        {
          temp=names[i];
          names[i]=names[j];
          names[j]=temp;
        }
      }
    }
     for(String name:names)
     {
       System.out.println("sorted array:");
       System.out.println(name);
     }
   }
 }
 
  