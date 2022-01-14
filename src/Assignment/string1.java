package Assignment;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class string1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        for(int i=0; i<N; i++){
            String str = sc.next();
            lengthOftheLongestStr(str);
        }
    }
    public static void lengthOftheLongestStr(String S){
        int l = 0;
        int r = 0;
        Set<Character> seen = new HashSet<>();
        int max = 0;

        while(r < S.length()){
            char c = S.charAt(r);
            if(seen.add(c)){
                max = Math.max(max, r-l+1);
                r++;
            }else{
                while (S.charAt(l)!=c){
                    seen.remove(S.charAt(l));
                    l++;
                }
                seen.remove(c);
                l++;
            }
        }
        System.out.println(max);
    }
}
