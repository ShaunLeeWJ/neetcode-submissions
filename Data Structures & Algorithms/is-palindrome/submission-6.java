class Solution {
    public boolean isPalindrome(String s) {
        // set up pointers
        int l = 0;
        int r = s.length() - 1; 

        while (l < r) {
            // move pointers inwards if there are non alphanumeric characters
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }

            // Compare the character at both pointers, if not the same return false. else return true
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }

            l++;
            r--;
        }
        return true;
    }
}
