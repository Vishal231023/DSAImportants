package Sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();

        int[] arr = {2, 1, 5, 4, 7, 6};

        int[] sortedArray = mergeSort.getMergeSortedArray(arr);

        for (int num : sortedArray) {
            System.out.print(num + ",");
        }
    }

    private int[] getMergeSortedArray(int[] arr) {

        mergeSorting(arr, 0, arr.length - 1);
        return arr;
    }

    private void mergeSorting(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSorting(arr, low, mid);
        mergeSorting(arr, mid + 1, high);

        merge(arr, low, mid, high);

    }

    private void merge(int[] arr, int low, int mid, int high) {
        List<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                list.add(arr[left]);
                left++;
            } else {
                list.add(arr[right]);
                right++;

            }

        }
        while (left <= mid) {
            list.add(arr[left]);
            left++;
        }
        while (right <= high) {
            list.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = list.get(i - low);
        }
    }
}
