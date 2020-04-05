package chapter10sorting;

import java.util.Arrays;

public class MainApplication {
    public static void main(String[] args) {
        int nums[]={7,5,1,6,3,4};
        //BubbleSort.bubbleSort(nums);
        SelectionSort.selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
