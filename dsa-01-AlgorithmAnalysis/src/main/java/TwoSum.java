import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] array = {4, 7, 2, 11};

        System.out.println(Arrays.toString(twoSum(array, 9)));

        System.out.println(Arrays.toString(twoSum1(array, 9)));

    }

    // Bruteforce Solution of Two Sum problem. complexity => O(n`2)
    public static int[] twoSum(int[] array, int targetValue) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (i != j) {
                    if (array[i] + array[j] == targetValue) return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }

    // optimized solution : complexity => O(n) but i have space complexity of O(n)
    public static int[] twoSum1(int[] array, int targetValue) {

        Map<Integer, Integer> map = new HashMap<>(); // element, index

        for (int i = 0; i < array.length; i++) {
            int potentialMatch = targetValue - array[i];
            if (map.containsKey(potentialMatch)) return new int[]{i, map.get(potentialMatch)};
            else map.put(array[i], i);
        }

        return new int[]{};
    }

}
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
• You may assume that each input would have exactly one solution, and you may not use the same element twice.
• You can return the answer in any order.
• No solution will return empty array.
Example:
Input: nums = [2, 7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */