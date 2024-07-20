public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr ={-2,1,-3,4,-1,2,1,-5,4};
        int max =0,j=0,sum=0,sum2=0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
            if(sum==j){
                j=i;
            }




        }

        for(int k=j;k<arr.length;k++){
            sum2=sum2+arr[k];
            if(sum2>max){
                max=sum2;
            }
        }
        System.out.println(max);
    }
}
