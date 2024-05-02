package mx.think._334ingreasingtriplet;

import java.util.Arrays;
import java.util.HashMap;

public class IncreasingTriplet {
    public boolean increasingTriplet(int[] nums) {
        System.out.println(Arrays.toString(nums));
        if (nums.length < 3) {
            System.out.println("false");
            return false;
        }
        HashMap<Integer, Integer> frequencyMap;
        int max = Arrays.stream(nums).max().orElse(0);;
        if (nums.length > 100) {
            frequencyMap = new HashMap<>();
            for (int value : nums) {
                frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
            }
            if (frequencyMap.size() < 3)
                return false;
        }


        for(int firstCursor = 0; firstCursor < nums.length - 2; firstCursor++) {
            System.out.println("C1[" + firstCursor + "]=" + nums[firstCursor]);
            if (nums[firstCursor] >= max){
                System.out.println("this is the max number none is going to beat it");
                continue;
            }
            for (int secondCursor = firstCursor + 1; secondCursor < nums.length - 1; secondCursor++) {
                System.out.println("    C2[" + secondCursor + "]=" + nums[secondCursor]);
                if (nums[firstCursor] >= nums[secondCursor] || nums[secondCursor] >= max)
                    continue;
                for (int thirdCursor = secondCursor + 1; thirdCursor < nums.length; thirdCursor++) {
                    System.out.println("        C3[" + thirdCursor + "]=" + nums[thirdCursor]);
                    if (nums[firstCursor] >= nums[secondCursor] || nums[secondCursor] >= max) {
                        System.out.println("breaking loop");
                        break;
                    }
                    if (nums[firstCursor] < nums[secondCursor] && nums[secondCursor] < nums[thirdCursor]) {
                        System.out.println("true");
                        return true;
                    }
                }
            }
        }
        System.out.println("false");
        return false;
    }
}
