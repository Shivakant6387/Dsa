package com.springcore001.DSA.string;

//3110. Score of a String
//You are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.
//Return the score of s.
public class ScoreOfAString {
    public static void main(String[] args) {
        System.out.println(scoreOfString("hello"));
    }

    public static int scoreOfString(String s) {
        int score = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return score;
    }
}
