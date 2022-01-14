package ArrayPracticeProble;
//Write a program to reverse the array
public class problemNo1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        for(int x : arr){
            System.out.print(x);
        }
        reverseArray(arr,0,arr.length);
        printReverse(arr);
    }
    public static void reverseArray(int[] arr,int start, int end){
        if (start >= end){
            return;
        }
        int temp = 0;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr,start+1,end-1);
    }
    public static void printReverse(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
