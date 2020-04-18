package com.jorgeparavicini.OOPTest;

public class Aufgabe4
{
    private static int size = 8;

    private static void pyramide(int size)
    {
        Aufgabe4.size = size;
        for (int row = 0; row < size; row++)
        {
            int cur = 0;
            for (int column = 0; column < size*2; column++) {
                if (column < size - 1 - row || column > size - 1 + row) {
                    System.out.print("  ");
                }else {
                    if (column < size) cur += 1;
                    else cur -= 1;
                    System.out.print(cur + " ");
                }
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args)
    {
        pyramide(size);
    }
}
