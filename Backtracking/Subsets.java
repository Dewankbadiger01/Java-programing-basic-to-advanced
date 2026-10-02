import java.util.*;
public class Subsets{
    static void backtrack(int index, int[] nums, List<List<Integer>> result, List<Integer> current) {
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        // Exclude current element
        backtrack(index + 1, nums, result, current);
        // Include current element
        current.add(nums[index]);
        backtrack(index + 1, nums, result, current);
        current.remove(current.size() - 1);
    }
    public static void main(String[] args){
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, result, new ArrayList<>());
        System.out.println(result);
    }
}