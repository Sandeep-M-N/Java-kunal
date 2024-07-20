public class CricketScores {
    public static void main(String[] args) {
        String str="1.2.436W1.N.21";
        int p1=0;
        int p2=0;
        int extras=0;
        boolean a =true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch=='W'|| ch=='N'){
                extras++;

            }
            if(ch=='1'|| ch=='3'){
                if(a==true){
                    p1=p1+ch-'0';
                    a=false;

                }
                else{
                    p2=p2+ch-'0';
                    a=true;

                }
            }
            if(ch=='2'|| ch=='4'|| ch=='6'){
                if(a==true){
                    p1=p1+ch-'0';
                }
                else{
                    p2=p2+ch-'0';
                }
            }

        }








        System.out.println(p1);
        System.out.println(p2);
        System.out.println(extras);

    }
}



