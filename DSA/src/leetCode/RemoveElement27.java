package leetCode;

public class RemoveElement27 {
    public static void main(String[] args) {
        int nums[] = {3, 2, 1, 3}, val = 3;
        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
    int fP=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[fP]=nums[i];
                fP++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();
        return fP;
    }
}
