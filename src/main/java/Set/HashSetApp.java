package Set;
import java.util.*;

public class HashSetApp {
    public static void main(String[] args) {
        Set mySet = new HashSet();
        mySet.add(3);
        mySet.add("apple");
        mySet.add(3);
        mySet.add(null);
        mySet.add("null");
        mySet.add("null");
        mySet.add("apple pie");
        mySet.add("apple");
        mySet.add(null);
        /*
        List addList = new ArrayList();
        addList.add(1);
        addList.add(3);
        addList.add("hot dog");
        addList.add("hot dog");
        addList.add("apple pie");
        addList.add(null);

        mySet.addAll(addList);
        addList.add("pizza");
        System.out.println(mySet.containsAll(addList));
        /*System.out.println(mySet.contains("hotdog"));
        System.out.println(mySet.contains("apple pie"));
        System.out.println(mySet.contains(null));
        System.out.println(mySet.contains("null"));


        Integer[] arr = {4,4,1,2,3,4,5,3,6};
        Set<Integer> newSet = new HashSet<>(Arrays.asList(arr));
        Integer[] setToArray = new Integer[newSet.size()];
        newSet.toArray(setToArray);
        for(int i = 0; i < setToArray.length -1; i++){
            System.out.println("arr ele: " + setToArray[i]);
        }
        */
        Iterator iterator = mySet.iterator();
        while(iterator.hasNext()){
            System.out.println("element: " + iterator.next());
        }
    }
}

/* Set key points
 - unordered
 - only contains unique values
 - Sample Question: what do you mean by insertion order?
 - only accept one null value
 - case sensitive and also sensitive to number of spaces
 - if you add null and the string "null" then you will null twice in the set
 - isEmpty vs size()?
 We use isEmpty to check explicitly if a set has elements or not,
 whereas size() is used to check how many elements the set has.
 Also size() can involve iterating through every element to return a specific number,
 whereas isEmpty can give you true or false immediately without traversing through the set.

 */

/*IDE - integrated development environment
  - can code, deploy, and access to environment
*/

/*
- Question: how do you convert list to set?
 */