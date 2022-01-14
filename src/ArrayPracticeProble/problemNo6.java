package ArrayPracticeProble;
//Sort the array using the merge sort.
public class problemNo6 {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        int n = arr.length;
    }
    public static void sort(int[] arr, int l, int r){
        if (l < r){
            int mid = l + (r-l)/2;
            sort(arr,l,mid);
            sort(arr,mid+1,r);
        }
    }
    public static void merge(int[] arr, int l, int mid, int r){
        int n1 = mid+l+1;
        int n2 = r-mid;
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        for (int i=0; i<n1; i++){
            arr1[i] = arr[l+i];
        }
        for (int j = 0; j<n2; j++){
            arr2[j] = arr[mid+1+j];
        }
        int i = 0; int j = 0;
        int k = l;
        while (i < n1 && j < n2){
            if (arr1[i] <= arr2[j]){
                arr[k] = arr1[i];
                i++;
            }
            else {
                arr[k] = arr2[j];
            }j++;
        }
        k++;
    }
}
