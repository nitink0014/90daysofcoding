public class ImplementationOfLl {

    public static class Node {
        int data;
        Node next;


        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static class LinkedList {
        Node head = null;
        Node tail = null;
        int size =0;
        void insertAtBegining(int data){
            Node temp = new Node(data);
            if(head==null){
                head = tail = temp;
            }else {
                temp.next = head;
                head = temp;
            }
            size++;
        }


        //insert at end
        void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head==null){
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
        }

        void display(){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }

        }


    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAtBegining(1);
        ll.display();
    }

}
