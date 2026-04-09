class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(char ch : s.toCharArray()){
            freq1[ch-'a']++;
        }

        for(char ch : t.toCharArray()){
            freq2[ch-'a']++;
        }

        for(char ch : t.toCharArray()){
            freq1[ch-'a']--;
        }

        for(char ch : s.toCharArray()){
            freq2[ch-'a']--;
        }

        for(char ch : s.toCharArray()){
            if(freq1[ch-'a'] > 0) return false;
        }

        for(char ch : t.toCharArray()){
            if(freq2[ch-'a'] > 0) return false;
        }

        return true;

    }
}
