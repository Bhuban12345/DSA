package sorttingPracticeProblem;
import java.util.Scanner;
// sort the 0s,1s and 2s . first should be the 0s and 1s and the 2s
public class problemNo3 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2,2, 1, 0, 0};
        func(arr, arr.length);
        printFunc(arr);
    }
    public static void func(int[] arr, int size){
        int low = 0;
        int high = size-1;
        int mid = 0;
        int temp = 0;
        while (mid <= high){
            switch(arr[mid]){
                case 0: {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }
    public static void printFunc(int[] arr){
        int n = arr.length;
        for (int i =0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
