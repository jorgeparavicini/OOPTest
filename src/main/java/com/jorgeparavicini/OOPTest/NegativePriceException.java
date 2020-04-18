package com.jorgeparavicini.OOPTest;

public class NegativePriceException extends Exception
{
    public NegativePriceException(String errorMessage) {
        super(errorMessage);
    }
}
