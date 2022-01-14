package ArrayPracticeProble;
//Given an array A[], write a function that segregates even and odd numbers.
// The functions should put all even numbers first, and then odd numbers.
import java.util.Scanner;

public class problemNo5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 7, 5, 6, 9};
        segregateOddEven(arr,arr.length);
    }
    public static void segregateOddEven(int[] arr, int n){
        int l = 0; int r = n-1;
        while (l < r){
            while (arr[l]%2 == 0 && l < r){
                l++;
            }
            while (arr[r]%2 == 1 && l<r){
                r--;
            }
            if (l < r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        for (int x:arr){
            System.out.print(x+" ");
        }
    }
}
