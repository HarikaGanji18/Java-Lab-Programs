import java.util.*;
class QueueDemo
{
  public static void main(String ar[])
  {
    Queue q=new LinkedList();
	q.offer(37);
	q.offer(26);
	q.offer(18);
	q.offer(49);
	System.out.println(q);
        q.poll();
        System.out.println(q);
        q.peek();
        System.out.println(q);
        q.remove(18);
        System.out.println(q);
   }
   }