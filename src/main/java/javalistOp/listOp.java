package javalistOp;
import java.util.*;

public class listOp {
    public static void main(String[] args) {
        //add All
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(3);
        l2.add(4);
        l1.addAll(1, l2);
        System.out.println("elements: ");
        for(int i = 0; i < l1.size(); i++){
            System.out.println("number is " + l1.get(i));
        }
        System.out.println();
        //List iterator
        ListIterator<Integer> litr = l1.listIterator();
        System.out.println("Traversing the list in forward direction:");
        while(litr.hasNext()){
            System.out.println(litr.next());
        }
        System.out.println("\nTraversing the list in backward direction:");
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }

    }
}
