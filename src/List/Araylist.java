package List;
import java.util.ArrayList;


public class Araylist {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Gungun");
        names.add("Khushi");
        System.out.println(names);
        ArrayList<Integer> age = new ArrayList<>();
        age.add(18);// add element
        age.add(16);
        System.out.println(age);
        age.set(1,15);// update a value at the particular index
        System.out.println(age);
        names.remove(0);// remove a element at a particular index
        System.out.println(names);
        names.add("tanisha");

        System.out.println(names);
//        names.clear();// empty the namelist
        System.out.println(age.contains(16)); // check if value present or not
        System.out.println(names.size());// no. of element
    }

}
