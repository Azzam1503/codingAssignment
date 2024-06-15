import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesTest {
    public static void main(String[] args) {
        RemoveDuplicates obj = new RemoveDuplicates();
        testRemoveDuplicateWithDuplicates(obj);
        testRemoveDuplicateWithoutDuplicates(obj);
        testRemoveDuplicateEmptyArray(obj);
        testRemoveDuplicateSingleElementArray(obj);
        testRemoveDuplicateWithNegativeNumbers(obj);
        testRemoveDuplicateAllSame(obj);
    }

    public static boolean check(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list1.size() != list2.size())
            return false;

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != list2.get(i))
                return false;
        }

        return true;
    }

    public static void testRemoveDuplicateWithDuplicates(RemoveDuplicates obj) {
        int[] arr = { 1, 2, 3, 2, 4, 5, 1, 6 };

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        ArrayList<Integer> result = obj.removeDuplicate(arr);
        boolean checked = check(expected, result);
        if (checked) {
            System.out.println("Test case 1 passed successfully");
        } else {
            System.out.println("Test case 1 failed");
        }
    }

    public static void testRemoveDuplicateWithoutDuplicates(RemoveDuplicates obj) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<Integer> result = obj.removeDuplicate(arr);
        boolean checked = check(expected, result);
        if (checked) {
            System.out.println("Test case 2 passed successfully");
        } else {
            System.out.println("Test case 2 failed");
        }
    }

    public static void testRemoveDuplicateEmptyArray(RemoveDuplicates obj) {
        int[] arr = {};

        ArrayList<Integer> expected = new ArrayList<>();
        ArrayList<Integer> result = obj.removeDuplicate(arr);
        boolean checked = check(expected, result);
        if (checked) {
            System.out.println("Test case 3 passed successfully");
        } else {
            System.out.println("Test case 3 failed");
        }
    }

    public static void testRemoveDuplicateSingleElementArray(RemoveDuplicates obj) {
        int[] arr = { 1 };

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> result = obj.removeDuplicate(arr);
        boolean checked = check(expected, result);
        if (checked) {
            System.out.println("Test case 4 passed successfully");
        } else {
            System.out.println("Test case 4 failed");
        }
    }

    public static void testRemoveDuplicateWithNegativeNumbers(RemoveDuplicates obj) {
        int[] arr = { 1, -2, 3, 2, -2, 4, 5, 1, 6, -1 };

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, -2, 3, 2, 4, 5, 6, -1));
        ArrayList<Integer> result = obj.removeDuplicate(arr);
        boolean checked = check(expected, result);
        if (checked) {
            System.out.println("Test case 5 passed successfully");
        } else {
            System.out.println("Test case 5 failed");
        }
    }

    public static void testRemoveDuplicateAllSame(RemoveDuplicates obj) {
        int[] arr = { 7, 7, 7, 7, 7, 7 };

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(7));
        ArrayList<Integer> result = obj.removeDuplicate(arr);
        boolean checked = check(expected, result);
        if (checked) {
            System.out.println("Test case 6 passed successfully");
        } else {
            System.out.println("Test case 6 failed");
        }
    }

}
