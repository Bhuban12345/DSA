package StringQuestionPractice;
import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        String reverse = "";
        for (int i=0; i<arr.length; i++){
            String word = arr[i];
            String reWord = "";
            int l = word.length()-word.length();
            int r = word.length()-1;
            while (l <= r){
                char temp = word.charAt(l);
                char temp1 = word.charAt(r);
                reWord = reWord+ temp1;
                r--;
            }
            reverse = reverse+reWord+" ";
        }
        System.out.println(reverse);
    }
}
