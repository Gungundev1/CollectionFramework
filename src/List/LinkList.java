package List;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkList{
    public static void main(String[] args) {
        LinkedList<Integer> LL=new LinkedList<>();
        LL.add(10);// to add element
        LL.add(20);
        LL.add(30);
        LL.add(40);
        LL.add(50);
        System.out.println(LL);
        System.out.println(LL.get(3));// to get element at particular index
        LL.set(2,25);
        System.out.println(LL);// to set value at particular index
        LL.remove(3);
        System.out.println(LL);
        System.out.println(   LL.contains(25));// check if value is present or not

//        LL.clear();// empty the list
        LinkedList<String> Ls=new LinkedList<>();
//        Ls.add("Gungun");
        Ls.add("Tanisha");
        System.out.println( Ls.indexOf("Ta"));

        System.out.println(Ls.lastIndexOf("ha"));
        Iterator<Integer> it =LL.iterator();//traverse the list
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
