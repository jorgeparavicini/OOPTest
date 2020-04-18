package com.jorgeparavicini.OOPTest;

import java.util.ArrayList;
import java.util.Arrays;

/* OUTPUT
abend
allad
 */
public class Aufgabe7
{
    private static void printWords(ArrayList<String> words) {
        words.forEach((word) -> {
            if (word.startsWith("a") && word.length() == 5) {
                System.out.println(word);
            }
        });
    }

    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("hans", "abend", "peter", "allad", "lisa"));
        printWords(words);
    }
}
