package DynamicProgramming;

public class LectureNo1 {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fib(n));
        System.out.println(fib1(n));

    } 
    // Top-Down approach.
    public static int fib(int n){
        if (n < 0){
            return -1;
        }if (n == 0){
            return 0;
        }if (n == 1){
            return 1;
        }
        int sum = fib(n-1)+fib(n-2);
        return sum;
    }
    //Bottom-Up Approach.
    public static int fib1(int n){
        int A[]=new int[n];
        A[0] = 0;
        A[1] = 1;
        for (int i=2; i<=n+1; i++){
            A[i] = A[i-1]+A[i-2];
            System.out.println(A[i]);
        }
        for (int i=0; i<n; i++){
            System.out.println(A[i]);
        }
        return A[A.length-1];
    }
}
