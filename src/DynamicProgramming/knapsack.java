package DynamicProgramming;

import java.util.Scanner;
//Knapsack problem using the Recursive Method.
public class knapsack {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the testcase");
        int testcase = sc.nextInt();
        for (int k=0; k<testcase; k++){
            System.out.println("Enter the number if item");
            int ni = sc.nextInt();
            System.out.println("Enter the capacity");
            int capacity = sc.nextInt();
            int[] item = new int[ni];
            System.out.println("Enter the item");
            for (int i=0; i<ni; i++){
                item[i] = sc.nextInt();
            }
            int[] wt = new int[ni];
            System.out.println("Enter the weight");
            for (int i=0; i<ni; i++){
                wt[i] = sc.nextInt();
            }
            int result = solveKnapsack(item,wt,capacity,ni);
            System.out.println(result);
        }
    }
    public static int solveKnapsack(int[] item, int[] wt, int capacity,int n){
        if (capacity == 0 || n == 0){
            return 0;
        }
        if (wt[n-1] <= capacity){
            return Math.max(item[n-1]+solveKnapsack(item,wt,capacity-wt[n-1],n-1),solveKnapsack(item,wt,capacity,n-1));
        }
        if (wt[n-1] > capacity){
            return solveKnapsack(item,wt,capacity,n-1);
        }
        return 0;
    }
}
