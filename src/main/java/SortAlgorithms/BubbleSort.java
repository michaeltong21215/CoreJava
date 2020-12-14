package SortAlgorithms;

public class BubbleSort {

    public static void main(String[] args) {
        int [] arr = { 3, 5, 1, 2, 4, 7, 6};
        System.out.println("Before Sorting: " + " ");
        printArray(arr);
        System.out.println();
        System.out.println();
        //bubble sort
        bubbleSort(arr);
        System.out.println("After Sorting: " + " ");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void bubbleSort(int[] arr) {
        boolean swap;
        for (int i = 0; i < arr.length; i++) {
            swap = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
                if(swap == false){
                    break;
                }
            }
        }
    }
    //Homework: understand sorting algorithm

}
