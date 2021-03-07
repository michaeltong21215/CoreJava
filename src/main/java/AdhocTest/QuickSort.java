package AdhocTest;

public class QuickSort {
    public static void main(String[] args) {
        int[] testArr = new int[]{1, 3, 4, 6,5};
        //1. Find a pivot. Ususally leftmost, rightmost or middle element. Let's use rightmost
        //2. in Current quick sort, only partition if leftmost index is less than the rightmost index value. after partitioning, set leftmost to be low and rightmost to be high - 1.
        //3. Recursively call quick sort in two calls. One quick sorting from leftmost to pivot, another from pivot to rightmost
        //4. Go through every element. Set i to be low index - 1 and j to be low index.
        //5. If arr[j] is less than pivot, increment i and swap arr[i] and arr[j].
        //6. Finally, after iterating through the array, swap arr[i] with the pivot.
        //Now the pivot belongs to its rightful place, where i is at.
    }
}

/*
Start Time End Time
8am  10am
9am  noon
10am 11am
11am noon
1pm  2pm
11am 1pm
3pm  4pm

8am 10am
10am 11am
9am noon
11an noon
11am 1pm
1pm 2pm
3pm 4pm

1am 9am
2am 3am
3am 4am
5am 9am

1. Sort all schedules by end time.
2. For each schedule, if current start time is at or later than the previous end time, add to the list of schedules we can support.


 */