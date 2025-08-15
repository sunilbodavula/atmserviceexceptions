package com.neoteric.amountwithdrawal;

public class AccountDetails {
    private String username;
    private String password;
    private int balance;

    public AccountDetails() {
        this("neoteric", "12345", 5000);
    }

    public AccountDetails(String username, String password, int balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getBalance(){
        return balance;
    }
}
