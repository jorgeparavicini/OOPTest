package com.jorgeparavicini.OOPTest;

/* OUTPUT
X
Y
X.m1
Y.m1
X
Y
Z
X.m1
Y.m1
Z.m1
 */
public class Aufgabe3
{
    private class X
    {
        X()
        {
            System.out.println("X");
        }

        void m1()
        {
            System.out.println("X.m1");
        }
    }

    private class Y extends X
    {
        Y()
        {
            System.out.println("Y");
        }

        void m1()
        {
            super.m1();
            System.out.println("Y.m1");
        }
    }

    private class Z extends Y
    {
        Z()
        {
            System.out.println("Z");
        }

        void m1()
        {
            super.m1();
            System.out.println("Z.m1");
        }
    }

    private void test()
    {
        X x = new Y();
        x.m1();

        Z z = new Z();
        z.m1();
    }

    public static void main(String[] args)
    {
        Aufgabe3 instance = new Aufgabe3();
        instance.test();
    }
}
