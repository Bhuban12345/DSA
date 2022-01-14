package LinkedListPracticeProblem;

import org.w3c.dom.Node;

//Write a function that moves the last element to the front in a given Singly Linked List.
// For example, if the given Linked List is 1->2->3->4->5, then the function
// should change the list to 5->1->2->3->4.
public class problemNo7 {
    private Node head;
    private Node tail;
    private int size;
    private class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public int getSize(){
        return this.size;
    }
    public Node addFirst(int data){
        if (size == 0){
            Node n = new Node(data);
            this.head = n;
            this.tail = n;
            this.size++;
            return n;
        }
        Node n = new Node(data);
        this.head=n;
        this.size++;
        return n;
    }
    public Node addLast(int data){
        if (size == 0){
            Node n = new Node(data);
            this.head = n;
            this.tail = n;
            this.size++;
            return n;
        }
        Node n = new Node(data);
        this.tail.next = n;
        this.tail = n;
        this.size++;
        return n;
    }
    public void displayNode(){
        Node temp = head;
        while (temp != tail){
            System.out.print(temp.data+"-");
            temp = temp.next;
        }
        System.out.print(tail.data);
        System.out.println();
    }
    public void firstToLast(){
       if (head == tail || head.next == null){
           return;
       }
       Node secLast = null;
       Node last = head;
       Node first = head;
       Node second = this.head.next;
       while (last != tail){
           secLast = last;
           last = last.next;
       }
       secLast.next=first;
       this.tail=secLast;
       last.next = second;
      this.head = last;
    }

    public static void main(String[] args) {
        problemNo7 list = new problemNo7();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.displayNode();
        list.firstToLast();
        list.displayNode();
    }
}
