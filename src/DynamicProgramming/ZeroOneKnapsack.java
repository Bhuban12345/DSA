package DynamicProgramming;

public class ZeroOneKnapsack {
    public static void main(String[] args) {
        int[] wt = {1,2,3};
        int[] val = {4, 5,1};
        System.out.println(knapsack(val,val,50,3));
        //System.out.println(knapsack1(wt,val,50,3));
    }
    public  static  int knapsack(int[] wt, int[] val, int c, int n){
        int[][] mat = new int[n+1][c+1];
        int i,j;
        for (i=0; i<=n; i++){
            for (j=0; j<=c; j++){
                if (i==0 || j==0){
                    mat[i][j] = 0;
                }else if (wt[i-1] <= j){
                    mat[i][j] = Math.   max(val[i-1]+mat[i-1][j-wt[i-1]],mat[i-1][j]);
                }else{
                    mat[i][j] = mat[i-1][j];
                }
            }
        }
        return mat[n][c];
    }
}
