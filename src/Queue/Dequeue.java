package Queue;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Dequeue {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(3);// add element at first index
        deque.addFirst(5);
        deque.addFirst(4);
        deque.addLast(12);// add element at last index
        deque.addLast(45);
        System.out.println(deque);

        System.out.println( deque.getFirst());
        System.out.println( deque.getLast());
        deque.clear();// empty the queue
        System.out.println(deque.peek());// return null if queue is empty
    }
}
