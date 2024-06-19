//Approach 1
class Solution {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (uniques.contains(nums[i])) {
                return true;
            }
            uniques.add(nums[i]);
        }
        return false;
    }
}



//Approach 2
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int i = 1;
        int n = nums.length;

        while (i < n) {
            if (nums[i] == nums[i-1]) {
                return true;
            } else if (nums[i] < nums[i-1]) {
                for (int j = i-2; j >= 0; j--) {
                    if (nums[i] == nums[j]) return true;
                }
                int temp = nums[i];
                nums[i] = nums[i-1];
                nums[i-1] = temp;
            }
            i++;
        }
        return false;
    }
}