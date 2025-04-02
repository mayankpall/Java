package com.bridgelabz.lambda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {
    private UserValidator validator;

    @BeforeEach
    void setUp() {
        validator = new UserValidator();
    }

    @Test
    void testValidFirstName() {
        assertDoesNotThrow(() -> validator.verifyFirstName("Mayank"));
    }

    @Test
    void testInvalidFirstName() {
        Exception exception = assertThrows(InvalidUserDetailException.class, () -> validator.verifyFirstName("ma"));
        assertEquals("Invalid First Name: ma", exception.getMessage());
    }

    @Test
    void testValidLastName() {
        assertDoesNotThrow(() -> validator.verifyLastName("Pal"));
    }

    @Test
    void testInvalidLastName() {
        Exception exception = assertThrows(InvalidUserDetailException.class, () -> validator.verifyLastName("p"));
        assertEquals("Invalid Last Name: p", exception.getMessage());
    }

    @Test
    void testValidEmail() {
        assertDoesNotThrow(() -> validator.verifyEmail("mayankpal@gmail.com"));
    }

    @Test
    void testInvalidEmail() {
        Exception exception = assertThrows(InvalidUserDetailException.class, () -> validator.verifyEmail("invalidemail@"));
        assertEquals("Invalid Email: invalidemail@", exception.getMessage());
    }

    @Test
    void testValidPhoneNumber() {
        assertDoesNotThrow(() -> validator.verifyPhoneNumber("+91 7082519168"));
    }

    @Test
    void testInvalidPhoneNumber() {
        Exception exception = assertThrows(InvalidUserDetailException.class, () -> validator.verifyPhoneNumber("7082519168"));
        assertEquals("Invalid Phone Number: 7082519168", exception.getMessage());
    }

    @Test
    void testValidPasswordRuleOne() {
        assertDoesNotThrow(() -> validator.verifyPasswordRuleOne("abcd1234@"));
    }

    @Test
    void testInvalidPasswordRuleOne() {
        Exception exception = assertThrows(InvalidUserDetailException.class, () -> validator.verifyPasswordRuleOne("pass"));
        assertEquals("Invalid Password : pass", exception.getMessage());
    }

//    @ParameterizedTest
//    @ValueSource(strings = {"test@example.com", "mayank.pal@gmail.com", "user.name@domain.co.in"})
//    void testValidEmails(String email) {
//        assertDoesNotThrow(() -> validator.verifyEmail(email));
//    }
//
//    @ParameterizedTest
//    @ValueSource(strings = {"invalid-email@", "plainaddress", "missing@dotcom"})
//    void testInvalidEmails(String email) {
//        assertThrows(InvalidUserDetailException.class, () -> validator.verifyEmail(email));
//    }
}
