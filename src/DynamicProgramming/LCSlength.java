package DynamicProgramming;

public class LCSlength {
    public static void main(String[] args) {
        String x = "ABCBDAB";
        String y = "BDCABA";
        int m = x.length();
        int n = y.length();
        int length = length(x,y,m,n);
        System.out.println("The LCS is: "+length);
    }
    public static int length(String x,String y, int m,int n){
        if (m==0 || n==0){
            return 0;
        }
        if (x.charAt(m-1) == y.charAt(n-1)){
            return length(x,y,m-1,n-1) +1;
        }
        return  Integer.max(length(x,y,m,n-1),length(x,y,m-1,n));
    }
}
