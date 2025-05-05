package SortString;

public class Main {
    public static void main(String[] args) {
        System.out.println(sort("azyidosqudandincsozzweqaxcBzfgA"));
    }

    public static String sort(String s){
        int[] count = new int[256];
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < s.length(); i++)
            count[s.charAt(i)]++;

        for(int i = 0 ; i < 256; i++){
            while(count[i]-- > 0)
                sb.append((char) i);
        }
        return sb.toString();
    }
}
