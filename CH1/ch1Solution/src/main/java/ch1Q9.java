public class ch1Q9 {
    public static void main(String[] args) {
        String s1 = "xy";
        String s2 = "yx";
        System.out.println(isRotation(s1, s2));
    }

    private static boolean isRotation(String s1, String s2) {
        int len = s1.length();
        if(len == s2.length() && len > 0){
            String s1s1 = s1 + s1;
            return isSubString(s1s1, s2);
        }
        return false;
    }

    private static boolean isSubString(String s1s1, String s2) {
        int count =0;
        for(int i=0; i<s1s1.length(); i++){
            if (s1s1.charAt(i) == s2.charAt(count)){
                count++;
            }else{
                count =0;
            }
            if (count == s2.length()) return true;
        }
        return false;
    }
}
