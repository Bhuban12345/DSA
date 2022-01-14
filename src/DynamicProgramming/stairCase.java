package DynamicProgramming;

public class stairCase {
    public static void main(String[] args) {
        int n = 4;
        int[] lookup = new int[n+1];
        int result = totalWay(n);
        System.out.println("Total number of ways: "+result);
        System.out.println("Total number of ways: "+tdTotalWay(n,lookup));
        System.out.println("The number of way:" + buTotalWay(n));
    }
    //Top down Method.
    public static int tdTotalWay(int n, int[] lookup){
        if (n < 0){
            return 0;
        }
        if (n == 0){
            return 1;
        }
        if (lookup[n] == 0){
            lookup[n] = tdTotalWay(n-1,lookup) + tdTotalWay(n-2,lookup) + tdTotalWay(n-3,lookup);
        }
        return lookup[n];
    }
    //Bottom up method.
    public static int buTotalWay(int n){
        if (n <= 2){
            return n;
        }
        int[] lookup = new int[n+1];
        lookup[0] = 1;
        lookup[1] = 1;
        lookup[2] = 2;
        for(int i=3;i<=n;i++){
            lookup[i] = lookup[i-1] + lookup[i-2] + lookup[i-3];
        }
        return lookup[n];
    }
    //recursive method.
    public static int totalWay(int n){
        if (n<0){
            return 0;
        }
        if (n == 0){
            return 1;
        }
        return totalWay(n-1)+totalWay(n-2)+totalWay(n-3);
    }
}
