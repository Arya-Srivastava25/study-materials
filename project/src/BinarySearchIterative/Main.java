package BinarySearchIterative;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of arr");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter "+ n + " numbers :");
        for(int i = 0 ; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter key to search");
        int key = sc.nextInt();

        System.out.println("Element is found at index : "+binarySearch(arr,key));

    }

    public static int binarySearch(int[] arr, int key){
        int low = 0, high = arr.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] < key){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
}

