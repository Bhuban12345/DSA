package LinkedListPracticeProblem;
//Rearrange linked list in increasing order (Sort linked list)
public class problemNo10 {
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
    public static Node sortList(Node head, Node newNode){
        Node dummy = new Node();
        Node current = dummy;
        dummy.next = head;
        while (current != null || current.next.data < newNode.data){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        return dummy.next;
    }
    public static Node collection(Node head){
        Node result = null;
        Node current = head;
        Node next;
        while (current != null){
            next = current.next;
            result = sortList(result,current);
            current = next;
        }
        return result;
    }
    public static void printList(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,8,6,11,15};
        Node head = null;
        for (int i=arr.length-1; i>=0; i--){
            head = new Node(arr[i],head);
        }
        printList(head);
       // sort("sorted list is:",head)
        collection(head);
    }
}

