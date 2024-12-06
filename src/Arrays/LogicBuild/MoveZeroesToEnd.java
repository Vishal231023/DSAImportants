package Arrays.LogicBuild;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int arr [] = {0,1,4,0,5,2};



        int ans [] = moveZeroToEndBrute(arr);
        for (int a : ans){
            System.out.print(a + " ");
        }

        System.out.println();
        int [] ans1 = moveZeroToEndOptimize(arr);
        for (int a : ans1){
            System.out.print(a + " ");
        }


    }


    public static int[] moveZeroToEndBrute(int[] arr) {
        int temp [] = new int[arr.length];

        int x =0;
        for(int i = 0;i < arr.length; i++){
            if(arr[i] != 0){
                temp[x] = arr[i];
                x++;

            }
        }


        for(int i = x ;i< arr.length;i++){
            temp [i] = 0;
        }

        for(int i =0;i<arr.length;i++){
            arr[i] = temp[i];
        }

        return arr;
    }

    private static int[] moveZeroToEndOptimize(int[] arr) {

       int j = 0;
       for(int i =0;i<arr.length;i++){
           if(arr[i]!=0){
              arr[j] = arr[i];
              j++;
           }
       }


        return arr;
    }


}
