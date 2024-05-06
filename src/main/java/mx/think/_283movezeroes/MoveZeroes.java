package mx.think._283movezeroes;

import java.util.Arrays;

public class MoveZeroes {

    public int[] moveZeroes(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        int currentIndex=0;
        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                result[currentIndex] = nums[i];
                currentIndex++;
            }
        }
        System.arraycopy(result, 0, nums, 0, length);
        return nums;
    }


    public void moveZeroes2(int[] nums) {
        if (nums.length == 1) {
            return;
        }
        System.out.println(Arrays.toString(nums));

        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            System.out.println(i + " Not zero index: " + nonZeroIndex);
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                System.out.println(Arrays.toString(nums));
                nonZeroIndex++;
            }
        }


        while(nonZeroIndex<nums.length){
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
            System.out.println(Arrays.toString(nums));
        }
    }
}
