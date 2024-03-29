package com.programming.strings.hackerrank;

/**
 * Given an integer N and a lowercase string. The string is repeated infinitely.
 * The task is to find the No. of occurrences of a given character x in first N letters.
 *
 * https://www.geeksforgeeks.org/count-occurrences-of-a-character-in-a-repeated-string/
 *
 * @author Niloy
 */
public class CountOccurrenceOfRepeatedString {

    private static long getCount(String s, char x, long n) {
        long count = 0;

        //Find the given character count in the given string
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == x)
                count++;
        long repetition = n / s.length();
        count = count * repetition;

        //Find the given char count after completing full repetition
        for (int i = 0; i < n % s.length(); i++) {
            if (s.charAt(i) == x)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(getCount("abcaa", 'a', 21));
    }
}
