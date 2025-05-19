package com.springcore001.DSA.string;

public class FinalValueOfVariableAfterPerformingOperations {
    public static void main(String[] args) {
        String[] strings = {"--X", "X++", "X++"};
        String[] strings2 = {"++X", "++X", "X++"};
        String[] strings3 = {"X++", "++X", "--X", "X--"};
        System.out.println(finalValueAfterOperations(strings));
        System.out.println(finalValueAfterOperations(strings2));
        System.out.println(finalValueAfterOperations(strings3));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (String op : operations) {
            if (op.contains("+")) {
                X++;
            } else {
                X--;
            }
        }
        return X;
    }
}
