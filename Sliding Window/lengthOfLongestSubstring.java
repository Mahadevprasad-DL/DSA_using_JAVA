class Solution {

    public static void main(String[] args){
        String s="hh";
        Solution sl = new Solution();
        System.out.println(sl.lengthOfLongestSubstring(s));

    }
    
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int maxlength=0,  start=0;

        for(int end =0; end<s.length(); end++)
        {
            char ch = s.charAt(end);
            if(map.containsKey(ch))
            {
                start = Math.max(start, map.get(ch) + 1);
            }

            map.put(ch, end);
            maxlength = Math.max(maxlength, end - start + 1);
        }

        return maxlength;
        
    }
}