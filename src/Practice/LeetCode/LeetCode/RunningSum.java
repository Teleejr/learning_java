import java.util.Arrays;

public class RunningSum {



    public void moveZeroes(int[] nums) {
        if (nums.length == 1 || nums.length == 0) {
            return;
        }

        //if nums[i] == 0 move to the end of the array, and move all values up.
        int zeroes = 0;

        for(int i = 0; i <= nums.length - 1; i++) {
            System.out.println("Before move: " + Arrays.toString(nums));
            if(nums[i] == 0) {
                zeroes++;
            }
            if(nums[i] != 0){
                nums[i - zeroes] = nums[i];
                //nums[i] = 0;
                System.out.println("After move: " + Arrays.toString(nums));
            }
        }
        while(zeroes != 0) {
            nums[nums.length - zeroes] = 0;
            zeroes--;
            System.out.println("Adding zeroes: " + Arrays.toString(nums));
        }
    }
}
