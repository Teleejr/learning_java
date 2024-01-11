import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        int left = 0, right = nums.length - 1, temp;
        Map<Integer, Integer> values = new HashMap<Integer, Integer>();
        int i = 0;


        while(left <= nums.length - 1) {
            temp = nums[left] - target;

            if(!values.containsValue(temp)){
                values.put(i, nums[right]);
                i++;
            }
            else {
                return new int[] {left, right};
            }
            if(temp > target) {
                right--;
                left++;
            } else
                left++;
            if(left == right)
                left++;
        }
        return new int[] {-1,-1};
    }
}