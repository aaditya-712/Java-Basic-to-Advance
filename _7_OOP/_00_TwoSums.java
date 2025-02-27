package _7_OOP;

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                int res = nums[i] + nums[j];
                if(res == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
public class _00_TwoSums {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];

        for(int i=0; i<size; i++){
            System.out.print("Enter element at index "+ i + ": ");
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the targeted sum: ");
        int target = sc.nextInt();
        Solution sol = new Solution();
        int[] result = sol.twoSum(nums, target);
        System.out.print("The result index are: ");
        System.out.print(Arrays.toString(result));
    }
}
