package OOPS.Access;

public class A {
   private int num;
    String name;
    int[] arr;

  // when a data memebers are declared as private they are accessed using getter & setter methods.
    // when data members  is not declared as anything we cannot access it in another package.
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr=new int[num];
    }
}
