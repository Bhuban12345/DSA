package GreedyAlgorithm;

import java.util.Scanner;

//Given an array, A of length N, find the contiguous subarray within A which has the largest sum.
public class maxSumOfArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of testcase");
        int testcase = sc.nextInt();
        for (int t=0; t<testcase; t++){
            System.out.println("Enter the size of array:");
            int N = sc.nextInt();
            int[] arr = new int[N];
            System.out.println("Enter the element of the array:");
            for(int i=0; i<N; i++){
                arr[i] = sc.nextInt();
            }
            int maxSum = 0;
            int currentSum = 0;
            for (int i=0; i<N; i++){
                currentSum = currentSum+arr[i];
                if (currentSum > maxSum){
                    maxSum = currentSum;
                }
                if (currentSum < 0){
                    currentSum = 0;
                }
            }
            System.out.println(maxSum);
        }
    }
}
