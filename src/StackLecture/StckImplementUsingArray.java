package StackLecture;

import java.util.Scanner;

public class StckImplementUsingArray {
    private int ch;
    int element,Maxsize,top;
    int[] stk;
    public void stack(int maxsize){
        this.Maxsize = maxsize;
        stk = new int[Maxsize];
        top = -1;
    }
    public void pushElement(int element){
        if (top >= Maxsize){
            System.out.println("StackOverFlow");
        }
        try{
            stk[++top] = element;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.print(e+" ");
        }
    }
    public int popElement(){
        if (top == -1){
            System.out.println("Stack underflow");
            return (-1);
        }
        return (stk[top--]);
    }
    public void display(){
        int i = 0;
        for (i = 0; i<=Maxsize; i++){
            System.out.print(stk[i]+" ");
        }
    }

    public static void main(String[] args) {
        StckImplementUsingArray obj = new StckImplementUsingArray();
        obj.stack(5);
        obj.pushElement(1);
        obj.pushElement(2);
        obj.pushElement(3);
        obj.pushElement(4);
        obj.pushElement(5);
        obj.display();
    }
}
