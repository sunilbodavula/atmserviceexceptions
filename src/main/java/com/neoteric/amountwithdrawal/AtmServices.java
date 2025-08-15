package com.neoteric.amountwithdrawal;
import java.util.Scanner;

public class AtmServices {
    public void services() throws InSufficientBalanceException{
        String atmService;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 'Display' to show the available balance");
        System.out.println("Enter 'Withdraw' to withdraw amount");
        atmService = input.nextLine();
        if(atmService.equals("Display")){
            DisplayBalance display = new DisplayBalance();
            display.displayBalance();
        }else if(atmService.equals("Withdraw")){
            System.out.print("Enter amount to withdraw: ");
            int amount = input.nextInt();
            if(amount < 100 || amount % 100 != 0){
                throw new InvalidAmountException("Amount must be in Hundreds");
            }else {
                WithdrawService withdraw = new WithdrawService();
                withdraw.withdraw(amount);
            }
        }else {
            throw new InvalidAtmServiceException("Invalid ATM service: Enter 'Display' or 'Withdraw'");
        }
        input.close();
    }
}
