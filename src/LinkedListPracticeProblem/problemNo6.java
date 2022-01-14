package LinkedListPracticeProblem;

import org.w3c.dom.Node;

//Given a Linked list of N integers, the task is to find the sum of factorials of each prime element in the list.
public class problemNo6 {
    private Node head;
    private Node tail;
    private int size;
    public  int getSize(){
        return this.size;
    }
    public class Node{
        int data;
        Node next;
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
    public Node addFirst(int data){
        if (size == 0){
            Node n = new Node(data,null);
            this.head = n;
            this.tail = n;
            this.size++;
            return n;
        }
        Node n = new Node(data,head);
        this.head = n;
        this.size++;
        return n;
    }
    public Node addLast(int data){
        if (size == 0){
            Node n = new Node(data, null);
            this.tail = n;
            this.head=n;
            this.size++;
            return n;
        }
        Node n = new Node(data,null);
        this.tail.next = n;
        this.tail = n;
        this.size++;
        return n;
    }
    public void prime(Node head){
        Node temp = head;
        int primeSum = 0;
        while (temp!=tail){
            if (temp.data == 1){
                primeSum = primeSum+ temp.data;
            }
            else if (temp.data == 2){
                primeSum = primeSum+temp.data;
            }
            else if (temp.data == 3){
                primeSum = primeSum + temp.data;
            }
        }
    }
    public  void printFunction(){
        Node temp = this.head;
        while (temp != tail){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(tail.data);
    }

    public static void main(String[] args) {
        problemNo6 list = new problemNo6();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6 );
        list.printFunction();
    }
}
