package Queue;
import java.util.ArrayDeque;

public class ArrayDequee {
    public static void main(String[] args) {
        ArrayDeque<String> dq = new ArrayDeque<>();
        dq.add("Gungun");
        dq.add("Tanisha");
        System.out.println(dq);
        System.out.println(dq.size());
    }
}
