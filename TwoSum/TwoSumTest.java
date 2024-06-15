
public class TwoSumTest {
    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        test(obj);
        testWithNegativeNumbers(obj);
        testWithZeroes(obj);
        testWithDuplicates(obj);
        testNoSolution(obj);
    }

    public static void test(TwoSum obj) {
        int expected[] = { 0, 2 };
        int arr[] = { 2, 3, 4, 6, 9 };
        int[] result = obj.twoSum(arr, 6);
        if (result == null) {
            System.out.println("Failed Test case 1");
        } else if (result[0] == expected[0] && result[1] == expected[1]) {
            System.out.println("Test case 1 passed successfully");
        } else {
            System.out.println("Failed Test case 1");
        }

    }

    public static void testWithNegativeNumbers(TwoSum obj) {
        int[] expected = { 1, 3 };
        int[] arr = { 1, -2, 4, -1 };
        int[] result = obj.twoSum(arr, -3);

        if (result == null) {
            System.out.println("Failed Test case 2");
        } else if (result[0] == expected[0] && result[1] == expected[1]) {
            System.out.println("Test case 2 passed successfully");
        } else {
            System.out.println("Failed Test case 2");
        }
    }

    public static void testWithZeroes(TwoSum obj) {
        int[] expected = { 0, 4 };
        int[] arr = { 0, 1, 2, 3, 0 };
        int[] result = obj.twoSum(arr, 0);

        if (result == null) {
            System.out.println("Failed Test case 3");
        } else if (result[0] == expected[0] && result[1] == expected[1]) {
            System.out.println("Test case 3 passed successfully");
        } else {
            System.out.println("Failed Test case 3");
        }
    }

    public static void testWithDuplicates(TwoSum obj) {
        int[] expected = { 2, 4 };
        int[] arr = { 1, 5, 3, 3, 6 };

        int[] result = obj.twoSum(arr, 9);

        if (result == null) {
            System.out.println("Failed Test case 4");
        } else if (result[0] == expected[0] && result[1] == expected[1]) {
            System.out.println("Test case 4 passed successfully");
        } else {
            System.out.println("Failed Test case 4");
        }
    }

    public static void testNoSolution(TwoSum obj) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] result = obj.twoSum(arr, 10);
        if (result == null) {
            System.out.println("Test case 5 passed successfully");
        } else {
            System.out.println("Failed Test case 5");
        }
    }

}
