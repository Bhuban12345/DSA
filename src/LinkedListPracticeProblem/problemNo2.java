package LinkedListPracticeProblem;

import org.w3c.dom.Node;

//Write the programming to separate the odd and even number of the LinkedList.
public class problemNo2 {
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
   public void solution(){
       Node evenStart = null;
       Node evenEnd = null;
       Node oddStart = null;
       Node oddEnd = null;
       Node original = head;

       while (original != null){
           int temp = original.data;
           if (temp % 2 == 0){
               if (evenStart == null){
                   evenStart = original;
                   evenEnd = evenStart;
               }else{
                   evenEnd.next = original;
                   evenEnd = evenEnd.next;
               }
           }else{
               if (oddStart == null){
                   oddStart = original;
                   oddEnd = oddStart;
               }else{
                   oddEnd.next = original;
                   oddEnd = oddEnd.next;
               }
           }
           original = original.next;
       }
       if (evenStart == null || oddStart == null){
           return;
       }else {
           evenEnd.next = oddStart;
           oddEnd.next = null;
           head = evenStart;
       }
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
        problemNo2 list = new problemNo2();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.display();
        list.solution();
        list.display();
    }
}
