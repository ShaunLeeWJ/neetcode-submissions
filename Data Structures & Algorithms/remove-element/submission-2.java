class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> temp = new ArrayList<>(); // create new list to store non-val elements

        for (int num : nums) {
            if (num != val) {
                temp.add(num); // add non-val elements into temp list
            }
        }

        for (int i = 0; i < temp.size(); i++) {
            nums[i] = temp.get(i); //copy them back to the front of nums
        }

        return temp.size(); // retrun count of non-val elements
    }
}