package leetCode;

import java.util.HashMap;
import java.util.Map;

public class Majority_Element {
    public static void main(String[] args) {
        int []nums={3,2,3};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        int element=nums[0];
        int count=0;
        for(int i=0,j=0;i<nums.length;i++){
            if(count==0){
                element=nums[i];
            }
            if(nums[i]!=element){
                count--;

            }
            else{
                count++;
            }
        }
        return element;

    }
}
