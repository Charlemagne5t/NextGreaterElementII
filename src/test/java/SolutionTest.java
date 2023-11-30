import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void nextGreaterElementsTest1() {
        int[] nums = {1, 2, 3};
        int[] expected = {2, -1, 2};
        int[] actual = new Solution().nextGreaterElements(nums);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void nextGreaterElementsTest2() {
        int[] nums = {1, 2, 3, 4, 3};
        int[] expected = {2, 3, 4, -1, 4};
        int[] actual = new Solution().nextGreaterElements(nums);

        Assert.assertArrayEquals(expected, actual);
    }

    }
