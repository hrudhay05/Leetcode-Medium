import java.util.List;
import java.util.ArrayList;

public class FindAllDuplicatesinanArray442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0) {
                result.add(index + 1);
            }
            nums[index] = nums[index] * -1;
        }
        return result;
    }

    public static void main(String[] args) {
        FindAllDuplicatesinanArray442 solution = new FindAllDuplicatesinanArray442();
        int[] example1 = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> duplicates1 = solution.findDuplicates(example1);
        System.out.println("Duplicates in Example 1: " + duplicates1);
        int[] example2 = {1, 1, 2, 2, 3, 4, 5, 5};
        List<Integer> duplicates2 = solution.findDuplicates(example2);
        System.out.println("Duplicates in Example 2: " + duplicates2);
    }
}
