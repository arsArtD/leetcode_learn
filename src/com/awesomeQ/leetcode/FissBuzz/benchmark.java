/**
Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.

Example:

n = 15,
 
Return:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]

*/

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