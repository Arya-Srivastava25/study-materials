package StringCompress;

public class Main {
    public static void main(String[] args) {
        System.out.println(compressString("aaaaabbcdddddddddeeeeaaaaa"));
    }

    public static String compressString(String string){
        StringBuffer str = new StringBuffer();
        int count = 1 ;
        char first = string.charAt(0);
        str.append(first);
        for(int i = 1 ; i < string.length(); i++){
            if(string.charAt(i) == string.charAt(i-1)){
                count++;
            }
            else{
                str.append(count);
                count = 1;
                str.append(string.charAt(i));
            }
        }
        str.append(count);
        return str.toString();
    }
}
