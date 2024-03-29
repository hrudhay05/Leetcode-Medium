import java.util.*;

class Goodpairs1512 {
    public int numIdenticalPairs(int[] nums) {
        int[] c = new int[102];
        for (int n : nums) {
            c[n]++;
        }
        int total = 0;
        for (int i : c) {
            total = total + ((i) * (i - 1) / 2);
        }
        return total;
    }

    public static void main(String[] args) {
        Goodpairs1512 solution = new Goodpairs1512();

        // Test cases
        int[] nums1 = {1, 2, 3, 1, 1, 3};
        System.out.println("Number of identical pairs: " + solution.numIdenticalPairs(nums1));

        int[] nums2 = {1, 1, 1, 1};
        System.out.println("Number of identical pairs: " + solution.numIdenticalPairs(nums2));

        int[] nums3 = {1, 2, 3};
        System.out.println("Number of identical pairs: " + solution.numIdenticalPairs(nums3));
    }
}
