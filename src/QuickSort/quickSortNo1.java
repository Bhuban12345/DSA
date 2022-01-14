package QuickSort;

public class quickSortNo1 {
    public static int partition(int[] arr,int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for (int j=low; j<high; j++){
            if (arr[j] < pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
    public static void quickSort(int[] arr, int low, int high){
        if (low < high){
            int pind = partition(arr,low,high);

            quickSort(arr,low,pind-1);
            quickSort(arr,pind+1,high);
        }
    }
    public static int[] printSortArr(int[] arr,int low,int high){
        int[] ans = new int[low+high];
        for (int i=0; i<ans.length; i++){
            ans[i] = partition(arr,low,high);
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[] = {13, 18, 27, 2, 19, 25};
        int n = a.length;

        quickSort(a,0,n-1);
        for (int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }
}
