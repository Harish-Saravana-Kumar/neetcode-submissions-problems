class Solution {
    public boolean isAnagram(String s, String t) {
        int[] s_arr = new int[26];
        int[] t_arr = new int[26];

        for(char ch : s.toCharArray()){
            s_arr[ch - 'a']++;
        }

        for(char ch : t.toCharArray()){
            s_arr[ch - 'a']--;
        }

        for(char ch : t.toCharArray()){
            t_arr[ch- 'a']++;
        }

        for(char ch : s.toCharArray()){
            t_arr[ch- 'a']--;
        }

        for(char ch : s.toCharArray()){
            if(s_arr[ch - 'a'] > 0) return false;
        }

        for(char ch : t.toCharArray()){
            if(t_arr[ch - 'a'] > 0) return false;
        }

        return true;
    }
}
