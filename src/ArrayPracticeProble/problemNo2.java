package ArrayPracticeProble;

import java.util.Scanner;

//Given a random set of numbers, Print them in sorted order.
public class problemNo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        selectionSort(arr,arr.length);
    }
    public static void selectionSort(int[] arr, int n){
        for (int i =0; i<n; i++){
            int minIdx = i;
            for (int j=i; j<n; j++){
                if (arr[i] < arr[j]) {
                    minIdx = j;
                }
                    int temp = arr[minIdx];
                    arr[minIdx] = arr[j];
                    arr[j] = temp;
            }
        }
        for (int x:arr){
            System.out.print(x+" ");
        }
    }
}
