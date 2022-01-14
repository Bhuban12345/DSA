package LinkedListPracticeProblem;
//Insert a node to its correct sorted position in a sorted linked list
public class problemNo9 {
    public static void main(String[] args) {
        int[] key = {1,2,3,4,5,6,7};
        Node head = null;
        for (int i=key.length-1; i>=0; i--){
            head = new Node(key[i],head);
        }
        printList(head);
        InsertSorted(head,new Node(9));
        head = InsertSorted(head,new Node(8));
        head = InsertSorted(head, new Node(10));
        printList(head);
    }
    public static void printList(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"--->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static Node InsertSorted(Node head, Node newNode){
        if (head == null || newNode.data < head.data){
            newNode.next = head;
            head = newNode;
            return head;
        }
        Node current = head;
        while (current.next != null && current.next.data < newNode.data){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        return head;
    }

}
class Node{
    int data;
    Node next;
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
    Node (int data){
        this.data = data;
    }
}
