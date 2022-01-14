package Assignment;
//12 23 34 45 67 78
//34 45 67 78 12 23
public class mock {
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 45, 67, 78};
        int[] arr1 = {34, 45, 67, 78, 12, 23};
        int n = arr.length;
        int n1 = arr1.length;
        System.out.println(maximunElement(arr1,n1));
       // int required = searching(arr, n, 34);
        //System.out.println(required);
    }
    public static int searching(int[] arr, int n, int number){
        int l = 0; int r= n-1;
        while (l < r){
            int mid = l + (r-1)/2;
            if (arr[mid] == number){
                return arr[mid];
            }
            else if (arr[mid] > number){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return 0;
    }
    //34 45 67 78 12 23
    public static int maximunElement(int[] arr, int n){
        int l = 0; int r = n-1;
        while (l < r){
            int mid = l + (r-1)/2;
            if (arr[mid] > arr[mid+1] || arr[mid] > arr[mid+1]){
                return arr[mid];
            }
            if (arr[mid] > arr[mid+1] && arr[mid] < arr[mid-1]){
                l = mid+1;
            }
            if (arr[mid] > arr[mid-1] && arr[mid] <arr[mid+1]){
                r = mid -1;
            }

        }
        return 0;
    }
}
