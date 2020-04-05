package chapter10sorting;

import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] nums)
    { int tmp,swapped;
        for(int i=0; i< nums.length;i++)
        { swapped=0;
            for(int j=0;j<nums.length-i-1;j++)   // Heaviest elements start sinking to the end at each pass, So no need for j to always go to end
            {
                if(nums[j]>nums[j+1])
                {
                    tmp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=tmp;
                    swapped=1;
                }
            }
            if(swapped==0)    // If no element swapped at this pass, then array is sorted
                break;
        }
    }
}
