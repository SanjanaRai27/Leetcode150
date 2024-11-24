public class RemoveElements {
    public static int removeElement(int[] nums, int val) {
        int k = 0; // Tracks the count of elements not equal to val
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val, move it to the front
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        
        return k; // Return the count of elements not equal to val
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int k1 = removeElement(nums1, val1);
        System.out.println("Output: " + k1); // Output: 2
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        // Example 2
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int k2 = removeElement(nums2, val2);
        System.out.println("Output: " + k2); // Output: 5
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
    }
}
