//5. Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
//Test Data:
//Input first number: 25
//Input second number: 5
//Expected Output :
//25 x 5 = 125
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the first number a");
        int a = sc.nextInt();
        System.out.println("Entre the second number b");
        int b = sc.nextInt();
        int multiple;
        multiple=a*b;
        System.out.println("The multiple of two input number is:" +multiple);
    }
}
