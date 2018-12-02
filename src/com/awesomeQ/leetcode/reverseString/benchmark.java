package com.awesomeQ.leetcode.reverseString;

class benchmark

{
    public static void main(String[] args)
    {
        Solution1 s1 = new Solution1();
        Solution2 s2 = new Solution2();

        String test = "12345";
    
        String s1_res = s1.reverseString(test);
        System.out.println(s1_res);

        String s2_res = s2.reverseString(test);
        System.out.println(s2_res);
    }

   
}