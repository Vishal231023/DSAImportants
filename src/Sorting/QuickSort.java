package Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        int n = arr.length;

        System.out.println("Before Sorting Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Create an instance of Solution class
        QuickSort solution = new QuickSort();

        // Function call to sort the array using quick sort
        int[] sortedArr = solution.quickSorting(arr);
        System.out.println("After Sorting Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(sortedArr[i] + " ");
        }
        System.out.println();

    }

    private int[] quickSorting(int[] arr) {
        int n = arr.length;

        quickSortHelper(arr, 0,n-1);
        return arr;

    }

    public void quickSortHelper(int[] arr, int low, int high) {
        if(low<high){
            int partitionIndex = partition(arr,low,high);
            quickSortHelper(arr, low, partitionIndex-1);
            quickSortHelper(arr,partitionIndex+1, high);
        }
    }

    public int partition(int[] arr, int low, int high) {

        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i<j){

            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }

            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }


}
