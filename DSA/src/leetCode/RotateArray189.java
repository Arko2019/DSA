package leetCode;

public class RotateArray189 {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7}, k = 3;
        rotate(nums, k);
    }

    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        k = k < 0 ? -k : k;
        reverse(nums, 0, nums.length - 1);// reverse an array
        reverse(nums, k, nums.length - 1);//reverse second half
        reverse(nums, 0, k - 1);// reverse first half

        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
    }

    public static void reverse(int[] nums, int fP, int sP) {
        while (fP < sP) {
            int temp = nums[fP];
            nums[fP] = nums[sP];
            nums[sP] = temp;
            sP--;
            fP++;
        }

    }


}
