package Set;

import java.util.*;

public class LinkedHashSetApp {
    public static void main(String[] args) {
        Set mySet = new LinkedHashSet();
        mySet.add(3);
        mySet.add("apple");
        mySet.add(3);
        mySet.add(null);
        mySet.add("null");
        mySet.add("null");
        mySet.add("apple pie");
        mySet.add("apple");
        mySet.add(null);

        Iterator iterator = mySet.iterator();
        while(iterator.hasNext()){
            System.out.println("element: " + iterator.next());
        }
    }
}

/*
  LinkedHashset vs hashset
  - linkedhashset is ordered, so the order which elements are added are persisted
  - hashset is unordered, no guarantee to elements being persisted.
 */

/*
 Next session:
 - map
 - Java 8 concepts
 - multithreading
 */