class Solution {
    public static void main(String[] args){
        Solution sl = new Solution();
        int[] nums={3,2,3};
        System.out.println(sl.majorityElement(nums));

    }
    public int majorityElement(int[] nums) {
        int count=0;
        int cand=0;
        int n= nums.length;
        for(int i=0; i<n; i++)
        {
            if(count==0)
            {
                cand=nums[i];
            }
            if ( cand==nums[i])
            {
                count++;
            }
            else
            {
                count--;
            }
        }

        return cand;
        
    }
}
