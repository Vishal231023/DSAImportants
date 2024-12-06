package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int [] arr  = {2,1,5,4,7,6};

        int [] sortedArray = new int[arr.length];

        sortedArray  = selectionSort.getSortedArray(arr);

        for(int num: sortedArray){
            System.out.print(num + ",");
        }

    }

    private int[] getSortedArray(int[] arr) {
        int n = arr.length;

        int minIndex =0;

        for(int i=0;i<n;i++){
            minIndex = i ;

            for(int j = i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex!=i){
                int temp = arr[minIndex];
               arr[minIndex] = arr[i];
               arr[i] = temp;

            }
        }
        return  arr;
    }


}
