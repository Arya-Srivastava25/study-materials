package IntegerToHexaDecimal;

public class Main {
    static final String digits = "0123456789ABCDEF";

    public static void main(String[] args) {
//        System.out.println(Integer.toHexString(-50));
        int num = 50;
        StringBuilder str = new StringBuilder();
        while(num>0){
            int digit = num % 16;
            str.insert(0,digits.charAt(digit));
            num = num/16;
        }
        System.out.println(str);
    }
}
