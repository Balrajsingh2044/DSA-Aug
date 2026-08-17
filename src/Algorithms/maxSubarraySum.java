import java.util.*;
public class maxSubarraySum {
    static void subarraySum(int[] arr){
        int n = arr.length;
        int maxSum = 0;
        int start = 0, last = 0;
        for(int st = 0; st < n; st++){
            for(int end = st; end < n; end++){
                int sum = 0;
                for(int i = st; i <= end; i++){
                    sum += arr[i];
                    if(sum > maxSum){
                        maxSum = sum;
                        start = st;
                        last = end;
                    }
                }
            }
        }
        System.out.println("Max sum is : " + maxSum);
        System.out.println("Index is from " + start + " to " + last);
    }

    static void kadane(int[] arr){
        int n = arr.length;
        int maxSum = 0;
        int currSum = 0;
        for(int st = 0; st < n; st++){
            currSum += arr[st];
            maxSum = Math.max(currSum, maxSum);
            if(currSum < 0){
                currSum = 0;
            }
        }
        System.out.println("Max sum is : " + maxSum);
    }
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,-4,-5};
        kadane(arr);
    }
}
