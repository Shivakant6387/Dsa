package com.springcore001.DSA.string;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("ABCBA"));
        System.out.println(isPal("ABCBA"));
    }

    //Naive Method
    static boolean isPalindrome(String sts) {
        StringBuilder builder = new StringBuilder(sts);
        builder.reverse();
        return sts.equals(builder.toString());
    }

    //Efficient Method
    static boolean isPal(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
