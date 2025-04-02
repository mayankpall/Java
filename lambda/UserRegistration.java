package com.bridgelabz.lambda;

import java.util.regex.Pattern;

class InvalidUserDetailException extends Exception {
    public InvalidUserDetailException(String message) {
        super(message);
    }
}

class UserValidator {

    public void verifyFirstName(String firstName) throws InvalidUserDetailException {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        if (!Pattern.matches(regex, firstName)) {
            throw new InvalidUserDetailException("Invalid First Name: " + firstName);
        }
    }

    public void verifyLastName(String lastName) throws InvalidUserDetailException {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        if (!Pattern.matches(regex, lastName)) {
            throw new InvalidUserDetailException("Invalid Last Name: " + lastName);
        }
    }

    public void verifyEmail(String email) throws InvalidUserDetailException {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if (!Pattern.matches(regex, email)) {
            throw new InvalidUserDetailException("Invalid Email: " + email);
        }
    }

    public void verifyPhoneNumber(String phone) throws InvalidUserDetailException {
        String regex = "^\\+91\\s[0-9]{10}$";
        if (!Pattern.matches(regex, phone)) {
            throw new InvalidUserDetailException("Invalid Phone Number: " + phone);
        }
    }

    public void verifyPasswordRuleOne(String password) throws InvalidUserDetailException {
        String regex = "^[a-zA-Z0-9@#$%^&+=]{8,}$";
        if (!Pattern.matches(regex, password)) {
            throw new InvalidUserDetailException("Invalid Password : " + password);
        }
    }

    public void verifyPasswordRuleTwo(String password) throws InvalidUserDetailException {
        String regex = "^(?=.*[A-Z]).{8,}$";
        if (!Pattern.matches(regex, password)) {
            throw new InvalidUserDetailException("Invalid Password : " + password);
        }
    }

    public void verifyPasswordRuleThree(String password) throws InvalidUserDetailException {
        String regex = "^(?=.*[0-9]).{8,}$";
        if (!Pattern.matches(regex, password)) {
            throw new InvalidUserDetailException("Invalid Password : " + password);
        }
    }

    public void verifyPasswordRuleFour(String password) throws InvalidUserDetailException {
        String regex = "^(?=.*[@#$%^&+=]).{8,}$";
        if (!Pattern.matches(regex, password)) {
            throw new InvalidUserDetailException("Invalid Password : " + password);
        }
    }
}

public class UserRegistration {
    public static void main(String[] args) {
        UserValidator validator = new UserValidator();

        try {
            validator.verifyFirstName("Mayank");
            validator.verifyFirstName("m");
        } catch (InvalidUserDetailException e) {
            System.out.println(e.getMessage());
        }

        try {
            validator.verifyLastName("Pal");
            validator.verifyLastName("p");
        } catch (InvalidUserDetailException e) {
            System.out.println(e.getMessage());
        }

        try {
            validator.verifyEmail("mayankpal@gmail.com");
            validator.verifyEmail("invalidemail@");
        } catch (InvalidUserDetailException e) {
            System.out.println(e.getMessage());
        }

        try {
            validator.verifyPhoneNumber("+91 7082519168");
            validator.verifyPhoneNumber("7082519168");
        } catch (InvalidUserDetailException e) {
            System.out.println(e.getMessage());
        }

        try {
            validator.verifyPasswordRuleOne("abcd1234@");
            validator.verifyPasswordRuleTwo("abcd1234@");
        } catch (InvalidUserDetailException e) {
            System.out.println(e.getMessage());
        }
    }
}
