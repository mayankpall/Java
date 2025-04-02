package com.bridgelabz.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;


public class UserRegistrationTest {
    private UC userChecker;

    @BeforeEach
    void setUp() {
        userChecker = new UC();
    }

    // ✅ Happy Test Cases
    @Test
    void testValidFirstName() {
        assertTrue(userChecker.verifyUser("Mayank"));
    }

    @Test
    void testValidLastName() {
        assertTrue(userChecker.verifyUser("Pal"));
    }

    @Test
    void testValidEmail() {
        assertTrue(userChecker.verifyEmail("mayankpal@gmail.com"));
    }

    @Test
    void testValidPhoneNumber() {
        assertTrue(userChecker.verifyPhoneNumber("+91 7082519168"));
    }

    @Test
    void testValidPasswordRuleOne() {
        assertTrue(userChecker.verifyPasswordRuleOne("Valid123@"));
    }

    @Test
    void testValidPasswordRuleTwo() {
        assertTrue(userChecker.verifyPasswordRuleTwo("ValidPass1@"));
    }

    @Test
    void testValidPasswordRuleThree() {
        assertTrue(userChecker.verifyPasswordRuleThree("Valid123@"));
    }

    @Test
    void testValidPasswordRuleFour() {
        assertTrue(userChecker.verifyPasswordRuleFour("Valid@Pass"));
    }

    // ❌ Sad Test Cases
    @Test
    void testInvalidFirstName() {
        assertFalse(userChecker.verifyUser("ma"));
    }

    @Test
    void testInvalidLastName() {
        assertFalse(userChecker.verifyUser("p"));
    }

    @Test
    void testInvalidEmail() {
        assertFalse(userChecker.verifyEmail("mayankpal.gmail.com"));
    }

    @Test
    void testInvalidPhoneNumber() {
        assertFalse(userChecker.verifyPhoneNumber("+91 7082519"));
    }

    @Test
    void testInvalidPasswordRuleOne() {
        assertFalse(userChecker.verifyPasswordRuleOne("pass"));
    }

    @Test
    void testInvalidPasswordRuleTwo() {
        assertFalse(userChecker.verifyPasswordRuleTwo("password1"));
    }

    @Test
    void testInvalidPasswordRuleThree() {
        assertFalse(userChecker.verifyPasswordRuleThree("Password@"));
    }

    @Test
    void testInvalidPasswordRuleFour() {
        assertFalse(userChecker.verifyPasswordRuleFour("Password123"));
    }

    static Stream<Arguments> validEmails() {
        return Stream.of(
                Arguments.of("test@example.com", true),
                Arguments.of("mayank.pal@gmail.com", true),
                Arguments.of("user.name@domain.co.in", true),
                Arguments.of("invalid-email@", false),
                Arguments.of("plainaddress", false),
                Arguments.of("missing@dotcom", false)
        );
    }

//    @ParameterizedTest
//    @MethodSource("validEmails")
//    void testMultipleEmailValidation(String email, boolean expected) {
//        assertEquals(expected, userChecker.verifyEmail(email));
//    }
}
