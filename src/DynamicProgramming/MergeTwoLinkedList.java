package DynamicProgramming;

import org.w3c.dom.Node;

//Write a function that takes two lists, each of which is sorted in increasing order, and merges the
// two into a single list in increasing order, and returns it.
public class MergeTwoLinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
        Node(){

        }
    }
    //Using the Dummy Node Method.
    public static Node sortMerge(Node a,Node b){
        Node dummy = new Node();
        Node tail = dummy;
        while (true){
            if (a == null){
                tail.next = b;
                break;
            }
            else if (b == null){
                tail.next = a;
                break;
            }
            if (a.data <= b.data){
                if (a != null){
                    Node newNode = a;
                    a = a.next;
                    newNode.next = tail.next;
                    tail.next = newNode;
                }
            }
            else {
                if (b != null){
                    Node newNode = b;
                    b = b.next;
                    newNode.next = tail.next;
                    tail.next = newNode;
                }
            }
            tail = tail.next;
        }
        return dummy.next;
    }
    //Using the Recursive Method.
    public static Node sortRecursive(Node a, Node b){
        if (a==null){
            return b;
        }
        else if (b == null){
            return a;
        }
        Node result;
        if (a.data <= b.data){
            result = a;
            result.next = sortRecursive(a.next,b);
        }
        else{
            result = b;
            result.next = sortRecursive(a,b.next);
        }
        return result;
    }
    public static void printList(String smg,Node head){
        System.out.println(smg);
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"--->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};
        Node a = null;
        Node b = null;
        for (int i= arr1.length-1; i>=0; i--){
            a = new Node(arr1[i],a);
        }
        for (int i=arr2.length-1; i>=0; i--){
            b = new Node(arr2[i],b);
        }
        printList("The first List",a);
        printList("The second List",b);
        //Node head = sortMerge(a,b);
       // printList("After the merge: ",head);
        Node head = sortRecursive(a,b);
        printList("After Recursive sort: ",head);

    }
}
