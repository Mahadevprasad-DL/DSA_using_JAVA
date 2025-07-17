class Solution {

    public static void main(String[] args){
        int nums[] ={1,4,4};
        int target=4;
        Solution sol = new Solution();
        System.out.println(sol.minSubArrayLen(target, nums));
    }
    public int minSubArrayLen(int target, int[] nums) {

        int currentsum = 0;
        int low = 0;
        int minlenwindow = Integer.MAX_VALUE; 

       
        for (int high = 0; high < nums.length; high++) {
            currentsum += nums[high]; 

            while (currentsum >= target) {
                int currentwindow = high - low + 1; 
                minlenwindow = Math.min(minlenwindow, currentwindow); 
                currentsum -= nums[low]; 
                low++;
            }
        }

        return minlenwindow == Integer.MAX_VALUE ? 0 : minlenwindow;
    }
}
