package KadanesAlgorithm;

public class Main {
    public static void main(String[] args) {
        KadanesAlgorithmAdvanced kadanesAlgorithmAdvanced = new KadanesAlgorithmAdvanced();
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 5;
        arr[2] = -6;
        arr[3] = 1;

        int[] res = kadanesAlgorithmAdvanced.kadane(arr);
        System.out.println("start : " + res[0]);
        System.out.println("end : " + res[1]);
        System.out.println("sum : " + res[2]);
    }
}
