//To add element by all method and calculate there length of the LinkedList.
package LinkedList;

import org.w3c.dom.Node;

public class LinkedList2 {
    private Node head;
    private Node tail;
    private int size;

    private class Node{
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    public  int size(){
        return this.size;
    }
    public Node addFirst(int data){
        if(size == 0){
            Node n = new Node(data,null);
            this.head = n;
            this.tail = n;
            this.size++;
            return n;
        }
        Node n = new Node(data,head);
        this.head = n;
        this.size++;
        return  n;
    }
    public Node addLast(int data){
        if(size == 0){
            Node n = new Node(data,null);
            head.next = n;
            tail.next = n;
            this.size++;
            return n;
        }
        Node n = new Node(data, null);
        this.tail.next = n;
        this.tail = n;
        this.size++;
        return n;
    }
    public Node addAnyPosition(int data, int position){
        if(position == 0){
            return  addFirst(data);
        }
        if(position > size || position < 0){

            return null;
        }
        Node temp = this.head;
        int i = 0;
        while (i < position-1){
            temp = temp.next;
            i++;
        }
        Node currentNode = temp.next;
        Node n = new Node(data, temp.next);
        temp.next = n;
        n.next = currentNode;
        this.size++;
        return n;
    }
    public int getCount(){
     Node temp = head;
     int count = 0;
     while (temp != null){
         count++;
         temp = temp.next;
     }
     return count;
    }
    public void display(){
        if(size == 0){
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"-");
            this.size++;
            temp = temp.next;
        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        LinkedList2 list2 = new LinkedList2();
        list2.display();
        list2.size();
        list2.addFirst(1);
        list2.addLast(7);
       // list2.display();
       // list2.size();
        list2.addAnyPosition(2,1);
        list2.addAnyPosition(3,2);
        list2.addAnyPosition(4,3);
        list2.addAnyPosition(5,4);
        list2.addAnyPosition(6,5);
        list2.display();
        System.out.println(list2.getCount());
        list2.addFirst(8);
        list2.addFirst(9);
        list2.display();
    }
}
