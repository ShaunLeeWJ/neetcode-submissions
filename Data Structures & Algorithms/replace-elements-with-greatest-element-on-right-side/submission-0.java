class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length; // stores the array length
        int[] ans = new int[n]; // New array for the output
        int rightMax = -1; // Set the right most elements as -1

        for (int i = n - 1; i >= 0; i--) { // iterate the array from right to left
            ans[i] = rightMax;
            rightMax = Math.max(rightMax, arr[i]);
        }
        return ans;
    }
}