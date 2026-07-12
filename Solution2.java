import java.util.*;

class Solution2 {
    public int[] arrayRankTransform(int[] arr) {

        // If array is empty
        if (arr.length == 0) {
            return arr;
        }

        // Copy the original array
        int[] sorted = arr.clone();

        // Sort the copied array
        Arrays.sort(sorted);

        // Store rank of each unique element
        HashMap<Integer, Integer> rankMap = new HashMap<>();

        int rank = 1;

        for (int num : sorted) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank);
                rank++;
            }
        }

        // Replace each element with its rank
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rankMap.get(arr[i]);
        }

        return arr;
    }
}