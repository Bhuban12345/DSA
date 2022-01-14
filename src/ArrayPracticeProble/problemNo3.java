package ArrayPracticeProble;

import java.util.Scanner;

public class problemNo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        FindThirdLargest(arr, arr.length,3);
    }
    public static void FindThirdLargest(int[] arr,int n,int k){
        for (int i=0; i<n; i++){
            int minIdx = i;
            for (int j=i; j<n; j++){
                if (arr[minIdx] > arr[j]){
                    minIdx = j;
                }
                int temp = arr[minIdx];
                arr[minIdx] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println(arr[k]);
    }
}
