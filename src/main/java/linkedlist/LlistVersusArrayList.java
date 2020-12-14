package linkedlist;
import java.util.*;

public class LlistVersusArrayList {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<Integer>();
        List<Integer> lList = new LinkedList();

        arrList.add(1);
        lList.add(1);

        System.out.println("Iterate through arraylist: ");
        //iterate over arraylist
        for(int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i));
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("Iterate through linkedlist: ");
        //iterate through linkedlist
        for(int i = 0; i < lList.size(); i++) {
            System.out.print(lList.get(i));
            System.out.print(" ");
        }

        arrList.add(2);
        lList.add(2);
        arrList.add(3);
        lList.add(3);
        System.out.println();
        System.out.println("Second iteration through arraylist: ");
        //iterate over arraylist
        for(int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i));
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("Second iteration through linkedlist: ");
        //iterate through linkedlist
        for(int i = 0; i < lList.size(); i++) {
            System.out.print(lList.get(i));
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("//Iterating via enhanced for loop ");
        System.out.println("Arraylist iteration: ");
    for(Integer val: arrList){
        System.out.print(val);
        System.out.print(" ");
    }
        System.out.println();
        System.out.println("LinkedList Iteration: ");
    for(Integer val : lList){
        System.out.print(val);
        System.out.print(" ");
    }
        System.out.println();


    Iterator<Integer> arrayList = arrList.iterator();
    while(arrayList.hasNext()){
        System.out.println("Iterator::"+arrayList.next());
    }

    ListIterator<Integer> linklist = lList.listIterator();
    while(linklist.hasNext()){
        System.out.println("List iterator: " + linklist.next());
    }

    arrList.add(2);
    arrList.set(1, 4);
    arrList.forEach(val -> System.out.println("Val\t"+val));
    //array to list
    Arrays.asList(1);
    //list to array
    arrList.toArray();
    }


}
/* List
 - list is an ordered collection and it follows insertion order.
*/

/*Future sessions
 - serialization
 - initial capacity and load factor
*/

/*
Next session
-Algorithm
-further dive into list interface
-miscellanous issues with list
- collections utility
- Cors policy
- how do you calculate the sum of two linkedlist(DO NOT DO)
 */