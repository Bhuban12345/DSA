package LinkedList;

import org.w3c.dom.Node;

public class LinkedList {
   private Node head;
   private Node tail;
   private int size;

   private class Node{
       int data;
       Node next;

       private Node(int data, Node next){
           this. data = data;
           this.next = next;
       }
   }
   public int getSize(){
       return this.size;
   }
   public Node addFirstPosition(int data){
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
   public Node addLastPosition(int data){
       if(size == 0){
           Node n = new Node(data, null);
           this.head = n;
           this.tail = n;
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
       if(position < 0 || position > size){
           return null;
       }
       Node temp = head;
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
   // TO get the node from the given LinkedList.
    public Node getNode(int position){
     if(position < 0 || position >size){
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
   //To delete the first position of the node.
    public Node deleteFirst(){
       if(size == 0){
           return null;
       }
       if(size == 1){
           Node temp = head;
           this.head = null;
           this.tail = null;
           this.size--;
           return temp;
       }
       Node temp = head;
       temp = this.head.next;
       this.head = null;
       this.head = temp;
       this.size--;
       return temp;
    }
    //To delete the last node of the linkedList.
    public Node deleteLast(){
       if(size == 0){
           return null;
       }
       if(size == 1){
           Node temp = head;
           this.head = null;
           this.tail = null;
           this.size--;
           return temp;
       }
       Node temp = this.head;
       while (temp != tail){
           temp = temp.next;
       }
       Node n = temp;
       this.tail = null;
       this.tail = n;
       return n;
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
        LinkedList list = new LinkedList();
        list.addFirstPosition(1);
        list.addLastPosition(2);
        list.addLastPosition(3);
        list.addLastPosition(4);
        list.addLastPosition(5);
        list.addLastPosition(6);
        list.addLastPosition(7);
        list.addLastPosition(8);
        list.addLastPosition(9);
       // list.deleteFirst();
        list.deleteLast();
        list.display();
        list.getNode(3);
    }
}
