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
        }catch (EmptyUsernameException e) {
            System.out.println("Caught EmptyUsernameException: " + e.getMessage());
        }catch (EmptyPasswordException e) {
            System.out.println("Caught EmptyPasswordException: " + e.getMessage());
        }catch (InvalidUsernameException e){
            System.out.println("Caught InvalidUsernameException: " + e.getMessage());
        }catch (InvalidPasswordException e){
            System.out.println("Caught InvalidPasswordException: " + e.getMessage());
        }catch (InSufficientBalanceException e){
            System.out.println("Caught InSufficientBalanceException: " + e.getMessage());
        }catch (InvalidAmountException e){
            System.out.println("Caught InvalidAmountException: " + e.getMessage());
        }catch (InvalidAtmServiceException e){
            System.out.println("Caught InvalidAtmServiceException: " + e.getMessage());
        }

    }
}
