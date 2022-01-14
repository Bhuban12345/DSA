package searchingPracticeProblem;
//Given a sorted array of size N and an integer K, find the position at which K is
// present in the array using binary search.
public class findingElementPosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = FindElement(arr,4);
        if (index != 0){
            System.out.println(index);
        }else{
            System.out.println("Element is not found");
        }
    }
    public static int FindElement(int[] arr, int element){
        int l = 0;
        int r = arr.length-1;
        int mid = l + (r-l)/2;
        while (l < r){
          if (arr[mid] > element){
              r = mid-1;
          }else if (arr[mid] < element){
              l = mid+1;
          }else if (arr[mid] == element){
              return mid;
          }
        }
        return -1;
    }
}
