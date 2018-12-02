package com.awesomeQ.leetcode.reverseString;

class Solution2 {
    public String reverseString(String s) {
        char[] word = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            word[i] = (char) (word[i] ^ word[j]);
            word[j] = (char) (word[i] ^ word[j]);
            word[i] = (char) (word[i] ^ word[j]);
            i++;
            j--;
        }
        return new String(word);
    }
}
