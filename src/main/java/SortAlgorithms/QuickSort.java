package SortAlgorithms;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = { 10, 4, 5, 8, 6, 11, 26};
        System.out.println("Before Sorting: " + " ");
        printArray(arr);
        System.out.println();
        System.out.println();
        //bubble sort
        int kthsmall = kthSmallest(arr, 0, arr.length - 1, 2);
        System.out.println("kth smallest: " + kthsmall);
        //System.out.println("After Sorting: " + " ");
        //printArray(arr);
    }

    private static int kthSmallest(int[] arr, int low, int high, int k) {
        int border = partition(arr, low, high);
        if(border == k){
            return arr[k];
        }else if(border < k) {
            return kthSmallest(arr, border + 1, high, k);
        }else if(border > k) {
            return kthSmallest(arr, low, border - 1, k);
        }
        return -1;
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int border = partition(arr, low, high);
            quickSort(arr, low, border - 1);
            quickSort(arr, border + 1, high);
        }
    }

    static private int partition(int[] array, int low, int high){
        int pivot = array[high];
        int i = low - 1;
        for(int j = low; j< high; j++){
            if(pivot > array[j]){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    private static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    /*Next session:
      -Linkedlist
     Homework:
     - write article on quick sort & bubble sort
     - send list of problems from notes
    */
}
