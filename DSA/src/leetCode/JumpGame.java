package leetCode;

public class JumpGame {
    public static void main(String[] args) {
        int nums[] = {1,0,1,0};
        System.out.println(canJump(nums));

    }

    public static boolean canJump(int[] nums) {
        int maxReachable = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i>maxReachable) {
                return false;
            }
            maxReachable = Math.max(i + nums[i], maxReachable);
        }
        return true;
    }


}
