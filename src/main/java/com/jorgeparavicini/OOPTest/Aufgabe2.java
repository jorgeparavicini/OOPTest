package com.jorgeparavicini.OOPTest;

import java.util.ArrayList;
import java.util.Arrays;

public class Aufgabe2
{
    /* OUTPUT
    [10, 20, 11, 21, 12, 22, 13, 23, 14, 15]
     */
    public static void main(String[] args)
    {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(10, 11, 12, 13, 14, 15));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(20, 21, 22, 23));

        System.out.println(merge(a, b));
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < Math.max(a.size(), b.size()); i++)
        {
            if (i < a.size()) result.add(a.get(i));
            if (i < b.size()) result.add(b.get(i));
        }

        return result;
    }
}
