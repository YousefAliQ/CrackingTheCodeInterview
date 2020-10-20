public class ch1Q1 {
    public static void main(String[] args) {
        System.out.println(isUniqueString("Hello"));
    }

    // Complexity : O(1)
    // Solution Page : 192
    private static boolean isUniqueString(String str) {

        if (str.length() > 128 ) return false;

        boolean[] char_set = new boolean[128]; // Assume: Ascii
        for (char c: str.toCharArray()){
            if(char_set[c])
                return false;
            else
                char_set[c] = true;
        }
        return true;
    }
}
