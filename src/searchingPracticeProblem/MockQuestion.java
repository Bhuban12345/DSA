package searchingPracticeProblem;

public class MockQuestion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7 ,8, 9};
        int element = 7;
        System.out.println(findingElement(arr, element));

    }
    public static int findingElement(int[] arr, int element){
        int l = 0;
        int r = arr.length-1;
        while (l < r){
            int mid = (l + r)/2;
            if (arr[mid] == element){
                return arr[mid];
            }
            if (arr[mid] > element){
                r = mid - 1;
            }
            else{
                l = mid +1;
            }
        }
        return -1;
    }
}
