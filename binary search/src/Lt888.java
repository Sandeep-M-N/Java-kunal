import java.util.Arrays;

public class Lt888 {
    public static void main(String[] args) {
        int[] aliceSizes={1,2};
        int[] bobSizes={2,3};

        int[] ans = new int[2];
        int sum1=0;
        int sum2=0;
        for(int i=0;i<aliceSizes.length;i++){
            sum1+= aliceSizes[i];
        }
        for(int j=0;j<bobSizes.length;j++){
            sum2+= bobSizes[j];
        }
        int total=sum1+sum2;
        int half=total/2;

        int k=0;
        while(k<bobSizes.length){
            if(aliceSizes[0] + bobSizes[k]==half){
                ans[0]=aliceSizes[0];
                ans[1]=bobSizes[k];
                break;
            }
            else{
                k++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }

}
