package StackLecture;

import java.util.Iterator;
import java.util.Stack;

public class LectureNo1 {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        boolean size = stk.isEmpty();
        System.out.println("Before push stack items are:"+size);
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        stk.push(6);
        stk.push(7);
        stk.push(8);
        stk.push(9);
        System.out.println("An item of stack are:"+stk);
        size = stk.isEmpty();
        System.out.println("After pushed item the value of stack :"+size);
        int peekElement = stk.peek();
        System.out.println("The peek element is:"+peekElement);
        System.out.println(stk);
        stk.pop();
        System.out.println(stk);
        //To search the location of the any element.
        int location = stk.search(2);
        System.out.println("The location of the element 2 is:"+location);
        // To find the total element of the stack.
        int x = stk.size();
        System.out.println("The total element of the given stack is:"+x);
        //Iterate the stack element. By iterator method.
        Iterator item = stk.iterator();
        while (item.hasNext()){
            Object element = item.next();
            System.out.print(element+" ");
        }
        //Iterate by forEach.
        stk.forEach(n->{
            System.out.print(n+" ");
        });
    }
}
