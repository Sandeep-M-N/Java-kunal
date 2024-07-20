package Eleven_to_20;

public class Kadane_algo {
    public static void main(String[] args) {
           int[] arr={-2,1};
           int n= arr.length;
        System.out.println(maxSubarraySum(arr,n));
    }
   public static long maxSubarraySum(int arr[], int n){

        // Your code here
       int max=-123456;
       int sum=0;

       for (int i = 0; i < n; i++) {
//           sum+=arr[i];

           if(sum+arr[i]<arr[i]){
              sum=arr[i];
              if(sum>max){
                  max=sum;
              }

           }

            else{
               sum+=arr[i];

           }
       }
       return max;

    }

}
