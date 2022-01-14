package recursionPracticeProblem;
//write a program to find the Fibonacci series of n.
public class problemNo1 {
    public static int  fibonacci(int n){
        if (n == 0){
            return 0;
        }if (n == 1 || n == 2){
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        int n = 100;
        for (int i=0; i<n; i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
}
