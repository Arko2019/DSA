package leetCode;

public class Merge_sorted_array88 {
    public static void main(String[] args) {
        int[] nums1 = {2, 0};
        int m = 1;
        int[] nums2 = {1};
        int n = 1;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        for (int i = nums1.length - 1; i >= 0; i--) {
            if (m>=0 && nums1[m] > nums2[n]) {
                nums1[i] = nums1[m];
                m--;
            } else {
                nums1[i] = nums2[n];
                n--;
            }
        }

        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i]);
        }
    }
}
