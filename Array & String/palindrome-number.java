class Solution {
    public boolean isPalindrome(int x) {
        if( x < 0) return false;
        char[] s = String.valueOf(x).toCharArray();

        int i =0;
        int j= s.length-1;
        while( i<j){
            if(s[i] != s[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
}