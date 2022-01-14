package Assignment;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        for (int i=0; i<N;i++){
            for (int j = 0; j<N; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        AntiClock(arr,N,N);
    }
    public static void AntiClock(int[][] arr,int N1,int N2){
        int i,k=0,l=0;
        int count = 0;
        int total = N1*N2;
        while (k < N1 && l < N2){
            if (count == total){
                break;
            }
            for (i=k; i<N1; i++){
                System.out.print(arr[i][l]+" ");// 1 5 9 13 count=4
                count++;
            }
            l++;
            if (count == total){
                break;
            }
            for (i=l; i<N1; i++){
                System.out.print(arr[N1-1][i]+" "); // 14 15 16 count=4+3=7
                count++;
            }
            N1--;
            if (count == total){
                break;
            }
            if (k < N1){
                for (i=N1-1; i>=k; i--){
                    System.out.print(arr[i][N2-1]+" "); //12 8 4 count=7+3=10.
                    count++;
                }
                N2--;
            }
            if (count == total){
                break;
            }
            if (l < N2){
                for (i=N2-1; i>=l; i--){
                    System.out.print(arr[k][i]+" ");
                    count++;
                }
                k++;
            }

        }
    }
}
