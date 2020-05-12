package chapter15stringalgorithms;

public class KMP {
    public static void main(String[] args) {
        String text = "mississippi";
        String pattern = "issip";
        KmpSearch(text, pattern, LPS.computeLPS(pattern));
    }

    private static void KmpSearch(String text, String pattern, int[] lps) {
        int i = 0, j = 0;
        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }
            if (j == pattern.length()) {
                System.out.println("Pattern found at " + (i - j));
                j = lps[j - 1];
            } else if (i < text.length() && text.charAt(i) != pattern.charAt(j)) {
                if (j == 0)
                    i++;
                else j = lps[j];
            }
        }
    }
}
