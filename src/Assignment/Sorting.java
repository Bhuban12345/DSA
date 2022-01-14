package Assignment;
import java.util.Arrays;
import java.util.Scanner;
public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
       for(int i=0; i<N; i++){
           if(arr[i]%2 != 0){
               arr[i] = -1*arr[i];
           }
       }
       Arrays.sort(arr);
       for(int i=0; i<N; i++){
           if(arr[i] < 0){
               arr[i] *= -1;
           }
       }
       for(int x:arr){
           System.out.print(x+" ");
       }
    }
}
