package Set;
import java.util.HashSet;
import java.util.Set;
public class HashSett {
    public static void main(String[] args) {
        Set<Integer> hash =new HashSet<>();
        hash.add(10);// add element
        hash.add(10);// don't allow duplicate value
        hash.add(30);
        hash.add(15);
        System.out.println(hash);
        System.out.println(hash.hashCode());// address of int hashset's element

    }
}
