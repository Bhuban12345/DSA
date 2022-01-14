package LinkedListPracticeProblem;

import org.w3c.dom.Node;

public class Mock {
    private Node head;
    private Node tail;
    private int size;
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public int GetSize(){
        return this.size;
    }
    public  Node addFirst(int data){
        if (size == 0){
            Node n = new Node(data);
            this.head = n;
            this.tail = n;
            this.size++;
            return n;
        }
        else{
            Node n = new Node(data);
            this.head = n;
            this.size++;
            return n;
        }
    }
    public Node addLast(int data){
        if (size == 0){
            Node n = new Node(data);
            this.head = n;
            this.tail = n;
            this.size++;
            return n;
        }else {
            Node n = new Node(data);
            this.tail.next = n;
            this.tail = n;
            this.size++;
            return n;
        }
    }
    public void display(){
        Node temp = head;
        while (temp != tail){
            System.out.print(temp.data+"-");
            temp = temp.next;
        }
        System.out.println(tail.data);
    }

    public static void main(String[] args) {
        Mock list = new Mock();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.display();
    }
}
