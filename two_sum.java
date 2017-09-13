import java.util.Arrays;


public class two_sum {
    
    public static void main(String[] args) {
        int[] list = new int[] {1, 2, 3, 4, 6};
        int target = 10;
        int[] result = twoSum(list, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    // System.out.println(String.format("%d %d", i, j));
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}