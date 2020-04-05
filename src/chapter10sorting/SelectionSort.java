package chapter10sorting;

public class SelectionSort {
    static void selectionSort(int[] nums)
    {   int minIndex,tmp;
        for(int i=0;i<nums.length-1;i++)
        {   minIndex=i;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]<nums[minIndex])
                    minIndex=j;
            }
            if(minIndex!=i)
            {
                tmp=nums[i];
                nums[i]=nums[minIndex];
                nums[minIndex]=tmp;
            }
        }
    }
}
