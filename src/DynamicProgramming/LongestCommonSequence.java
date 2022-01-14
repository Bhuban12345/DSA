package DynamicProgramming;

public class LongestCommonSequence {
    public static void main(String[] args) {
        String s1 = "acadb";
        String s2 = "cbda";
        int m = s1.length();
        int n = s2.length();
        lcs(s1,s2,m,n);
    }
   // public  class longestCommonSeq{
        public static void lcs(String s1, String s2, int m, int n){
            int[][] table = new int[m+1][n+1];
            for (int i=0; i<=m; i++){
                for (int j=0; j<=n; j++){
                    if (i==0 || j==0){
                        table[i][j] = 0;
                    }
                    else if (s1.charAt(i-1) == s2.charAt(j-1)){
                        table[i][j] = table[i-1][j-1]+1;
                    }
                    else{
                        table[i][j] = Math.max(table[i][j-1], table[i-1][j]);
                    }
                }
            }
            int index = table[m][n];
            int temp = index;
            char[] lcs = new char[index+1];
            lcs[index] = '\0';
            int i=m, j=n;
            while (i > 0 && j > 0){
                if (s1.charAt(i-1) == s2.charAt(j-1)){
                    lcs[index-1] = s1.charAt(i-1);
                    i--;
                    j--;
                    index--;
                }
                else if (table[i-1][j] > table[i][j-1]){
                    i--;
                }
                else{
                    j--;
                }
            }
            for (int k=0; k<=temp; k++){
                System.out.print(lcs[k]);
                System.out.println(" ");
            }
        }

}
