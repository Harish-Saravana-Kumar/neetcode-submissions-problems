class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
        // System.out.println(map);

        for(int i=0;i<n;i++){
            int second = target-nums[i];

            if(map.containsKey(second) && map.get(second) != i){
                return new int[] {i,map.get(second)};
            }
        }

       return new int[] {};
    }
}
