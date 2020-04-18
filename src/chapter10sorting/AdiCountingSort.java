package chapter10sorting;

import java.util.Arrays;

public class AdiCountingSort {
    public static void main(String[] args) {
        String[] strings = new String[]{"apple","dear","deer","cat"};
        // Aim : To sort strings on the basis of their first letter
        System.out.println(Arrays.asList(countSort(strings)));
    }

    public static String[] countSort(String[] strings)
    { // For input with keys from 'a' to 'd';
        String[] output = new String[strings.length];
        int[] indexer = new int[4];

        for(String s: strings)
        {
            int key = s.charAt(0) - 'a';   // Converting each string value to a hash value that can be used as an index
            indexer[key]+=1;
        }

        for(int i=1; i<indexer.length;i++)
            indexer[i]=indexer[i]+indexer[i-1];

        for(int i=strings.length-1;i>=0;i--)
        {
            int key = strings[i].charAt(0) - 'a';
            output[indexer[key]-1] = strings[i];
            indexer[key]-=1;
        }

        return output;
    }
}
