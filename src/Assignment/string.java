package Assignment;
import java.util.HashSet;
import java.util.Scanner;
public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; i++) {
            String str = sc.next();
            longest(str);
        }
        //longest(str);

    }
    public static void longest(String str){
        HashSet<Character> set = new HashSet<>();
        String longestOverall = "";
        String longest = "";

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(set.contains(c)){
                longest = "";
                set.clear();
            }
            longest += c;
            set.add(c);

            if(longest.length() > longestOverall.length()){
                longestOverall = longest;
            }
        }
        System.out.println(longestOverall.length());
    }
}
