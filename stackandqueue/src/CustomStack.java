public class CustomStack {
    protected int[] data;
    private static final  int DEFAULT_SIZE=10;
    int ptr=-1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isfull()){
            System.out.println("stack is  full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("cannot pop from an empty stack");
        }

        int remove =data[ptr];
        ptr--;
        return remove;
    }
    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("cannot peek from an empty stack");
        }
        return data[ptr];

    }

    public boolean isfull(){
        return ptr ==data.length-1;

    }

    public boolean isEmpty(){
        return ptr==-1;
    }
}
// in custom stack we cannot insert a item when a size is full.
// so we can use dynamic stack.