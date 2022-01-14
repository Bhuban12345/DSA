package LinkedList;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int min = 0;
        Arrays.sort(arr);
        min = arr[0];
        max = arr[arr.length-1];
        System.out.println(min);
        System.out.println(max);

    }

}
