package Map;

import java.util.*;

public class SameHashCodeObj {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, 1);
        map.put(2, 4);

        Map map1 = new HashMap();
        map1.put(1, 1);
        map1.put(2, 4);

        System.out.println("map hashcode: " + map.hashCode());
        System.out.println("map1 hashcode: " + map1.hashCode());
    }
}
/*
how put and get works in map
- based on the key, we apply the hashcode function on the key to get the hashcode.
Afterward, we apply the hashing algorithm to see where to put the key, value pair.
If there are already elements exist in the particular spot we want to store the value,
internal java implementation will create a linkedlist and store the key,value pair there.

- for getting, we apply the hashcode function on the key to get the hashcode.
Afterward, we apply the hashing algorithm to see where to put the key, value pair.
If there are multiple elements in the particular spot that we want to get the value,
an equals method will be applied between the given key and every key in the linkedlist.
And then we return the value in which this equals method equates to true.
 */
