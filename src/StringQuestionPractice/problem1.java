package StringQuestionPractice;
import java.util.Scanner;
//Write a program to check if a given string is a Palindrome.
//A palindrome reads same from front and back e.g.- aba, ccaacc, mom, etc.
public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
       int l = 0;
       boolean isPalindrome = true;
       int r = str.length()-1;
       while (l < r){
           if(str.charAt(l) == str.charAt(r)){
               l++;
               r--;
           }else{
               isPalindrome = false;
               break;
           }
       }
       if (isPalindrome){
           System.out.println("Given string is palindrome");
       }else{
           System.out.println("Given string not palindrome");
       }
    }

}
