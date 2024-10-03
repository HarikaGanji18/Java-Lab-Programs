import java.util.Comparator;
import java.util.TreeSet;
public class TreeSetDemo
{ 
  public static void main(String ar[])
  {
    TreeSet t=new TreeSet(new MyComparator1());
     t.add(0);
     t.add(39);
     t.add(26);
     t.add(37);
     t.add(82);
     t.add(64);
     System.out.println(t);
   }
}
class MyComparator1 implements Comparator
{
  public int compare(Object obj1,Object obj2)
  {
    Integer i1=(Integer)obj1;
    Integer i2=(Integer)obj2;
    if(i1<i2)
     return +1;
    else if(i1>i2)
     return -1;
    else
     return 0;
   }
}
      