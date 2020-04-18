package com.jorgeparavicini.OOPTest;

/* OUTPUT
5
 */
public class Aufgabe6
{
    int count = 0;

    void A() throws Exception
    {
        try
        {
            count++;
            try
            {
                count++;
                try
                {
                    count++;
                    throw new Exception();
                } catch (Exception e)
                {
                    count++;
                    throw new Exception();
                }
            } catch (Exception e)
            {
                count++;
            }
        } catch (Exception e) {
            count++;
        }
    }

    void display() {
        System.out.println(count);
    }

    public static void main(String[] args) throws Exception
    {
        Aufgabe6 instance = new Aufgabe6();
        instance.A();
        instance.display();
    }
}
