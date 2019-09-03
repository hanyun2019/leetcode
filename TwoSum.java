package poppack;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args){
        System.out.println("Hello World!");
 
        int nums[] = {2,7,11,15};
        int target = 9;
 
        System.out.println("nums[]:" + nums);
        System.out.println("nums[0]:" + nums[0]);
        System.out.println("nums[1]:" + nums[1]);
        System.out.println("nums[2]:" + nums[2]);
        System.out.println("nums[3]:" + nums[3]);
        
        TwoSum result = new TwoSum();
        int[] a = result.twoSum(nums, target);
        System.out.println(Arrays.toString(a));
        System.out.println(nums[a[0]]);
        System.out.println(nums[a[1]]);
     }
}
