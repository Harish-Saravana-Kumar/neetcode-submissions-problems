
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int val : nums){
            map.put(val,map.getOrDefault(val,0)+1);
            if(map.get(val) > 1) return true;
        }
        return false;
    }
}