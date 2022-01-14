package LinkedListPracticeProblem;
import org.w3c.dom.Node;

import java.util.Scanner;
//To find out the intersection of the two linkedList.
public class problemNo1 {
    private Node head1,head2;
    private Node tail1;
    private Node tail2;
    private int size1;
    private int size2;
    private class Node{
        int data;
        Node next;
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
    public int getSize1(){
        return this.size1;
    }
    public int getSize2(){
        return this.size2;
    }
    public Node addFirst1(int data){
        if(size1 == 0){
            Node n = new Node(data,null);
            this.head1 = n;
            this.tail1 = n;
            this.size1++;
            return n;
        }
        Node n = new Node(data,head1);
        this.head1 = n;
        this.size1++;
        return n;
    }
    public Node addFirst2(int data){
        if (size2 == 0){
            Node n = new Node(data, null);
            this.head2 = n;
            this.tail2 = n;
            this.size2++;
            return n;
        }
        Node n = new Node(data, head2);
        this.head2 = n;
        this.size2++;
        return n;
    }
    public Node addLast1(int data){
        if(size1 == 0){
            Node n = new Node(data, null);
            this.head1 = n;
            this.tail1 = n;
            this.size1++;
            return n;
        }
        Node n = new Node(data,null);
        this.tail1.next = n;
        this.tail1 = n;
        this.size1++;
        return n;
    }
    public Node addLast2(int data){
        if (size2 == 0){
            Node n = new Node(data,null);
            this.head2 = n;
            this.tail2 = n;
            this.size2++;
            return n;
        }
        Node n = new Node(data,head2);
        this.tail2.next = n;
        this.tail2 = n;
        this.size2++;
        return n;
    }
    public int  getCount1(){
        int count = 0;
        if (size1 == 0){
            count = 1;
            System.out.println(count);
        }
        Node temp = head1;
        while (temp != tail1){
            count++;
            temp = temp.next;
        }
        int length1 = count+1;
        return length1;
    }
    public int getCount2(){
        int count = 0;
        if (size2 == 0){
            count = 1;
            System.out.println(count);
        }
        Node temp = head2;
        while (temp != tail1){
            count++;
            temp = temp.next;
        }
        int length2 = count+1;
        return length2;
    }
    public void intersectionPoint(){
        int lengthDiff = Math.abs(getCount2() - getCount1());
        int i = 0;
        if(getCount1() > getCount2()){
            Node temp = head1;
            while (i < lengthDiff){
                temp = temp.next;
                i++;
            }
            this.head1 = temp;
            System.out.println(temp.data);
        }else{
            Node temp = head2;
            while (i < lengthDiff){
                temp = temp.next;
                i++;
            }
            this.head2 = temp;
            System.out.println(temp.data);
        }
    }
    public void display1(){

        Node temp = head1;
        while (temp != tail1){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(tail1.data);

    }

    public void display2(){
        Node temp = head2;
        while (temp!=tail2){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(tail2.data);
    }

    public static void main(String[] args) {
        problemNo1 list = new problemNo1();
        list.addFirst1(1);
        list.addLast1(2);
        list.addLast1(3);
        list.addLast1(4);
        list.addLast1(5);
        list.addLast1(6);
        list.addLast1(7);
        list.addLast1(8);
        list.addLast1(9);
        //list.display1();
       // list.getCount1();
        list.addFirst2(7);
        list.addLast2(8);
        list.addLast2(4);
        list.addLast2(5);
        list.addLast2(6);
        list.addLast2(7);
        list.addLast2(8);
        list.addLast2(9);
        // list.display2();
        list.intersectionPoint();
    }
}
