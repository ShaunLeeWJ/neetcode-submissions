class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> count = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) + 1);
            count.put(t.charAt(i), count.getOrDefault(t.charAt(i), 0) - 1);

/*
The Logic:
Increment (+1) for each character in s
Decrement (-1) for each character in t

Iteration 1 (i = 0):
s.charAt(0) = 'a'

count.getOrDefault('a', 0) = 0 (first time seeing 'a')
count.put('a', 0 + 1) → Map: {'a': 1}
t.charAt(0) = 'c'

count.getOrDefault('c', 0) = 0 (first time seeing 'c')
count.put('c', 0 - 1) → Map: {'a': 1, 'c': -1}
Iteration 2 (i = 1):
s.charAt(1) = 'b'

count.getOrDefault('b', 0) = 0
count.put('b', 0 + 1) → Map: {'a': 1, 'c': -1, 'b': 1}
t.charAt(1) = 'b'

count.getOrDefault('b', 0) = 1 (we just added 'b': 1)
count.put('b', 1 - 1) → Map: {'a': 1, 'c': -1, 'b': 0}
Iteration 3 (i = 2):
s.charAt(2) = 'c'

count.getOrDefault('c', 0) = -1
count.put('c', -1 + 1) → Map: {'a': 1, 'c': 0, 'b': 0}
t.charAt(2) = 'a'

count.getOrDefault('a', 0) = 1
count.put('a', 1 - 1) → Map: {'a': 0, 'c': 0, 'b': 0}
*/
        }

        for (int val : count.values()) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }
}
