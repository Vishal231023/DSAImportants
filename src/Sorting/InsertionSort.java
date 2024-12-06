package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();

        int[] arr = {2, 1, 5, 4, 7, 6};

        int[] sortedArray = new int[arr.length];
        sortedArray = insertionSort.getSortedArray(arr);

        for (int num : sortedArray) {
            System.out.print(num + ",");
        }
    }

    private int[] getSortedArray(int[] arr) {
        int n = arr.length;

        for(int i=0;i<n;i++){
            int j = i;

            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
        }
        return  arr;
    }
}

