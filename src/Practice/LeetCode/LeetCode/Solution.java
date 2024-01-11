import java.util.*;

public class Solution {

    HashMap hashMap = new HashMap();

    public List<String> fizzBuzz(int n) {

        List<String> result = new ArrayList();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }

    public int maximumWealth(int[][] accounts) {
        int customerOne = 0;
        int customerTwo = 0;

        for (int i = 0; i < accounts.length + 1; i++) {
            int length = accounts.length;
            customerOne += accounts[0][i];
        }
        for (int j = 0; j < accounts.length + 1; j++) {
            customerTwo += accounts[1][j];
        }
        if (customerOne > customerTwo)
            return customerOne;

        return customerTwo;
    }

    public ListNode middleNode(ListNode head) {
        ListNode middle = head;
        ListNode end = head;

        while (end != null && end.next != null) {
            middle = middle.next;
            end = end.next.next;
        }

        return middle;
    }

    public int numberOfSteps(int num) {

        int steps = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
                steps++;
            } else {
                num -= 1;
                steps++;
            }
        }
        return steps;
    }

    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            total = sum[i] + nums[i];
            total = (i == 0) ? total + sum[i] : total + sum[i - 1];
            sum[i] = total;
        }
        return sum;

    }

    public int[] twoSum(int[] nums, int target) {

        int left = 0, right = nums.length - 1, temp;
        Map<Integer, Integer> values = new HashMap<Integer, Integer>();
        int i = 0;

        while (left <= nums.length - 1) {
            temp = nums[left] - target;

            if (!values.containsValue(temp)) {
                values.put(i, nums[right]);
                i++;
            } else {
                return new int[]{left, right};
            }
            if (temp > target) {
                right--;
                left++;
            } else
                left++;
            if (left == right)
                left++;
        }
        return new int[]{-1, -1};
    }

    public void moveZeroes(int[] nums) {
        if (nums.length == 1 || nums.length == 0) {
            return;
        }

        //if nums[i] == 0 move to the end of the array, and move all values up.
        int zeroes = 0;

        for (int i = 0; i <= nums.length - 1; i++) {
            System.out.println("Before move: " + Arrays.toString(nums));
            if (nums[i] == 0) {
                zeroes++;
            }
            if (nums[i] != 0) {
                nums[i - zeroes] = nums[i];
                //nums[i] = 0;
                System.out.println("After move: " + Arrays.toString(nums));
            }
        }
        while (zeroes != 0) {
            nums[nums.length - zeroes] = 0;
            zeroes--;
            System.out.println("Adding zeroes: " + Arrays.toString(nums));
        }
    }

    public boolean containsDuplicate(int[] nums) {

        if (nums.length == 1 || nums.length == 0) {
            return false;
        }
        //placeholder for comparison value
        /*int place = 0;

        //start iteration at 2nd value
        for (int i = 0; i < nums.length - 1; i++) {
            place = nums.length - 1;
            //if place is not at the end of the array
            while(place >= 0 && place != i) {
                if(nums[i] == nums[place]) {
                    System.out.println("Duplicate found: " + nums[i]);
                    return true;
                } else {
                    place--;
                }
            }
        }*/

        Arrays.sort(nums);
        int place = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; // In case k is larger than the length of the array, take the modulo.

        // Reverse the first n-k elements.
        reverseArray(nums, 0, n - k - 1);

        // Reverse the rest elements.
        reverseArray(nums, n - k, n - 1);

        // Reverse the entire array.
        reverseArray(nums, 0, n - 1);
    }
    private static void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
//        int[] nums2 = Arrays.copyOfRange(nums, nums.length - k, nums.length);
//        int[] nums3 = Arrays.copyOfRange(nums, 0, nums.length - k);
//        int j = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if(i < nums2.length) {
//                nums[i] = nums2[i];
//            } else {
//                nums[i] = nums3[j];
//                j++;
//            }
//        }
    }
}
