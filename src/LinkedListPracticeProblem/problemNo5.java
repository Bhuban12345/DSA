package LinkedListPracticeProblem;

import org.w3c.dom.Node;

//write a programming to check the given linkedList is cycle or not.
public class problemNo5 {
    private Node head;
    private  Node tail;
    private int size;

    private class Node{
        int data;
        Node next;
        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
    public int getSize(){
        return this.size;
    }
    public Node addFirst(int data){
        if (size == 0){
            Node n = new Node(data, null);
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
            this.head = n;
            this.tail = n;
            this.size++;
            return n;
        }
        Node n = new Node(data,null);
        this.tail.next = n;
        this.tail = n;
        this.size++;
        return n;
    }
    public Node formingCycle(int position){
        if (position == 0){
            this.tail.next = head;
        }
        int i = 0;
        Node temp = head;
        while (i < position){
            temp = temp.next;
            i++;
        }
        this.tail.next = temp;
        this.tail = temp;
        return temp;
    }
    public void display(){
        Node temp = head;
        while (temp != tail){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(tail.data);
    }

    public static void main(String[] args) {
        problemNo5 list = new problemNo5();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.display();
        list.formingCycle(3);
        list.display();
        list.getSize();
    }
}
