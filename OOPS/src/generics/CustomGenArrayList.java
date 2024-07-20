package generics;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenArrayList<T> {
    private Object[] data;
    private int DEFAULT_SIZE= 10;
    private int size = 0;

    public CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isfull()){
            resize();
        }
        data[size++]=num;
    }

    public boolean isfull(){
        return size==data.length;
    }
    public void resize(){
        Object[] temp = new Object[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];

        }
        data = temp;
    }
    public T get(int index){
        return (T)(data[index]);
    }
    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenArrayList<Integer> list2 = new CustomGenArrayList<>();
        for (int i = 0; i < 14; i++) {
            list2.add(2*i);
        }
        System.out.println(list2);
    }
}
