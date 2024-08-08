package crack_placement;
class Solution {
    public static int removeDuplicates(int[] nums) {
        if(nums.length ==0)
        {
            return 0;
        }
        int i=1;
        for(int j=1;j<nums.length;j++)
        {
            if(nums[j] != nums[i-1])
            {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String args[])
    {
        int arr[] = {1,1,1,2,2,2,3,4};
        int count = removeDuplicates(arr);
        System.out.println(count);
        for(int i =0;i< count;i++)
        {
            System.out.println(arr[i]);
        }

    }
}