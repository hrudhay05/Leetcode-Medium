public class ContainerWithMostWater11 {
    public int maxArea(int[] a) {
        int left = 0;
        int right = a.length - 1;
        int maxArea = 0;
        while (left < right) {
            int area =Math.min(a[left], a[right]) * (right - left);
            maxArea = Math.max(area, maxArea);
            if (a[left] < a[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        ContainerWithMostWater11 solution = new ContainerWithMostWater11();
        
        int[] example1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Max Area for Example 1: " + solution.maxArea(example1));
        int[] example2 = {3, 9, 3, 4, 7, 2, 12, 6};
        System.out.println("Max Area for Example 2: " + solution.maxArea(example2));
    }
}
