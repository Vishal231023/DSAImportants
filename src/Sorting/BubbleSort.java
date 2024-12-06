package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {2, 1, 5, 4, 7, 6};

        int[] sortedArray = new int[arr.length];

        sortedArray = bubbleSort.getSortedArray(arr);

        for (int num : sortedArray) {
            System.out.print(num + ",");
        }
    }

    private int[] getSortedArray(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }


}
