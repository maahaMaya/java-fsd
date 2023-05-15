package longetIncreasingSequence;
import java.util.ArrayList;  
import java.util.List;

public class LongestIncresingSequence {
    static List<Integer> findLIS(int[] arr) {
        List<List<Integer>> cache = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            cache.add(new ArrayList<>());
        }

        cache.get(0).add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && cache.get(i).size() < cache.get(j).size() + 1) {
                    cache.set(i, new ArrayList<>(cache.get(j)));
                }
            }
            cache.get(i).add(arr[i]);
        }

        List<Integer> longest = cache.get(0);
        for (int i = 0; i < cache.size(); i++) {
            if (longest.size() < cache.get(i).size()) {
                longest = new ArrayList<>(cache.get(i));
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {0, 9, 4, 16, 2, 10, 6, 24, 1, 9, 5, 13, 0, 11, 27, 15};
        System.out.println(findLIS(arr).toString());
    }
}
