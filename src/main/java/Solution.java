
import java.util.Stack;

public class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] >= max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        int dif = n - 1 - maxIndex;
        int[] shifted = new int[n];
        for (int i = 0; i < n; i++) {
            shifted[(i + dif) % n] = nums[i];
        }
        Stack<Integer> stack = new Stack<>();
        int[] shiftedResult = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int cur = shifted[i];
            while (!stack.isEmpty() && stack.peek() <= cur) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                shiftedResult[i] = -1;
            } else shiftedResult[i] = stack.peek();
            stack.push(cur);
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = shiftedResult[(i + dif) % n];
        }
        return result;
    }
}
