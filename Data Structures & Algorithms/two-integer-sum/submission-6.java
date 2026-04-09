class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }

        System.out.println(map);

        for(int i=0;i<n;i++){
            int temp = target-nums[i];
            if(map.containsKey(temp) && (i != map.get(temp))){
                return new int[]{i,map.get(temp)};
            }
        }

        return new int[] {};
    }
}
