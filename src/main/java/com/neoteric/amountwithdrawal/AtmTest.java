package com.neoteric.amountwithdrawal;

import java.util.Scanner;

public class AtmTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean isLoginSuccessful;

        System.out.print("Enter username: ");
        String enteredUsername = input.nextLine();
        try{
            if(enteredUsername.isEmpty()){
                throw new EmptyUsernameException("Username cannot be empty");
            }else{
                System.out.print("Enter password: ");
                String enteredPassword = input.nextLine();
                if(enteredPassword.isEmpty()){
                    throw new EmptyPasswordException("Password cannot be empty");
                }else{
                    Login login = new Login(enteredUsername, enteredPassword);
                    isLoginSuccessful = login.validateLogin();
                }
            }
            if(isLoginSuccessful){
                AtmServices services = new AtmServices();
                services.services();
            }
        }catch (RuntimeException e) {
            System.out.println("Caught UncheckedException: " + e.getMessage());
        }catch(Exception e) {
            System.out.println("Caught CheckedException: " + e.getMessage());
        }finally{
            System.out.println("Thank you for using our ATM Services!");
        }
        input.close();
    }
}
