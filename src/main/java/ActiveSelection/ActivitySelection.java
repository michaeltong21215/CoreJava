package ActiveSelection;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    /*
      1. sort endtime in asc order
      2. select first activity and note the end time as a previous endtime
      2b. initially set the current start time to second activity start time
      3. iterate over the rest of the activities
        - for each current activity, if the current activity start_time
          is greater or equal to previous activity endTime
          if yes:
            select the activity
            update previous end time to the current end time
          else if no:
            ignore the current activity
     */

    public static void getOptimalSchedule(Pair[] pArr){
        int[] optimalSchedule = new int[pArr.length - 1];

        //Arrays.sort(pArr);
        Arrays.sort(pArr, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.getEndTime() - o2.getEndTime();
            }
        });
        for(int i = 0; i < pArr.length; i++){
            System.out.println(pArr[i].getEndTime());
        }
        int numSchedule = 0;
        //System.out.println(numSchedule);
        for(int i = 1; i < pArr.length; i++){
            if(pArr[i].getStartTime() >= pArr[numSchedule].getEndTime()){
                //System.out.println(i);
                numSchedule = i;
            }
        }
        //return optimalSchedule;
    }

    private static void printArray(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        //(0,7), (1,2),(1,3),(2,4),(3,5)
        //(1,3),(3,4),(2,5),(0,7), (5,9),(8,10),(11,12)
        //int[] startTime = new int[]{0, 1, 1, 2, 3};
        //int[] endTime = new int[]{7, 2, 3, 3, 5};
        Pair pOne = new Pair(0,7);
        Pair pTwo = new Pair(1,2);
        Pair pThree = new Pair(1,3);
        Pair pFour = new Pair(2,3);
        Pair pFive = new Pair(3,5);
        Pair[] pairArr = new Pair[]{pOne, pTwo, pThree, pFour, pFive};

        //int[] startTime = new int[]{1, 3, 2, 0, 5,8,11};
        //int[] endTime = new int[]{3,4, 5, 7, 9, 10, 12};
        getOptimalSchedule(pairArr);
        System.out.println();
        //printArray(optSchedule);
    }
}

/* real time application
 - operational research

 Do extra to find real time scenario on activity selection
*/