package com.awesomeQ.leetcode.FissBuzz;

import java.util.List;

class benchmark

{
    public static void main(String[] args) {
        solution1 s1 = new solution1();

        int n = 23;

        List<String> s1_res = s1.fizzBuzz(n);
        for (String strval : s1_res) {
            System.out.println(strval);
        }
    }

}