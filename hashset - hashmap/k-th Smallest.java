class Solution {
    public int findKthSmallest(int[] nums, int k) {

      
        PriorityQueue<Integer> Set = new PriorityQueue<>((a, b) -> b - a);

        for(int num: nums){
            Set.add(num);
            if(Set.size() > k){
                Set.poll(); 
            }
        }

        return Set.peek(); 
    }
}
