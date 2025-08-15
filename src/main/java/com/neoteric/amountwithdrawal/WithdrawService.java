package com.neoteric.amountwithdrawal;

public class WithdrawService {
    public void withdraw(int amount) throws InSufficientBalanceException{
        AccountDetails accountDetails = new AccountDetails();
        int balance = accountDetails.getBalance();
        if(balance < amount){
            throw new InSufficientBalanceException("Insufficient balance");
        }else{
            System.out.println("Transaction successful, remaining balance: " + (balance - amount));
        }
    }
}
