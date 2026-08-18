class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length() ){
            return false;
        }
        else {
            char tempArrayS[] = s.toCharArray();
            char tempArrayT[] = t.toCharArray();
            
             Arrays.sort(tempArrayS);
             Arrays.sort(tempArrayT);
             return Arrays.equals(tempArrayS, tempArrayT);
        }
    }
}
