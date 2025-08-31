class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> Set = new PriorityQueue<>();

        for(int num: nums){
            Set.add(num);
            if(Set.size() > k){
                Set.poll();
            }
        }

        return Set.peek();
        
    }
}