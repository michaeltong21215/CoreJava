package SortAlgorithms;

public class MergeSort {
    private static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void mergeSort(int[] arr, int length){
        //Check if length is less than 2, return;
        //Step 1: initialize left and right empty sub array,
        // using arr.length as a dividing point and size for both arrays
        // Step2: copy elements, from current left to mid to the left sub array
        //Step3: copy elements, from current arr.length - mid to the right sub array
        //Step 4: call merge sort recursively with left subarray
        //Step 5: call merge sort recursively with right subarray
        //Step 6: call merge with left sub array, right subarray, original array to be changed,left_size, right_size
       if(length < 2) return;
       int mid = length /2;
       int[] left_arr = new int[mid];
       int[] right_arr = new int[length - mid];

       int k = 0;
       for(int i = 0; i < length; i++) {
           if (i < mid) {
               left_arr[i] = arr[i];
           } else {
               right_arr[k] = arr[i];
               k++;
           }
       }
        mergeSort(left_arr,mid);
        mergeSort(right_arr, length - mid);
        merge(left_arr, right_arr, arr, mid, length - mid);
    }

    private static void merge(int[] left_arr, int[] right_arr, int[] arr, int left_size, int right_size) {
      //Step 1: initialize i, j, and k to 0, using to track which element i am at for each array, k being the index for the original array to be copied
        //Step 2: open a while loop, set it running until one of the arrays have been copied into the main array
        //Step 3: inside the while loop, if current left array element is less than right array element,
        //copy left array element over to arr, increment i and k.
        //Else, copy right array element over to current original array spot, increment j and k
        //Step 4: if there are remaining elements in the left_array, copy the remaining elements to the original array
        //Step 5: if there are remaining elements in the right_array, copy the remaining elements to the original array
        int leftIdx = 0, rightIdx = 0, originArrIdx = 0;

        while(leftIdx < left_size && rightIdx < right_size){
            if(left_arr[leftIdx] < right_arr[rightIdx]){
                arr[originArrIdx++] = left_arr[leftIdx++];
            } else {
                arr[originArrIdx++] = right_arr[rightIdx++];
            }
        }

        while(leftIdx < left_size){
            arr[originArrIdx++] = left_arr[leftIdx++];
        }

        while(rightIdx < right_size){
            arr[originArrIdx++] = right_arr[rightIdx++];
        }

    }

    public static void main(String[] args) {
        int [] arr = { 10, 4, 5, 8, 6, 11, 26, 8};
        System.out.println("Before Sorting: " + " ");
        printArray(arr);
        System.out.println();
        System.out.println();
        //merge sort
        mergeSort(arr, arr.length);
        System.out.println("After Sorting: " + " ");
        printArray(arr);
    }
}
