/*Given two string s and t, write a function to check if s contains all characters of t (in the same order as they are in string t).
Return true or false.
Do it recursively.
E.g. : s = “abchjsgsuohhdhyrikkknddg” contains all characters of t=”coding” in the same order. So function will return true.
*/
package com.ds.TestProblems;


import java.util.Scanner;

public class StringSubsequence {

	public static boolean checkSequence(String s, String t) {
        int i = 0;
        int j = 0;
        if(s == null || t == null)
            return false;
        while (i < s.length()) {
            if (j == t.length()) {
                return true;
            }
            if (t.charAt(j) == s.charAt(i)) {
                j++;
            }
            i++;
        }
        
        return j == t.length();
	}
    	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);

		String large = s.nextLine();
		String small = s.nextLine();

		System.out.println(checkSequence(large, small));
		s.close();
		

	}

}
