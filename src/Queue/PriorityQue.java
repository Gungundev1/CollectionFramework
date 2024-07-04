package Queue;
import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQue {
    public static void main(String[] args) {
       Queue<Integer> Que= new PriorityQueue<>() ;
       Que.add(11);// Add element, it's from collection
       Que.add(15);
       Que.add(16);
       Que.add(23);
        System.out.println(Que);
       Que.offer(3);// add element, it's from Queue
       Que.offer(8);
        System.out.println(Que);
        System.out.println(Que.element());// return the head of the queue,if the list is empty element() throws a NoSuchElementException
        System.out.println(  Que.peek());// return the head of queue,If the queue is empty the peek() method returns null.
        System.out.println(Que.poll());// return head of queue by removing itself
        System.out.println(Que);
        Que.remove(15);// remove element
        System.out.println();

    }
}
