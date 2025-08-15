package com.neoteric.amountwithdrawal;

public class Login {
    private String enteredUsername;
    private String enteredPassword;

    AccountDetails loginDetails = new AccountDetails();
    String username = loginDetails.getUsername();
    String password = loginDetails.getPassword();


    public Login(String enteredUsername, String enteredPassword) {
        this.enteredUsername = enteredUsername;
        this.enteredPassword = enteredPassword;
    }

    public boolean validateLogin() throws InvalidUsernameException, InvalidPasswordException {
        if (enteredUsername.equals(username)){
            if(enteredPassword.equals(password)){
                return true; // Login successful
            } else {
                throw new InvalidPasswordException("Invalid Password");
            }
        } else {
            throw new InvalidUsernameException("Invalid Username");
        }
    }



}
