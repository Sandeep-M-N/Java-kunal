public class InterviewQuestions {
//    public boolean hascycle(ListNode head){
//        ListNode fast  = head;
//        ListNode slow = head;
//        while(fast!=null && fast.next!=null){
//            fast=fast.next.next;
//            slow=slow.next;
//            if(fast==slow){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public int lengthCycle(ListNode head) {
//
//        ListNode fast = head;
//        ListNode slow = head;
//
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//            if (fast == slow) {
//                // calculate the length
//                ListNode temp = slow;
//                int length = 0;
//                do {
//                    temp = temp.next;
//                    length++;
//                } while (temp != slow);
//                return length;
//            }
//        }
//        return 0;
//    }
//
//    public ListNode detectcycle(ListNode head){
//        int length=0;
//        ListNode fast = head;
//        ListNode slow  = head;
//        while(fast!=null && fast.next!=null){
//            fast=fast.next.next;
//            slow = slow.next;
//            if(fast==slow){
//                lengthCycle(slow);
//                break;
//            }
//        }
//        if(length==0){
//            return  null;
//        }
//        ListNode f = head;
//        ListNode s = head;
//        while(length>0){
//            s=s.next;
//            length--;
//        }
//        while(f!=s){
//            f=f.next;
//            s=s.next;
//        }
//        return s;
//    }
//
//    public boolean ishappy(int n){
//        int slow=n;
//        int fast=n;
//        do{
//            slow=findsquare(slow);
//            fast=findsquare(findsquare(fast));
//        }while(slow!=fast);
//        if(slow==1){
//            return true;
//        }
//        return false;
//
//
//    }
//
//    public ListNode middleNode(ListNode head) {
//        ListNode s = head;
//        ListNode f = head;
//
//        while (f != null && f.next != null) {
//            s = s.next;
//            f = f.next.next;
//        }
//        return s;
//    }
//
//    public int findsquare(int number){
//        int ans=0;
//        while(number>0){
//            int rem = number%10;
//            ans+=rem * rem;
//            number/=10;
//        }
//        return ans;
//    }
//
//    // reverse linnked list II Leetcode-92
//    public ListNode reverseBetween(ListNode head, int left, int right) {
//        if (left==right) {
//            return head;
//        }
//
//        ListNode prev = null;
//        ListNode current = head;
//        for (int i = 0; current!=null && i < left - 1; i++) {
//            prev = current;
//            current = current.next;
//
//
//        }
//        ListNode last = prev;
//        ListNode newend = current;
//
//
//        ListNode next = current.next;
//        for (int i = 0; current!=null && i < right - left + 1; i++) {
//            current.next = prev;
//            prev = current;
//            current = next;
//            if (next!=null) {
//                next = next.next;
//
//            }
//        }
//        if (last!=null) {
//            last.next = prev;
//        } else {
//            head = prev;
//        }
//        newend.next = current;
//        return head;
//    }
//    public boolean isPalindrome(ListNode head) {
//
//
//        ListNode mid = middleNode( head);
//        ListNode secondhead=reverseList(mid);
//        ListNode rereverse=secondhead;
//
//        while(head!=null && secondhead!=null){
//            if(head.val!=secondhead.val){
//                break;
//            }
//            head=head.next;
//            secondhead=secondhead.next;
//
//
//        }
//        reverseList(rereverse);
//        if(head==null || secondhead==null){
//            return true;
//        }
//        return false;
//
//
//    }
//    public ListNode  middleNode(ListNode head) {
//        ListNode s = head;
//        ListNode f = head;
//
//        while (f != null && f.next != null) {
//            s = s.next;
//            f = f.next.next;
//        }
//        return s;
//    }
//    public ListNode reverseList(ListNode head) {
//        if(head==null){
//            return head;
//        }
//        ListNode prev=null;
//        ListNode present = head;
//        ListNode next=present.next;
//        while(present!=null){
//            present.next = prev;
//            prev=present;
//            present=next;
//            if(next!=null){
//                next=next.next;
//            }
//        }
//        head=prev;
//        return head;
//
//
//    }
//
//
//    public void reorderList(ListNode head) {
//        if(head == null || head.next==null){
//            return;
//        }
//        ListNode mid=middleNode(head);
//        ListNode hs= reverseList(mid);
//        ListNode hf=head;
//        while(hf!=null && hs!=null){
//            ListNode temp = hf.next;
//            hf.next=hs;
//            hf=temp;
//
//            temp=hs.next;
//            hs.next=hf;
//            hs=temp;
//        }
//        if(hf!=null){
//            hf.next=null;
//        }
//
//
//
//    }
//    public ListNode middleNode(ListNode head) {
//        ListNode s = head;
//        ListNode f = head;
//
//        while (f != null && f.next != null) {
//            s = s.next;
//            f = f.next.next;
//        }
//        return s;
//    }
//    public ListNode reverseList(ListNode head) {
//        if (head == null) {
//            return head;
//        }
//        ListNode prev = null;
//        ListNode present = head;
//        ListNode next = present.next;
//
//        while (present != null) {
//            present.next = prev;
//            prev = present;
//            present = next;
//            if (next != null) {
//                next = next.next;
//            }
//        }
//        return prev;
//    }
//
//    public ListNode rotateRight(ListNode head, int k) {
//        if (k <= 0 || head==null || head.next==null) {
//            return head;
//        }
//        ListNode last = head;
//        int length = 1;
//        while (last.next!=null) {
//            last = last.next;
//            length++;
//
//        }
//        last.next = head;
//        int rotations = k % length;
//        int skip = length - rotations;
//        ListNode newlast = head;
//        for (int i = 0; i < skip - 1; i++) {
//            newlast = newlast.next;
//        }
//        head = newlast.next;
//        newlast.next = null;
//        return head;
//    }
//
//
//    class ListNode {
//        int val;
//        ListNode next;
//
//        public ListNode() {
//        }
//
//        ListNode(int x) {
//            val = x;
//            next = null;
//        }
//    }
}
