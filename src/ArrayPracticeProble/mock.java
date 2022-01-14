package ArrayPracticeProble;

import java.util.Scanner;

public class mock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[][] = new int[N][N];
        for (int i =0; i<N; i++){
            for (int j = 0; j<N; j++){
                arr[i][j] = sc.nextInt();
            }
        }
       // FindingX(arr,5,arr.length);
        findingX(arr,N,5);
    }

    public static void findingX(int[][] arr,int N,int x){
        int n = N;
        int[] arr1 = new int[n];
        int i = 0;
        int j = 0;
        for (int k = 0; k<n; k++){
            arr1[k] = arr[i][j];
            k++;
            i++;
        }
        for (int y:arr1){
            System.out.print(y+" ");
        }
        int l = 0;
        int r = arr1.length;
        while (l < r){
            if (arr1[l] == x){
                System.out.println(arr1[l]);
            }
            l++;
        }
        j = 1;
        int[] arr2 = new int[n];
        for (int k =0; k<n; k++){
            arr2[k] = arr[i][j];
            k++;
            j++;
        }
        for (int y:arr2){
            System.out.print(y+" ");
        }
        r = arr2.length;
        while (l < r){
            if (arr2[l] == x){
                System.out.println(arr2[l]);
            }
            l++;
        }
        j = 2;
        int[] arr3 = new int[n];
        for (int k=0; k<n; k++){
           // System.out.println("df");
            arr3[k] = arr[i][j];
            k++;
            i++;
        }
        r = arr3.length;
        while (l < r){
            if (arr3[l] == x){
                System.out.println(arr3[l]);
            }
            l++;
        }
        System.out.println();
    }
}
