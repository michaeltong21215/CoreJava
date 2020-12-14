package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapPutIfAbsent {
    public static void main(String[] args) {
        Map map2 = new HashMap();
        map2.putIfAbsent(4, "apple");
        map2.putIfAbsent(4, "banana");
        map2.putIfAbsent(4, "orange");
        map2.put(4, "coconut");
        map2.put(3, "a value");
        /*System.out.println(map2.isEmpty());
        System.out.println(map2.size());
        System.out.println(map2.containsKey(3));
        System.out.println(map2.containsValue("coco"));
         */
        /*with remove method that requires key and value as parameter:
          -if the key exist and the value the key maps to matches
          the value provided as the 2nd parameter, delete is successful and return true
          else returns false
        */
        //System.out.println(map2.remove(4, "coconut"));
        /*
        To get values:
        - call map.values() and call its iterator to iterate through each value
         */
        Iterator iterVal = map2.values().iterator();

        while(iterVal.hasNext()){
            System.out.println("element: " + iterVal.next());
        }
        /*
        To get the keys:
        - call map.keySet() and call its iterator to iterate through each key
         */
        Iterator iter = map2.keySet().iterator();

        while(iter.hasNext()){
            Integer key = (Integer)iter.next();
            System.out.println("key: " + key);
            System.out.println("value: " + map2.get(key));
        }
        //to get all key,value pair, use entrySet
        System.out.println(map2.entrySet());
    }
}

/*
  Put:
  - asoociate 4 values with one key, always return last value
  PutIfAbsent:
  - asoociate 4 values with one key, always return first value

*/
