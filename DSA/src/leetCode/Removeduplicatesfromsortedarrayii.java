package leetCode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Removeduplicatesfromsortedarrayii {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2,2, 3};
        int c = removeDuplicates(nums);
        System.out.println(c);
    }

    public static int removeDuplicates(int[] nums) {
       int count=2;
        for (int i = 2; i < nums.length; i++) {
           if(nums[count-2]!=nums[i]){
               nums[count++]=nums[i];

           }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();
        return count;
    }


}
