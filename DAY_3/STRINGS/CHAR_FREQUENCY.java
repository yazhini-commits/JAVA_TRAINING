package STRINGS;

public class CHAR_FREQUENCY {
    public static void main(String[] args) {

        String str = "aabbc";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            boolean visit = false;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    visit = true;
                    count++;
                }
            }
            if (visit) {
                System.out.println(str.charAt(i) + " : " + count);
            }
        }
    }
}