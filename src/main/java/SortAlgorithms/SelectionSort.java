package SortAlgorithms;

public class SelectionSort {
    public static void main(String[] args) {

        //unstable selection sort: sorting of order incorrectly if there are two or more objects with same key
        //For example, {5,4a,3,4b,6} can result as {3, 4b,4a,5,6}
        //stable selection sort will move the smallest element to the right index instead of swapping current element with smallest element

        int [] arr = { 10, 4, 5, 8, 6, 11, 26};
        System.out.println("Before Sorting: " + " ");
        printArray(arr);
        System.out.println();
        System.out.println();
        //selection sort
        stableSelectionSort(arr);
        System.out.println("After Sorting: " + " ");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void stableSelectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){ //performance: o(n^2) space: o(1)
            int minIdx = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            int key = arr[minIdx];
            while(minIdx > i){
                arr[minIdx] = arr[minIdx - 1];
                minIdx--;
            }
            arr[i] = key;
        }
    }

    private static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){ //performance: o(n^2) space: o(1)
            int minIdx = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }
}
