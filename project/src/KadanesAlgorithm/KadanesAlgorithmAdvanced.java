package KadanesAlgorithm;

public class KadanesAlgorithmAdvanced {
    public int[] kadane(int[] arr){

        int max_so_far = 0 , max = Integer.MIN_VALUE, start = 0, currStart = 0, end = 0;

        for(int i = 0; i < arr.length; i++){
            max_so_far += arr[i];

            if(max < max_so_far){
                max = max_so_far;
                start = currStart;
                end = i;
            }
            if(max_so_far < 0){
                max_so_far = 0;
                currStart = i+1;
            }
        }
        return new int[]{start,end,max};
    }
}
