package Eleven_to_20;

public class Special_arr_rev {
    public static void main(String[] args) {
        String str="A&x#";
        System.out.println(reverse(str));
    }
    public  static String reverse(String str)
    {
        //complete the function here

        char[] arr=str.toCharArray();

        int start=0;
        int end= arr.length-1;
       while(start<end){

               if (!Character.isAlphabetic(arr[start])) {
                   start++;
               } else if (!Character.isAlphabetic(arr[end])) {

                   end--;
               } else {
                   swap(arr, start, end);
                   start++;
                   end--;
               }
       }



        return new String(arr);
    }
    public static void swap(char[] arr,int first,int second){
        char temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
