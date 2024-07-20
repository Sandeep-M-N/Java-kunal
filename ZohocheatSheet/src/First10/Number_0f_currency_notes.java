package First10;

import java.util.Arrays;

public class Number_0f_currency_notes {
    public static void main(String[] args) {
        int[] notes={2000,500,200,100,50,20,10,5,1};
        int n=2456;
        int[] notescount=new int[notes.length];
        int i=0;
        int count=0;
        while(i< notes.length){

            if(n>=notes[i]){
                count=n/notes[i];
                n=n%notes[i];
            }
            if(n<notes[i]){
                notescount[i]=count;
                count=0;
                i++;
            }
        }

        System.out.println(Arrays.toString(notescount));



    }
}
