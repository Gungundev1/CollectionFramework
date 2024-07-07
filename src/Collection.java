import java.util.Iterator;
import java.util.Vector;

public interface Collection {
    public static void main(String[] args) {
        // Creating a vector
        Vector<Integer> v1 = new Vector<>();
        Vector<Integer> v2=new Vector<>();
         // add elements
        v1.add(10);
        v1.add(20);
        v1.add(2,45);
        v1.add(3,34);
        System.out.println(v1);
        v2.add(21);
        v2.add(32);
        v2.add(2,35);
        System.out.println(v2);
        v2.addAll(v1);
        System.out.println(v2);

        // access vector elements
        System.out.println( v1.get(2));
        System.out.println(v2.get(4));

        Iterator<Integer> it =v2.iterator();
        while (it.hasNext()){
            System.out.println("iterator:"+it.next());
        }

        // Remove vector elements
        v1.remove(2);
        System.out.println(v1);
        v2.removeElement(34);
        System.out.println(v2);
        v1.removeAllElements();
        System.out.println("v1 elements:"+ v1);
        v2.clear();
        System.out.println("v2 elements: "+ v2);



    }
}
