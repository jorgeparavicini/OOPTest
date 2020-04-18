package com.jorgeparavicini.OOPTest;

/* OUTPUT
The price can not be negative
 */
public class Aufgabe5
{
    int guthaben = 0;

    public void guthabenpruefung(int preis) throws NegativePriceException
    {
        if (preis < 0) {
            throw new NegativePriceException("The price can not be negative");
        }

        guthaben += preis;
    }

    public static void main(String[] args)
    {
        Aufgabe5 instance = new Aufgabe5();
        try
        {
            instance.guthabenpruefung(-5);
        } catch (NegativePriceException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
