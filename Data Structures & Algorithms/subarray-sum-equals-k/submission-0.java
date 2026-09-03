class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int ans = 0;
        //2, 1, 2, 4
        for(int num: nums) {
            sum = sum + num;
            int complement = sum - k;
            if(map.containsKey(complement)) {
                ans = ans + map.get(complement);

            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return ans;
    }
}