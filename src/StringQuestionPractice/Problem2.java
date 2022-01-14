package StringQuestionPractice;
import java.util.*;
//Write a program to find out the largest and smallest word in the string "This is an umbrella".
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] original = str.split(" ");
        //int count ;
        int max = 0;
        int min = 0;
        for (int i = 0; i<original.length; i++){
            String word = original[i];
           int  count = 0;
            for (int j = 0; j<word.length(); j++){
                count++;
            }
            if (count > min){
                min = count;
                max = min;
            }
            else if(count > max){
                max = count;
            }
            count = 0;
        }
        System.out.println("max"+"="+max+" "+"min"+"="+min);
    }
}
