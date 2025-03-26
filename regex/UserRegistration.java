package com.bridgelabz.regex;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UC {
    public boolean verifyUser(String name) {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        return Pattern.matches(regex, name);
    }



    public boolean verifyEmail(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return Pattern.matches(regex, email);
    }



    public boolean verifyPhoneNumber(String phone) {
        String regex = "^\\+91\\s[0-9]{10}$";
        return Pattern.matches(regex, phone);
    }



    public boolean verifyPasswordRuleOne(String password) {
        String regex = "^[a-zA-Z0-9@#$%^&+=]{8,}$";
        return Pattern.matches(regex, password);
    }



    public boolean verifyPasswordRuleTwo(String password) {
        String regex = "^(?=.*[A-Z]).{8,}$";
//        return Pattern.matches(regex, password);

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();


    }



    public boolean verifyPasswordRuleThree(String password) {
        String regex = "^(?=.*[0-9]).{8,}$";
        return Pattern.matches(regex, password);
    }



    public boolean verifyPasswordRuleFour(String password) {
        String regex = "^[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$";
        return Pattern.matches(regex, password);
    }
}

public class UserRegistration {
    public static void main(String[] args) {
        // User Name Verification
        UC userChecker = new UC();
        System.out.println(userChecker.verifyUser("MayankPal"));
        System.out.println(userChecker.verifyUser("pAl"));

        // Email Verification
        UC emailChecker = new UC();
        System.out.println(emailChecker.verifyEmail("mayankpal@gmail.com"));

        // Phone Number Verification
        UC phoneChecker = new UC();
        System.out.println(phoneChecker.verifyPhoneNumber("+91 70821916"));

        // Password Verification
        UC passwordRuleOne = new UC();
        System.out.println(passwordRuleOne.verifyPasswordRuleOne("mdjsnf3@"));

        UC passwordRuleTwo = new UC();
        System.out.println(passwordRuleTwo.verifyPasswordRuleTwo("Mdjsnf3@"));

        UC passwordRuleThree = new UC();
        System.out.println(passwordRuleThree.verifyPasswordRuleThree("Mdj3snf@"));

        UC passwordRuleFour = new UC();
        System.out.println(passwordRuleFour.verifyPasswordRuleFour("Mdjsnf3@"));
    }
}
