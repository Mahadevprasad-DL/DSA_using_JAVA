class Solution {

    public static void main(String args){
        Solution sol = new Solution();
        String s="A man, a plan, a canal: Panama";
        System.out.println(sol.isPalindrome(s));
    }
    public boolean isPalindrome(String s) {
        s= s.toLowerCase().replaceAll("[^a-z0-9A-Z]", "");
        int i=0;
        int j=s.length()-1;
        while( i<= j){
            if(s.charAt(i) != s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}
