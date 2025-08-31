class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> Set = new HashSet<>();
        for(int n2 : nums2){
            Set.add(n2);
        }

        ArrayList<Integer> List  = new ArrayList<>();
        for(int n1 : nums1){
            if(Set.contains(n1)){
                List.add(n1);
                Set.remove(n1);
            }
        }

        int[] res = new int[List.size()];    
        for(int i=0; i<List.size(); i++){
            res[i] = List.get(i);
        }

        return res;
        
    }
}