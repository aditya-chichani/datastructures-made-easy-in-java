package chapter10sorting;

import java.util.LinkedList;

public class InsertionSort {
    //In place insertion sort
    public static void insertionSort(int[] nums)
    {   int j,toBeInsertedValue;
        for(int i=1;i<nums.length;i++)
        {   toBeInsertedValue = nums[i];
            j=i;
            while (j>=1 && nums[j-1]>toBeInsertedValue)
            {
                nums[j]=nums[j-1];  // If nums[j-1] is bigger than the toBeInsertedValue, shift j ahead by one and make space for toBeInsertedValue
                j--;
            }
            // Least j can go to is 0
            nums[j]=toBeInsertedValue;  // Insert the value in the
        }
    }




    //Bad way of implementing insertion sort!
    public static void OutOfPlaceInsertionSort(int[] nums)
    {   LinkedList<Integer> sortedArray = new LinkedList<>();
        for(int element: nums)
        {
            insertInSortedArray(sortedArray,element);
        }
        for(int i=0;i<sortedArray.size();i++)
            nums[i]=sortedArray.get(i);
    }

    private static void insertInSortedArray(LinkedList<Integer> sortedArray, int element) {
        int i;
        for(i=0; i<sortedArray.size();i++)
        {
            if(element<sortedArray.get(i))
                break;
        }
        sortedArray.add(i,element);

    }




}
