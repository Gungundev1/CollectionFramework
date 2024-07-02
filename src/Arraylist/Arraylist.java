package Arraylist;
import java.util.ArrayList;


public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Gungun");
        names.add("Khushi");
        System.out.println(names);
        ArrayList<Integer> age = new ArrayList<>();
        age.add(18);
        age.add(16);
        System.out.println(age);
        age.set(1,15);
        System.out.println(age);
        names.remove(0);
        System.out.println(names);
        names.add("tanisha");
        System.out.println(names);
//        names.clear();

        System.out.println(names.size());
    }

}
