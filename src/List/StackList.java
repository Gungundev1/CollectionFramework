package List;
import java.util.Stack;
public class StackList {
    public static void main(String[] args) {
        Stack<Integer> s =new Stack<>();
        s.push(5);// Add element
        s.push(10);
        s.push(15);
        s.push(20);
        System.out.println(s);
        s.pop();// remove element at top
        System.out.println(s);
        System.out.println( s.peek());// return top element
        System.out.println(s.search(15)); // find value is or not
        System.out.println(s.isEmpty());// check if stack is empty or not


    }
}
