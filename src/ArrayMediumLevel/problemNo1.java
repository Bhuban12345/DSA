package ArrayMediumLevel;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Given an integer array, check if it contains a subarray having zero-sum.
public class problemNo1 {
    public static void main(String[] args) {
        int[] arr = {4, -6, 3, -1, 4, 2, 7};

        int[] nums = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
        if (hasSumZeroSum(arr)){
            System.out.println("subArray is exist");
        }
        else{
            System.out.println("subArray is not exist");
        }
        printSubArraySumZero(arr,arr.length);
        printMaxLengthSum(nums,8);
        optimalApproch(nums,8);

    }
    public static boolean hasSumZeroSum(int[] arr){
        Set<Integer> set = new HashSet<>();
        set.add(0);
        int sum = 0;
        for (int value:arr){
            sum += value;
            if (set.contains(sum)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }
    //Given an integer array, print all subarrays with zero-sum.
    public static void printSubArraySumZero(int[] arr, int n){
        for (int i=0; i<n; i++){
            int sum = 0;
            for (int j=1; j<n; j++){
                sum += arr[j];
                if (sum == 0){
                    System.out.println("Sub-Array: "+"[ "+arr[i]+" "+arr[j]+" ]");
                }
            }
        }
    }
    //Given an integer array, find the maximum length subarray having a given sum.
    public static void printMaxLengthSum(int[] arr,int target){
        int len = 0;
        int index = -1;
        for (int i=0; i<arr.length; i++){
            int sum = 0;
            for (int j=i; j<arr.length; j++){
                sum += arr[j];
                if (sum == target){
                    if ( len < j-i+1){
                        len = j-i+1;
                        index = j;
                    }
                }
            }
        }
        System.out.println("["+(index-len+1) +" "+index+"]");
    }
    public static void optimalApproch(int[] arr, int target){
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        int len = 0;
        int index = -1;
        for (int i=0; i< arr.length; i++){
            sum += arr[i];
            map.putIfAbsent(sum,i);
            if (map.containsKey(sum-target) && len < i-map.get(sum-target)){
                len = i - map.get(sum-target);
                index = i;
            }
        }
        System.out.println("["+(index-len+1)+" "+index+"]");
    }
}
