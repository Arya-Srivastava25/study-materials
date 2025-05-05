package NumberOfWaysToReachEnd;

public class Main {
    public static void main(String[] args) {
        System.out.println(cal(4));
    }

    public static int cal(int n){
        int last = 1, secondLast = 1;

        for(int i = 2; i <= n; i++){
            int curr = last + secondLast;
            secondLast = last;
            last = curr;
        }
        return last;
    }
}
