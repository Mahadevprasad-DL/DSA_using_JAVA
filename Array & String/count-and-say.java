class Solution {
    public String countAndSay(int n) {
        if(n <=0) return "";
        String s="1";
        for(int i=1; i<n; i++){
            StringBuilder sb = new StringBuilder();
            char cur = s.charAt(0);
            int count =1;
            for(int j=1; j<s.length(); j++){
                if(s.charAt(j) == cur){
                    count ++;
                } else {
                    sb.append(count).append(cur);
                    cur =s.charAt(j);
                    count =1;
                }
            }
            sb.append(count).append(cur);
            s = sb.toString();
        }
        return s;
        
    }
}