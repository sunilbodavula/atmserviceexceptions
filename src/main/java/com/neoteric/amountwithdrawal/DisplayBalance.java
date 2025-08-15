package com.neoteric.amountwithdrawal;

public class DisplayBalance {
    public void displayBalance(){
        int balance;
        AccountDetails balanceDetails = new AccountDetails();
        balance = balanceDetails.getBalance();

        System.out.println("Available Balance: " + balance);
    }
}
