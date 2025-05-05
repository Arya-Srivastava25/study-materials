package FindSumOfParticularValues;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {8,1,4,3,8,2,6};
        int[] queries = {4,6};
        Arrays.sort(arr);
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for(int i = 1; i < arr.length; i++)
            prefixSum[i] = prefixSum[i-1] + arr[i];

        for(int i = 0 ; i < queries.length; i++){
            System.out.println(sum(arr,queries[i],prefixSum));
        }
    }
    public static int sum(int[] arr, int q, int[] prefixSum){
        int index = bound(arr,q);
        if (index == -1) {
            return 0;
        }

        return prefixSum[index];
    }
    public static int bound(int[] arr, int q){
        int low = 0, high = arr.length - 1;
        while (low <= high){
            int mid = (low+high)/2;
            if(arr[mid] <= q)
                low = mid - 1;
            else
                high = mid + 1;
        }
        return high;
    }
}
