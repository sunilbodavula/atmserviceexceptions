package com.neoteric.amountwithdrawal;

public class InvalidAtmServiceException extends RuntimeException{
    public InvalidAtmServiceException(String message){
        super(message);
    }
}
