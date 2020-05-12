package chapter15stringalgorithms;

import java.util.Arrays;

public class LPS {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(computeLPS("abcdabca")));
    }

    public static int[] computeLPS(String pattern) {
        if (pattern == null || pattern.isEmpty())
            return null;
        int[] lps = new int[pattern.length()];
        lps[0] = 0;
        int j = 0, i = 1;
        while (i < lps.length) {
            if (pattern.charAt(j) == pattern.charAt(i)) {
                lps[i] = j + 1;
                i++;
                j++;
            } else {
                if (j > 0) {
                    j = lps[j - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
