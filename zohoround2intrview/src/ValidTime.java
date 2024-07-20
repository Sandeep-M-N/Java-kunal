import java.util.*;
public class ValidTime {
    public static void main(String[] args) {
        String ques="20:41";
        String ans="";
        String[] arr=ques.split(":");
        String first=ques.substring(0,2);
        String second=ques.substring(3,ques.length());
        for (int i = 0; i < 2; i++) {
            if((second.charAt(i)-'0'<=2) && (first.charAt(i)-'0'<=2)){
                if(second.charAt(i)>first.charAt(i)){
                    ans+=second.charAt(i);
                    ans+=first.charAt(i);
                    break;
                }
//                if(i+1<=2){
//                    if(second.charAt(i+1)-'0'<=3){
//                        ans+=second.charAt(i);
//
//                    }
//                }
//
            }
            if(first.charAt(i)-'0'<=2){
                ans+=first.charAt(i);
            }
            if(i+1<=2){
                    if(second.charAt(i+1)-'0'<=3){
                        ans+=second.charAt(i+1);

                    }
                }

            if(second.charAt(i)-'0'<=4){
                ans+=second.charAt(i);
            }

        }
        if(ans.length()==2){
            int temp=1;
            if(first.charAt(temp)-'0'<=5){
                ans+=first.charAt(temp);
                ans+=second.charAt(temp);
            }
            else{
                ans+=second.charAt(temp);
                ans+=first.charAt(temp);
            }
        }
//        int fstart=0;
//        int sstart=0;
//        int fend=1;
//        int send=1;
//        while(fstart<=fend && sstart<=send){
//            if(second.charAt(sstart)-'0'<=2){
//                if(second.charAt(sstart)-'0'>first.charAt(sstart)-'0') {
//                    ans += second.charAt(sstart);
//                    sstart++;
//                }
//                else{
//                    ans+=first.charAt(fstart);
//                    fstart++;
//                }
//            }
//            else if(first.charAt(fstart)-'0'<=2) {
//                ans += first.charAt(fstart);
//                fstart++;
//            }
//
//        }
        System.out.println(ans);

    }

    }

