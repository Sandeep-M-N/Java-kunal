package generics;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private int DEFAULT_SIZE=10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isfull()){
            resize();
        }
        data[size++]=num;
    }
    
    private void resize(){
        int[] temp = new int[data.length *2];
        for (int i = 0; i < data.length; i++) {
            temp[i]= data[i];
            
        }
        data = temp;
    }
    private boolean isfull() {
        return size==data.length;
    }


    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", size=" + size +
                '}';
    }
    public int get(int index) {
        return data[index];
    }

    public void set(int index, int value) {
        data[index] = value;
    }




    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        for (int i = 0; i < 14; i++) {
            list.add(2*i);
            
        }
        System.out.println(list);
    }
}
