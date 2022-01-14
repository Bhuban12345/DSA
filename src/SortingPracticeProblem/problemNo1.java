package SortingPracticeProblem;

public class problemNo1 {
    public  void sort(int[] arr, int low, int high){
        if (low == high) {
            return;
        }
        int mid = low + (high-low)/2;
        sort(arr,low,mid);
        sort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public  void merge(int[] arr, int low, int mid, int high){
        int k = low; int i = low; int j = mid+1;
        while (i <= mid && j <= high){
            if(arr[i] > arr[j]){
                arr[k++] = arr[j++];
            }else {
                arr[k++] = arr[i++];
            }
        }
        while (i <= mid){
            arr[k] = arr[i];
            i++;
            k++;
        }
        while (j <= high){
            arr[k] = arr[j];
            j++;
            k++;
        }
    }
    public  void printArray(int[] arr){
        int n = arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 12,11, 13, 5, 6, 7};
        problemNo1 obj = new problemNo1();
        obj.sort(arr,0,arr.length-1);
        obj.printArray(arr);
    }
}
