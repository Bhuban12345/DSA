package LinkedListPracticeProblem;

import org.w3c.dom.Node;
// Write a programming to find out the Kth node from the tail.
public class problemNo3 {
    private Node head;
    private Node tail;
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
        Node n = new Node(data, head);
        this.head = n;
        this.size++;
        return n;
    }
    public Node addLast(int data){
        if (size == 0){
            Node n = new Node(data,null);
            this.head = n;
            this.tail = n;
            this.size++;
            return n;
        }
        Node n = new Node(data,null);
        this.tail.next = n;
        this.tail = n;
        return n;
    }
    public int getCount(){
        int count = 0;
        if(size == 0){
            count++;
            return count;
        }
        Node temp = head;
        while (temp != tail){
            count++;
            temp = temp.next;
        }
        return (count+1);
    }
    public void solution(int position){
        if (position == 0){
            System.out.println(head.data);
        }
        else if (position == size-1){
            System.out.println(tail.data);
        }
        int RtoLPosition = getCount() - position;
        Node temp = head;
        int i = 0;
        while (i < RtoLPosition){
            temp = temp.next;
            i++;
        }
        System.out.println(temp.data);
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
        problemNo3 list = new problemNo3();
        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.addLast(70);
        list.addLast(80);
        list.addLast(90);
        list.display();
        list.solution(8);
    }
}
