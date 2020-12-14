package algorithms;
import java.util.*;

public class ArraysSumEqualsK {
    //[12, 14, 17, 15, 19, 20, -11] and we want to find nums that add up to k that is 9
    //Output: [[20, -11]]
    //Brute force algorithm: for every number check against other numbers and if two numbers,
    // i and j, sums up to k then add i and j to the output array
    /*
       for(int i ...){
         for(int j ...){
           if(arr[i] + arr[j] == k) then add to output an array of i and j
     */

    public static boolean isArrLongEnough(int length){
        return length > 1;
    }

    public static int[] getArraySumsK(int[] arr, int k){
        /*
        for(int i = 0; i < arr.length; i++){ //o(n)
            for(int j = i + 1; j < arr.length; j++){ //o(n)
                if(arr[i] + arr[j] == k){
                    System.out.print("Pair: ");
                    System.out.print(arr[i]);
                    System.out.print(" " + arr[j]);
                    System.out.println();
                }
            }
        }*/

        /*
        int low = 0;
        int high = arr.length -1;
        int[] pair = new int[2];
        if(isArrLongEnough(high + 1) == false){
            return pair;
        }
        Arrays.sort(arr);
        while(low < high){
            int num = arr[low] + arr[high];
            if(num < k){
                low++;
            }
            else if(num > k){
                high--;
            }
            else if(num == k){
                pair[0] = arr[low];
                pair[1] = arr[high];
                return pair;
            }
        }
         */
        int[] pair = new int[2];
        Set<Integer> sumPair = new HashSet<Integer>();
        for(int i = 0; i < arr.length; i++) {
            int temp = k - arr[i];
            if(sumPair.contains(temp)){
                pair[0] = arr[i];
                pair[1] = temp;
                return pair;
            }else{
                sumPair.add(arr[i]);
            }
        }
        return pair;
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 17, 4, 19, 6, -11};
        int[] pair = getArraySumsK(arr, 36);
        System.out.println(pair[0]);
        System.out.println(pair[1]);
    }
}

/*Note
-Complete Array Sum Equal K non-brute
- check if there is negative numbers
- check what to do if there are duplicate pairs(What to do), size of the array
- try to find indices of the pair that sums up to k
*/

/*Homework
- What I can do with collection and list
List
- can add to beginning, end, any index in the list
- can add another collection into list, at any index you want or end of list
- can clear and check if the list contains all elements of another sublist
- can return an iterator and list iterator used to go over the list
- can replace elements and sort a list
- can return a sublist

Collection
- can add one or a collection of element into its own
- can check if it contains an object or a collection of object
- can remove one or more elements
- can retain elements base on another collection
- can remove conditionally base on a predicate

private static List<Employee> listByEmployee(int EmployeeId){
   return Collections.EMPTY_LIST
Collection<Employee> col = listByEmployee(dfsdfsd);
if(col == Collections.EMPTY_LIST)//throw error

 */

/* Homework
 - check more on merge sort. Repeat implementation on merge sort/quick sort
 -
 */
