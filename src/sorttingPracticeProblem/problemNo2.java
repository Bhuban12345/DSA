package sorttingPracticeProblem;
/*A number is lucky if all digits of the number are different. How to check if a given number is lucky or not.
        Examples:
        Input: n = 983
        Output: true*/
import java.util.Scanner;
public class problemNo2 {
    public static void main(String[] args) {
        int arr[] = {1291, 897, 4566, 1232, 80, 700};
        int n = arr.length;
        for (int i=0; i<n; i++){
            if (isLucky(arr[i])){
                System.out.println("yes");
            }else{
                System.out.println("No");
            }
        }
    }
   public static boolean isLucky(int n){
        boolean[] arr = new boolean[10];
        for (int i=0; i<n; i++)
            arr[i] = false;

        while (n > 0){
            int digit = n % 10;
            if (arr[digit])
                return false;
            arr[digit] = true;
            n = n/10;
        }
        return true;
   }
}
