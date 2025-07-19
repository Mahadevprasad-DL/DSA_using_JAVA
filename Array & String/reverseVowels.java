class Solution {
    
    public static void main(String[] args){
         String input = "Hello";
        Solution sl = new Solution();
       System.out.println(sl.reverseVowels(input));
    }
    public String reverseVowels(String s) {
        String Vowels = "aeiouAEIOU";
        char[] ch = s.toCharArray();
        int i =0,  j = ch.length-1;

       while (i < j) {
            if (Vowels.indexOf(ch[i]) == -1) {
                i++;
            } else if (Vowels.indexOf(ch[j]) == -1) {
                j--;
            } else {
                char temp = ch[i];
                ch[i++] = ch[j];
                ch[j--] = temp;
            }
        }

        return new String(ch);
        
    }
}