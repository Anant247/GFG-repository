class Solution {
    public int longestKSubstr(String s, int k) {
        int n = s.length();
        int low = 0;
        int res = -1;
        Map<Character, Integer> freq = new HashMap<>();
        
        for(int high = 0; high<n; high++){
            char c = s.charAt(high);
            freq.put(c, freq.getOrDefault(c,0) + 1);
            
            while(freq.size() > k){
                char ch = s.charAt(low);
                freq.put(ch, freq.get(ch) - 1);
                if(freq.get(ch) == 0){
                    freq.remove(ch);
                }
                low++;
            }
            if(freq.size() == k){
                res = Math.max(res, high - low + 1);
            }
        }
        return res;
    }
}