package chapter10sorting;

public class ShellSort {
    public static void shellSort(int[] nums)
    {
        int h;

        for(h=1;h<nums.length/3;h=3*h+1);  // Knuth's sequence

        while (h>=1)
        {
            hInsertionSort(nums,h);
            h=h/3;
        }

    }

    private static void hInsertionSort(int[] nums, int h) {
        int j,toBeInsertedValue;

        for(int i =h;i<nums.length;i++)
        {
            j=i;
            toBeInsertedValue = nums[i];

            while (j>=h && nums[j-h]>toBeInsertedValue)
            {
                nums[j]=nums[j-h];
                j-=h;
            }
            nums[j]=toBeInsertedValue;
        }


    }
}
