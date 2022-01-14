package ArrayPracticeProble;
//Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
public class problemNo4 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 2, 0, 2, 2};
        int n = arr.length;
        sort0s1s2s(arr,n);
    }
    public static void sort0s1s2s(int[] arr, int n){
        int i = 0; int count0 = 0; int count1 = 0; int count2 = 0;
        for (int j=0; j<n; j++){
            switch (arr[j]){
                case 0:{
                    count0++;
                    break;
                }
                case 1:{
                    count1++;
                    break;
                }
                case 2:{
                    count2++;
                    break;
                }
            }
        }
        while (count0 > 0){
            arr[i] = 0;
            count0--;
            i++;
        }
        while (count1 > 0){
            arr[i] = 1;
            count1--;
            i++;
        }
        while (count2 > 0){
            arr[i] = 2;
            count2--;
            i++;
        }
        for (int x:arr){
            System.out.print(x+" ");
        }
    }
}
