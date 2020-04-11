package chapter10sorting;

public class MergeSort {

    public static void mergeSort(int[] nums)
    {
        mergeSort(nums,0,nums.length);
    }

    private static void mergeSort(int[] nums, int start, int end) {
        if(end-start<=1)
            return;
        int mid = (end - start) / 2;
        mergeSort(nums,start,start+mid);
        mergeSort(nums,start+mid,end);
        merge(nums,start,mid-start,mid,end-mid);
    }

    private static void merge(int[] nums, int n1start, int n1size, int n2start, int n2size) {
        int j,val;
        // Insertion Sort :)
        for(int i=n2start;i<n2start+n2size;i++)
        {
            val=nums[i];
            j=n1start+n1size-1;
            while(j>=0 && nums[j]>val)
            {
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=val;
            n1size++;
        }
    }


    // Very high space complexity - Bad way of implementation
    public static int[] OutOfPlaceMergeSort(int[] nums)
    {   if(nums.length ==0)
        return nums;
        return OutOfPlaceMergeSort(nums,0,nums.length);
    }

    private static int[] OutOfPlaceMergeSort(int[] nums, int start, int end) {
        if(end-start==1)
            return new int[]{nums[start]};
        return merge(OutOfPlaceMergeSort(nums,start,start+(end-start)/2), OutOfPlaceMergeSort(nums,start+(end-start)/2,end));
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int i=0,j=0,count=0;
        int[] merged= new int[arr1.length+arr2.length];
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[i])
            {
                merged[count]=arr1[i];
                i++;
            }
            else{
                merged[count]=arr2[j];
                j++;
            }
            count++;
        }
        while(i<arr1.length)
        {
            merged[count++]=arr1[i++];
        }
        while(j<arr2.length)
        {
            merged[count++]=arr2[j++];
        }
        return merged;
    }
}
