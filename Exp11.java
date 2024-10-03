//program to demonstrate given string is palindrome or not
import java.util.Scanner;
class Exp11
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     String str,a,rev="";
     int l;
     System.out.println("Enter the String:");
     str=sc.next();
     l=str.length();
     for(int i=l-1;i>=0;i--)
     {
       rev=rev+str.charAt(i);
     }
     if(str.equals(rev))
      {
        System.out.println(str+ " is a palindrome");
      }
     else
      {
        System.out.println(str+ " is not a palindrome");
      }
    }
}