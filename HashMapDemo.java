import java.util.*;
class HashMapDemo
{
  public static void main(String ar[])
  {
    HashMap<Integer,String> hm=new HashMap<Integer,String> ();
    hm.put (new Integer (10), "Sindhu");
    hm.put (new Integer (11),"Mani");
    hm.put (new Integer (12), "Veerendra");
    hm.put (new Integer (13),"Naveen");
    hm.put (new Integer (10), "Harika");
   hm.put (new Integer (14), "Akshay");
   System.out.println(hm);
   Set<Integer>set=new HashSet<Integer>();
   set=hm.keySet();
   System.out.println(set);
 }
}