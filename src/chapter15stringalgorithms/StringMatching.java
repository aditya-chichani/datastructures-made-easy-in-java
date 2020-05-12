package chapter15stringalgorithms;

public class StringMatching {
    public static void main(String[] args) {
        System.out.println(containsStrRabinKarp("0123456", "345"));
    }

    public static boolean containsStrRabinKarp(String text, String pattern) {
        int m = pattern.length();
        int n = text.length();
        int p = 0, t = 0;
        for (int i = 0; i < m; i++) {
            p += pattern.charAt(i) * Math.pow(10, m - i - 1);
            t += text.charAt(i) * Math.pow(10, m - i - 1);
        }

        if (p == t && text.substring(0, m).equals(pattern))
            return true;

        for (int i = m; i < n; i++) {
            t = (t - text.charAt(i - m) * (int) Math.pow(10, m - 1)) * (int) Math.pow(10, m - 2) + text.charAt(i);
            if (p == t && text.substring(i - m + 1, i + 1).equals(pattern))
                return true;
        }
        return false;
    }
}
