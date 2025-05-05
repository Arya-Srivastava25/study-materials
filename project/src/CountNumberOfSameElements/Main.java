package CountNumberOfSameElements;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,2,3,4,4,5,5,5,5,5,5};
        int k = 9;
        System.out.println(find(arr,k));
    }

    public static int find(int[] arr, int k){
        int first = findFirst(arr,k);
        if(first == -1)
            return 0;
        int last = findLast(arr,k);

        return last-first+1;
    }

    public static int findFirst(int[] arr, int k){
        int low = 0 , high = arr.length - 1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == k){
                if(mid == 0 || arr[mid] != arr[mid-1])
                    return mid;
                else
                    high = mid - 1;
            }
            else if(arr[mid] > k)
                high = mid - 1;
            else
                low = low + 1;
        }
        return -1;
    }

    public static int findLast(int[] arr, int k){
        int low = 0 , high = arr.length - 1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == k){
                if(mid == arr.length - 1 || arr[mid] != arr[mid+1])
                    return mid;
                else
                    low = mid + 1;
            }
            else if(arr[mid] > k)
                high = mid - 1;
            else
                low = low + 1;
        }
        return -1;
    }
}


