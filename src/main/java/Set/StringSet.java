package Set;
import java.util.Set;
import java.util.HashSet;

public class StringSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Apple");
        set.add("Orange");
        set.add("Banana");
        System.out.println("Contents of Set ::"+set);
        String[] myArray = new String[set.size()];
        set.toArray(myArray);
        for(int i=0; i<myArray.length; i++){
            System.out.println("Element at the index "+(i+1)+" is ::"+myArray[i]);
        }
    }
}
