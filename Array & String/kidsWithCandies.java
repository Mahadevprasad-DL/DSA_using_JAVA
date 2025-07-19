import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;

        Solution sl = new Solution();
        List<Boolean> result = sl.kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> result = new ArrayList<>();

        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }

        return result;
    }
}
