import java.util.Comparator;
import java.util.TreeSet;
public class TreeSetDemo3
{ 
  public static void main(String ar[])
  {
    TreeSet t=new TreeSet();
     t.add(100);
     t.add(376);
     t.add(287);
     t.add(378);
     t.add(879);
     t.add(642);
     t.add(117);
     System.out.println(t.first());
     System.out.println(t.last());
     System.out.println(t.headSet(378));
     System.out.println(t.tailSet(378));
     System.out.println(t.subSet(287,642));
     System.out.println(t);
  

      System.out.println(t.lower(378));
      System.out.println(t.higher(879));
      System.out.println(t.floor(642));
      System.out.println(t.ceiling(378));
      System.out.println(t.pollFirst());
      System.out.println(t.pollLast());
      System.out.println(t.descendingSet());
      System.out.println(t);  
   }
}