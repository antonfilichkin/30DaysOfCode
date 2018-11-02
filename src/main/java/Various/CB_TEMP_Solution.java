public class CB_TEMP_Solution {


    public static void main(String[] args) {
        System.out.println(groupSumClump(0, new int[]{2, 4, 4, 8},10));
    }


   static public boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }

        int group = countIdentical(start, nums);
        return groupSumClump(start + group, nums, target - nums[start]) ||
                groupSumClump(start + group, nums, target);


        //return groupSumClump(start+1, nums, target-nums[start]) ||
        //      groupSumClump(start+1, nums, target);
    }

    static public int countIdentical(int start, int[] nums) {
        int count = 1;
        if (start >= nums.length) {
            return count;
        }

        if (start < nums.length - 1 && nums[start] == nums[start + 1]) {
            return 1 + countIdentical(start + 1, nums);
        }

        return count;
    }

}