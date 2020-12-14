package Map;

import Immutability.Student;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class MapOperations {
    public static void main(String[] args) {
        Map map = new HashMap();

        userDefinedMapTest();


        map.put(1, "apple");
        map.put(2, "banana");
        map.put(2, "sausage");
        map.put(2, true);
        map.put(3, "apple");
        map.put(4, "apple");
        map.put(4, "banana");

        Iterator iter = map.keySet().iterator();

        while(iter.hasNext()){
            Integer key = (Integer)iter.next();
            System.out.println("key: " + key);
            System.out.println("value: " + map.get(key));
        }
    }

    private static void userDefinedMapTest() {
        Map map1 = new HashMap<Integer, Student>();

        /*Student s1 = new Student(1, "s1");
        Student s2 = new Student(2, "s2");
        Student s3 = new Student(3, "s3");
        Student s4 = new Student(4, "s4");
        Student s5 = new Student(5, "s5");

        map1.put(1, s1);
        map1.put(2, s2);
        map1.put(3, s3);
        map1.put(4, s4);
        map1.put(5, s5);
        */
        /*
          Operations
          - put
          - putIfAbsent
          -
         */
    }
}
/* Hashmap key concepts
 - hashmap does not allow duplicate keys
 - hashmap does allow duplicate values
 - map can be orderd or unordered collection depends on its implementation
 Can be hashmap, which is unordered, or a LinkedHashmap, which is an ordered map
 - if hashmap already has a value for a key
 and another call to put another value on the same key,
 the old value for that key will be overwritten by new value.
 - hashCode can be positive or negative

 */
/*
User defined Type
- UDT
- User defined Object
- classes type/objects not provided by Java API
 */