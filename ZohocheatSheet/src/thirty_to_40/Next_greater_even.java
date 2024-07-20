package thirty_to_40;

public class Next_greater_even {

    public static void main(String[] args) {
        String x="34722641";
        getNextEven(x);
    }
    public static long getNextEven(String x)
    {
        // Your code goes here
        if(x.length()==1 || x.length()<=1){
            return -1;
        }
        int inx=-1;

        char[] arr=x.toCharArray();
        for (int i = arr.length-2; i>=0 ; i--) {
            if(arr[i]<arr[i+1]){
                inx=i;
            }
        }
        if(inx==-1){
            return -1;
        }
        nextgreater(arr,inx);
    }
    public static void nextgreater(char[] arr,int inx){
        int min= 123456;
        for (int i = arr.length-2; i >inx ; i--) {
            if((arr[i]-'0')%2==0){

            }
        }
    }

}
