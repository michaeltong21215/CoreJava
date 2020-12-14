package Map;

import Set.LinkedHashSetApp;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Iterator;

public class MapAccessOrderApp {

    public static void main(String[] args) {

        /*
        Student s1 = new Student(1, "Henry");
        Student s2 = new Student(2, "David");
        Student s3 = new Student(3, "Kelly");
        Student s4 = new Student(4, "Peter");
        Student s5 = new Student(5, "Ada");

        Map<Integer, String> myMap = new LinkedHashMap(16,(float)0.75, true);
        myMap.put(1, "Henry");
        myMap.put(2, "David");
        myMap.put(3, "Kelly");
        myMap.put(4, "Peter");
        myMap.put(5, "Ada");
        */
        //Iterator iter = myMap.keySet().iterator();
        /*
        iterMapProps(myMap, "Key:", ", Value:");

        System.out.println(myMap.get(1));
        System.out.println(myMap.get(3));

        iterMapProps(myMap, "KeyOne:", ", ValOne:");

         */
        /*while(iter.hasNext()){
            Integer currentKey = (Integer)iter.next();
            System.out.println("key: " + currentKey);
            System.out.println("value: " + myMap.get(currentKey));
        }*/
    }

    private static void iterMapProps(Map<Integer, String> myMap, String s, String s6) {
        myMap.forEach((key, value) -> {
            System.out.println(s + key + s6 + value);
        });
    }
}

/*
Interview Questions:
- How hashmap works in java
  Hashing works based on hashing algorithm
- How put method works in map
  1. it gets the key from the first parameter
  2. it apply the hashcode method on the key to get the hashcode
  3. with the same hashcode,
  java hashmap implementation applies its own hashing algorithm to find the location.
  4. With the location, we keep the key and value pair in the location.
  Question: What happens if two objects have the same hashcode?
  Hashcode and equals contract
  -If two objects are equal by equals method, then those two objects are same.
  -If two objects are equal by hashcode method, then those objects might or might not be same.
  Two Objects can have the same hashcode.
  If two objects have the same hashcode, a linkedlist is created to maintain these two objects.
  Example of two objects with different values but same hashcode:

- How to retrieve the value from the hashmap
  1. it gets the key from the first parameter
  2. it apply the hashcode method on the key to get the hashcode
  3. with the same hashcode,
  java hashmap implementation applies its own hashing algorithm to find the location.
  4. With the location, we get the value in the location.

  What happens if there are two objects maintained in the same hashcode?
  - It will call equals method with the key from the parameter and the keys from the linkedlist
  in separate calls. If one of these equals method is true then return that respective value.

  What happens if the size of a hashmap exceeds a given threshold?
  - It resizes when the amount of elements in the hashmap equates to initialCapacity * load_factor.
  For ex., if I have 12 elements and my initCapacity is 16 and my load factor is 0.75,
  the hashmap will double its size because 12 is 75% of the initCapacity, which is 16.

  How do you choose hashmap key?
  - The key always have to produce consistent hashing output(hashCode or hashValue)
  otherwise hashing doesn't work.
  - String and all wrapper classes are candidates for hashmap keys.
  - All immutable classes are candidates for hashmap keys.

  How do you make an object immutable?

 */

/*
Next session:
- how to make two objects have same hashcode?
- how to make an object immutable?
- Set and map interview questions
- performance on set and map
- Generics
- Java 8 concepts
 */