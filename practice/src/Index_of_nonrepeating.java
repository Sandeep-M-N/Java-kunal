public class Index_of_nonrepeating {
    public static void main(String[] args) {
        String s="abcdcaf";
        System.out.println();

        System.out.println(nonrepeat(s));
    }
    static int nonrepeat(String s){
        int count =0;
        for(char i : s.toCharArray()){
            for(int j=0;j<s.length();j++){
                if(i!=j && s.charAt(i)==s.charAt(j)){
                    count=1;
                }
            }
            if(count==0){
                return i;

            }
        }
        return-1;
    }
}
