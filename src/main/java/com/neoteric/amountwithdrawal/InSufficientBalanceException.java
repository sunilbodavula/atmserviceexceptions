package com.neoteric.amountwithdrawal;

public class InSufficientBalanceException extends Exception{
    public InSufficientBalanceException(String message){
        super(message);
    }
}
