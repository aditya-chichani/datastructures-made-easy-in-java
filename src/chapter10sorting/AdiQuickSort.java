package chapter10sorting;

public class AdiQuickSort {
    public static void quickSort(int[] nums)
    {
        qSort(nums,0,nums.length-1);
    }

    private static void qSort(int[] nums, int low, int high) {
        if(low < high)
        {
            int pivotIndex = qPartition(nums,low,high);
            qSort(nums,low,pivotIndex-1);
            qSort(nums,pivotIndex+1,high);
        }
    }

    private static int qPartition(int[] nums, int low, int high) {

        int i, j, tmp, pivot;
        pivot = nums[high]; // Last element acts as pivot
        i = low - 1; // i is the index where an element smaller than the pivot element is moved

        for (j = low; j < high; j++) {
            if (nums[j] < pivot) {
                i++;
                tmp = nums[j];
                nums[j] = nums[i];
                nums[i] = tmp;
            }
        }

        tmp=nums[i+1];
        nums[i+1]=pivot;
        nums[high]=tmp;

        return i+1;
    }
}

