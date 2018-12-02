package com.awesomeQ.leetcode.moveZeroes;

class moveZeroes
{
  
    public static void main(String[] args)
    {
        
        String str = "321023021";
 
        char[] arrayV = str.toCharArray();
 
        if (arrayV == null || arrayV.length == 0) return;        
 
        int insertPos = 0;
        for (char charV: arrayV) {
            if (charV != '0') arrayV[insertPos++] = charV;
        }        
    
        while (insertPos < arrayV.length) {
            arrayV[insertPos++] = '0';
        }
        
        System.out.println(arrayV);
    }

}