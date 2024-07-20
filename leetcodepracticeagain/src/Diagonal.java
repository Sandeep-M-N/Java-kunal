public class Diagonal {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int start=0;
        int end=arr.length-1;
        int sum=0;
        int count=0;
        while(count<arr.length) {
            if (start==end) {
                sum = sum + arr[count][start];
            } else {
                sum += arr[count][start] +arr[count][end];

            }
            start++;
            end--;
            count++;
        }
        System.out.println(sum);
    }
}
