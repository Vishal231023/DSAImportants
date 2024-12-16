package Arrays.FAQs_Hard;

public class MajorityElements1 {
    public static void main(String[] args) {
        int arr[] = {7,0,0,1,7,7,2,7,7};

        int ans = getMajorityElement(arr);

        System.out.println(ans);
    }

    private static int getMajorityElement(int[] arr) {

        //TC: O(N) + O(N) if it is not mentioned that majority element exists always
        //SC:O(1)

        int ele =0;
        int cnt=0;

        for(int i=0; i< arr.length;i++){
            if(cnt == 0){
                cnt=1;
                ele = arr[i];
            }
            else if (arr[i] != ele) {
                cnt--;

            }

            else{
                cnt++;
            }
        }

        int cnt1 = 0;

        for(int i=0 ; i< arr.length;i++){
            if(arr[i] == ele){
                cnt1++;
            }
        }

        if(cnt1 > arr.length/2){
            return ele;
        }else{
            return -1;
        }
    }
}
