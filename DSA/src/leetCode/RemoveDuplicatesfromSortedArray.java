package leetCode;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
int []nums = {0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int count=1;
        if(nums.length==0){
            return 0;
        }

        for(int i=1;i<nums.length;i++){
            if(nums[count-1]!=nums[i]){
                nums[count++]=nums[i];
            }
        }
        for(int i=0;i<count;i++){
            System.out.print(nums[i]);
    }

        System.out.println();
        return count;

    }
}
