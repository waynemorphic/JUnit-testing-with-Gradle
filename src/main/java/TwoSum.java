import java.util.Arrays;

/*
- Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

- You may assume that each input would have exactly one solution, and you may not use the same element twice.

- You can return the answer in any order.

--- Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

--- Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

--- Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]

*/
public class TwoSum {
    public static void main(String[] args){
        TwoSum twoSum = new TwoSum();
        int[] num = {1,2,3};
        System.out.println(Arrays.toString(twoSum.elemSum(num, 3)));
    }

    public int[] elemSum(int[] arr, int target){
        for (int j = 0; j < arr.length; j++){
            for (int k = j + 1; k < arr.length; k++){
                if (arr[j]  + arr[k] == target){
                    return new int[] {j, k};
                }
            }
        }
        return null;
    }
}
