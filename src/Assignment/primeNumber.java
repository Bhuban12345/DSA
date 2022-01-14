package Assignment;

import java.util.Scanner;

//Given a number n find the number of prime numbers less than equal to that number.
public class primeNumber {
    public static int printPrime(int n){
        int result = 0;
        for (int i=2; i<n; i++){
            if (isPrime(i)){
                result = i;
            }
        }
        return 0;
    }
    public static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        for (int i=2; i<n; i++){
            if (n % 2 == 0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
}
