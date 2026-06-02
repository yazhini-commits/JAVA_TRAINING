
public class STRING_PALINDROME{
    public static void main(String[] args) {
        String st="abae";
        boolean palindrome = true;
        int start = 0;
        int end = st.length() - 1;
        while (start < end) {
            if (st.charAt(start)!= st.charAt(end)) {
                palindrome = false;
            }

            start++;
            end--;
        }
        if (palindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

}
