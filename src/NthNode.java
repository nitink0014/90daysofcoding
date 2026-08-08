public class NthNode {

    public static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static Node deleteNthNode(Node head,int n) {
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            head = head.next;
            return head;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast=fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static Node getNthNode(Node head,int n){
        Node slow = head;
        Node fast = head;
        for(int i =1;i<=n;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;

    }


    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(10);
        Node c = new Node(14);
        Node d = new Node(12);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next =e;

        display(a);
//        Node res = getNthNode(a,3);
//        System.out.println(res.data);
        a=deleteNthNode(a,1);
        display(a);
    }
}
