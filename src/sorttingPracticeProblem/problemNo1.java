package sorttingPracticeProblem;
//selection sorting.{-1 , 5, 5, 3, 5, 8, 1, 2, 6}
public class problemNo1 {
    public static void main(String[] args) {
        int[] arr = {-1 , 5, 5, 3, 5, 8, 1, 2, 6};
        selectionSort(arr);
        printArray(arr);

    }
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i=0; i<n-1; i++){
            int minInd = i;
            for (int j=i+1; j<n; j++){
                if (arr[j] < arr[minInd]){
                    minInd = j;
                    int temp = arr[minInd];
                    arr[minInd] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void printArray(int[] arr){
        for (int x:arr){
            System.out.print(x+" ");
        }
    }
}
