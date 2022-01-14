package searchingPracticeProblem;
//There are 2 sorted arrays A and B of size n each. Write an algorithm to find the median of the
// array obtained after merging the above 2 arrays(i.e. array of length 2n). The complexity should be O(log(n))
public class MeanOfTwoSortArray {
    public static void main(String[] args) {
        int[] arr1 ={1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        int n = arr1.length + arr2.length;
        int median = getMedian(arr1, arr2,n);
        System.out.println(n);
    }
    public static int getMedian(int[] arr1, int[] arr2, int n){
        int i = 0;
        int j = 0;
        int count = 0;
        int mid1 = -1, mid2 = -1;
        System.out.println("gjoijf");
        for (count=0; count<n; count++){
            if (i == n){
                System.out.println("nkfhf");
                mid1 = mid2;
                mid2 = arr1[0];
                break;
            }
            else if(j == n){
                mid1 = mid2;
                mid2 = arr2[0];
                break;
            }
            if (arr1[i] <= arr2[j]){
                mid1 = mid2;
                mid2 = arr1[i];
                i++;
            }
            else{
                mid1 = mid2;
                mid2 = arr2[j];
                j++;
            }
        }
        return (mid1+mid2)/2;
    }
}
