package Strings;

public class L1528 {
    public static void main(String[] args) {
         int[] indices={4,5,6,7,0,2,1,3};
         String s="codeleet";
        System.out.println(restoreString(s,indices));
    }
    public static  String restoreString(String s, int[] indices) {
        char[] arr = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            arr[i]=s.charAt(i);

        }
       int temp=0;
        char[] ans= new char[indices.length];
        StringBuilder fianl= new StringBuilder();
        for (int i = 0; i < indices.length; i++) {
            temp=indices[i];
            ans[temp]=arr[i];

        }
        for (int i = 0; i < ans.length; i++) {
            fianl.append(ans[i]);

        }
        return fianl.toString();


    }

}
