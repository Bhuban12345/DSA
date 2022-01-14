package searchingPracticeProblem;
/*You are given a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in the list. One of the integers is missing in the list. Write an efficient code to find the missing integer.
        Example:

        Input: arr[] = {1, 2, 4, 6, 3, 7, 8}
        Output: 5*/
public class problemNo1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 3, 7, 8};
        missingFunction(arr,8);
    }
    public static void missingFunction(int[] arr, int n){
        int total = 0;
        for (int i=1; i<n+1; i++){
            total = total+i;
        }
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(total-sum);
    }
}
