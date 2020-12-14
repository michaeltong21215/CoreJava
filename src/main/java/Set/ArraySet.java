package Set;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
public class ArraySet {

    public static void main(String[] args) {

        String[] array = {"a", "b", "c"};
        Set<String> set = new HashSet<>(Arrays.asList(array));

        System.out.println("Set: " + set);
    }
}
