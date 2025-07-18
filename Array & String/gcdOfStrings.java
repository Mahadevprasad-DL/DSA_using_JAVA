class Solution {
    public static void main(String[] args){
        String str1="ABCABCABC";
        String str2= "ABC";
        Solution sl = new Solution();
        System.out.println(sl.gcdOfStrings(str1, str2));
    }
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2+ str1)){
            return "";
        }

        int gcdlength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdlength);
    }

    private int gcd ( int a, int b){
        return b ==0? a : gcd(b, a%b);
    }
}