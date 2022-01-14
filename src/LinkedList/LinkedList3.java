package LinkedList;

import org.w3c.dom.Node;

public class LinkedList3 {
    private Node head;
    private Node tail;
    private int size;

    private class Node{
        int data;
        Node next;

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
    public int size(){
        return this.size;
    }
    //To add node at first position.
    public Node addFirst(int data){
        if(size == 0){
            Node n = new Node(data, null);
            this.head = n;
            this.tail = n;
            this.size++;
            return n;
        }
        Node n = new Node(data, head);
        this.head = n;
        this.size++;
        return n;
    }
    // To add node in last position.
    public Node addLast(int data){
        if(size == 0){
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
    // To add node in any position of the linkedList.
    public Node addAnyPosition(int data,int position){
        if(position < 0 || position > size){
            return null;
        }
        Node temp = this.head;
        int i = 0;
        while (i < position-1){
            temp = temp.next;
            i++;
        }
        Node currentNode = temp.next;
        Node n = new Node(data,temp.next);
        temp.next = n;
        n.next = currentNode;
        this.size++;
        return n;
    }
    public Node getNode(int position){
        if(position < 0 || position > size){
            return null;
        }
        if(position == 0){
            return this.head;
        }
        Node temp = head;
        int i = 0;
        while (i < position){
            temp = temp.next;
            i++;
        }
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
        LinkedList3 list3 = new LinkedList3();
        list3.addFirst(1);
        list3.addLast(4);
        //list3.display();
        list3.addAnyPosition(2,1);
        list3.addAnyPosition(3,2);
        list3.display();
        list3.getNode(0);
        list3.addFirst(0);
        list3.display();
    }
}
