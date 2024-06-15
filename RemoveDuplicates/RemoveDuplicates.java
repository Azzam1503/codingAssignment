import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
    public ArrayList<Integer> removeDuplicate(int[] arr) {
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                continue;
            }

            output.add(arr[i]);
            map.put(arr[i], true);
        }

        return output;
    }
}
