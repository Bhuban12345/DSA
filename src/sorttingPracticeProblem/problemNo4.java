package sorttingPracticeProblem;
//You are given an array of 0s and 1s in random order. Segregate 0s on left side and
// 1s on right side of the array [Basically you have to sort the array]. Traverse array only once.
public class problemNo4 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 0, 1, 1, 1, 0};
        func(arr, arr.length);
        print(arr);
    }
    public static void func(int arr[], int size) {
        int low = 0;
        int high = size - 1;
        int temp = 0;
        int mid = 0;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0: {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }
    public static void print(int arr[]){
        int n = arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
