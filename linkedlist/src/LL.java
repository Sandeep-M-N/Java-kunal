public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size=0;
    }

    public void insertfirst(int val){
        Node node = new Node(val);
        node.next=head;
        head = node;

        if(tail==null){
            tail = head;
        }
        size+=1;
    }

    public void insertlast(int val){
        if(tail==null){
            insertfirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insert(int val,int index){
        if(index==0){
            insertfirst(val);
            return;
        }
        if(index==size){
            insertlast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;

        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;

    }

    public int deletefirst(){
        int val = head.value;
        head = head.next;
        if(head==null){
            tail = null;
        }
        size--;
        return val;
    }
    public int deleteLast() {
        if (size <= 1) {
            return deletefirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index){
        if(index ==0){
            return deletefirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next=prev.next.next;
        size--;
        return val;
    }

    public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.value == value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public void insertrec(int val,int index){
        head = insertrec(val,index,head);
    }
    private Node insertrec(int val,int index,Node node){
        if(index==0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }
        node.next = insertrec(val,index-1,node.next);
        return node;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node=node.next;


        }
        return node;
    }

    public void display(){
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.value + "->");
            temp=temp.next;
        }
        System.out.println();
    }


    private  class Node{
        private int value;
        private Node next;





        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


    // questions

    public void duplicates(){
        Node node = head;
        while(node.next!=null){
            if(node.value==node.next.value){
                node.next=node.next.next;
                size--;
            }
            else{
                node=node.next;
            }
        }
        tail=node;
        tail.next=null;
    }

    // merge
     public static  LL merge(LL first,LL second){
        Node f =first.head;
        Node s =second.head;
        LL ans = new LL();
        while(f!=null && s!=null){
            if(f.value<s.value){
                ans.insertlast(f.value);
                f=f.next;
            }
            else{
                ans.insertlast(s.value);
                s=s.next;
            }
        }
        while(f!=null){
            ans.insertlast(f.value);
            f=f.next;
        }
        while(s!=null){
            ans.insertlast(s.value);
            s=s.next;
        }
        return ans;
     }

     public void bubblesort(){
        bubblesort(size-1,0);
     }

     private void bubblesort(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            Node first=get(c);
            Node second =get(c+1);

            if(first.value>second.value){
                if(first==head){
                    head=second;
                    first.next=second.next;
                    second.next=first;
                }
                else if(second==tail){
                    Node prev = get(c-1);
                    prev.next=second;
                    tail=first;
                    first.next=null;
                    second.next=tail;
                }
                else{
                    Node prev = get(c-1);
                    prev.next=second;
                    first.next=second.next;
                    second.next=first;
                }
            }
            bubblesort(r,c+1);

        }
        else{
            bubblesort(r-1,0);
        }

     }

     // recursion reverse


    private void reverse(Node node){
        if(node==tail){
            head=tail;
            return;
        }
        reverse(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }

    // in place reversal

    public void reversal(){
        if(size<2){
            return;
        }
        Node prev=null;
        Node present = head;
        Node next=present.next;
        while(present!=null){
            present.next = prev;
            prev=present;
            present=next;
            if(next!=null){
                next=next.next;
            }
        }
        head=prev;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.insertlast(1);
        list.insertlast(1);
        list.insertlast(1);
        list.insertlast(2);
        list.insertlast(4);
        list.insertlast(4);

        list.display();
        list.duplicates();
        list.display();

    }
}
//    ListNode dummy = new ListNode();
//    ListNode ans = dummy;
//
//        while(list1!=null && list2!=null){
//                if(list1.val<list2.val){
//        ans.next=list1;
//        list1=list1.next;
//        ans= ans.next;
//        }
//        else{
//        ans.next=list2;
//        list2=list2.next;
//        ans=ans.next;
//        }
//        }
//        if(list1==null){
//        ans.next=list2;
//        }
//        else{
//        ans.next=list1;
//        }
//        return dummy.next;
