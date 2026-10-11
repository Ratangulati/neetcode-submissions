class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int diff = target - nums[i];
            // for (int j = i + 1 ; j < n; j++) {
            //     if (nums[j] == diff) {
            //         return new int[] {i,j};
            //     }
            // }

            if (map.containsKey(diff)) {
                return new int[] {map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
